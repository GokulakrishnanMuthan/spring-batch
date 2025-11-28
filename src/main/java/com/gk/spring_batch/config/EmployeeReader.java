package com.gk.spring_batch.config;

import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

import com.gk.spring_batch.entity.Employee;

@Configuration
public class EmployeeReader {
	
	@Value("${batch.file.path}")
	private String filePath;
	
	FlatFileItemReader<Employee> reader(){
		FlatFileItemReader<Employee> reader= new FlatFileItemReader<Employee>();
		reader.setResource(new FileSystemResource(filePath+"/employees.csv"));
		reader.setLinesToSkip(1); // To skip the header
		
		DelimitedLineTokenizer tokenizer=new DelimitedLineTokenizer();
		tokenizer.setDelimiter(",");
		tokenizer.setStrict(false); //ignore missing columns
		tokenizer.setNames("id","name","designation","basicSalary","hra","allowances","deductions","grossSalary","netSalary","month");
		
		//mapping class
		BeanWrapperFieldSetMapper<Employee> fieldMapper=new BeanWrapperFieldSetMapper<Employee>();
		fieldMapper.setTargetType(Employee.class);
		
		//mapping class and line class
		DefaultLineMapper<Employee> lineMapper=new DefaultLineMapper<Employee>();
		lineMapper.setLineTokenizer(tokenizer);
		lineMapper.setFieldSetMapper(fieldMapper);
		
		reader.setLineMapper(lineMapper);
		
		return reader;
	}
}

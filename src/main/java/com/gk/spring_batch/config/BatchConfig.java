package com.gk.spring_batch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

import com.gk.spring_batch.entity.Employee;

@Configuration
@EnableBatchProcessing
public class BatchConfig {
	
	
	private final EmployeeReader employeeReader;
	private final EmployeeItemProcessor employeeItemProcessor;
	private final EmployeeItemWriter employeeItemWriter;
	
	
	public BatchConfig(EmployeeReader employeeReader, EmployeeItemProcessor employeeItemProcessor,
			EmployeeItemWriter employeeItemWriter) {
		super();
		this.employeeReader = employeeReader;
		this.employeeItemProcessor = employeeItemProcessor;
		this.employeeItemWriter = employeeItemWriter;
	}
	
	
	@Bean
	public Step employeeStep(JobRepository jobRepository, PlatformTransactionManager manager) {
		return new StepBuilder("employeeStep",jobRepository)
				.<Employee,Employee>chunk(100,manager)
				.reader(employeeReader.reader())
				.processor(employeeItemProcessor)
				.writer(employeeItemWriter).build();
	}
	
	@Bean
	public Job employeeJob(JobRepository jobRepository, PlatformTransactionManager manager) {
		return new JobBuilder("employeeJob",jobRepository)
				.incrementer(new RunIdIncrementer())
				.start(employeeStep(jobRepository,manager))
				.build();
	}
	
	
}

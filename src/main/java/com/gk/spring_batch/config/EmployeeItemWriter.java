package com.gk.spring_batch.config;

import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import com.gk.spring_batch.entity.Employee;
import com.gk.spring_batch.repo.EmployeeRepository;

@Component
public class EmployeeItemWriter implements ItemWriter<Employee>{

	
	private final EmployeeRepository employeeRepository;
	
	public EmployeeItemWriter(EmployeeRepository respository)
	{
		this.employeeRepository=respository;
	}

	@Override
	public void write(Chunk<? extends Employee> chunk) throws Exception {
		employeeRepository.saveAll(chunk.getItems());		
	}
	
	
}

package com.gk.spring_batch.config;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.gk.spring_batch.entity.Employee;

@Component
public class EmployeeItemProcessor implements ItemProcessor<Employee, Employee>{

	@Override
	public Employee process(Employee item) throws Exception {
		
		double grossSalary= item.getBasicSalary() + item.getHra() + item.getAllownaces();
		
		double netSalary= grossSalary - item.getDeductions();
		
		item.setGrossSalary(grossSalary);
		item.setNetSalary(netSalary);
				
		return item;
	}

}

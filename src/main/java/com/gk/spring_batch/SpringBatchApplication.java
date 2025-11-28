package com.gk.spring_batch;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchApplication.class, args);
		
//		String csvFile = "D:\\employees.csv";
//        String[] names = {"John Doe","Jane Smith","Raj Kumar","Emily Davis","Michael Brown",
//                          "Sophia Wilson","David Johnson","Olivia Taylor","Daniel Thomas","Emma White"};
//        String[] designations = {"Software Engineer","Project Manager","QA Analyst","HR Specialist",
//                                 "DevOps Engineer","Business Analyst","UI Designer","Backend Developer","Data Scientist","Support Engineer"};
//        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
//
//        try (FileWriter writer = new FileWriter(csvFile)) {
//            writer.append("id,name,designation,basicSalary,hra,allowances,deductions,grossSalary,netSalary,month\n");
//
//            for (int i = 1; i <= 100000; i++) {
//                String name = names[i % names.length];
//                String designation = designations[i % designations.length];
//                double basicSalary = 40000 + (i * 500);
//                double hra = basicSalary * 0.2;
//                double allowances = 3000 + (i % 5) * 1000;
//                double deductions = 2000 + (i % 3) * 500;
//                double grossSalary = basicSalary + hra + allowances;
//                double netSalary = grossSalary - deductions;
//                String month = months[i % months.length];
//
//                writer.append(i + "," + name + "," + designation + "," + basicSalary + "," + hra + "," +
//                              allowances + "," + deductions + "," + grossSalary + "," + netSalary + "," + month + "\n");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


	}

}

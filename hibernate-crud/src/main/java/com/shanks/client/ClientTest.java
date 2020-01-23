package com.shanks.client;

import java.util.Date;

import com.shanks.entities.Employee;
import com.shanks.service.impl.EmployeeServiceImpl;

public class ClientTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		//createEmp(employeeServiceImpl);
		
		updateEmployee(employeeServiceImpl);
		getEmployeeId(employeeServiceImpl);
		deleteEmployee(employeeServiceImpl);
	}

	private static void deleteEmployee(EmployeeServiceImpl employeeServiceImpl) {
		// TODO Auto-generated method stub
		employeeServiceImpl.deteleEmpById(getEmployee());
	}

	private static void updateEmployee(EmployeeServiceImpl employeeServiceImpl) {
		// TODO Auto-generated method stub
		employeeServiceImpl.updateEmpById(1);
	}

	private static void createEmp(EmployeeServiceImpl employeeServiceImpl) {
		// TODO Auto-generated method stub
		employeeServiceImpl.createEmployee(getEmployee());
	}
	
	private static void getEmployeeId(EmployeeServiceImpl employeeServiceImpl) {
		Employee employee = employeeServiceImpl.getEmpById(1);
	}

	private static Employee getEmployee() {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setEmployeeName("Kulkarni");
		employee.setEmail("srk-1@gmail.com");
		employee.setSalary("1500000");
		employee.setDoj(new Date());

		return employee;
	}

}

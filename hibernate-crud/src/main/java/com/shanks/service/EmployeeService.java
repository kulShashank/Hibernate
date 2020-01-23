package com.shanks.service;

import com.shanks.entities.Employee;

public interface EmployeeService {

	public void createEmployee(Employee emp);

	public Employee getEmpById(int id);

	public void updateEmpById(int emp);

	public void deteleEmpById(Employee emp);

}

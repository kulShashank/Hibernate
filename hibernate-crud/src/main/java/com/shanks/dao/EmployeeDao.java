package com.shanks.dao;

import com.shanks.entities.Employee;

public interface EmployeeDao {

	public void createEmployee(Employee emp);

	public Employee getEmpById(int id);

	public void updateEmpById(int emp);

	public void deteleEmpById(Employee emp);

}

package com.shanks.service.impl;

import com.shanks.dao.impl.EmployeeDaoImpl;
import com.shanks.entities.Employee;
import com.shanks.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void createEmployee(Employee emp) {
		new EmployeeDaoImpl().createEmployee(emp);
	}

	@Override
	public Employee getEmpById(int id) {
		// TODO Auto-generated method stub
		return new EmployeeDaoImpl().getEmpById(id);
	}

	@Override
	public void updateEmpById(int emp) {
		// TODO Auto-generated method stub
		new EmployeeDaoImpl().updateEmpById(emp);
	}

	@Override
	public void deteleEmpById(Employee emp) {
		// TODO Auto-generated method stub

	}

}

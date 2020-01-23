package com.shanks.dao.impl;

import org.hibernate.Session;

import com.shanks.dao.EmployeeDao;
import com.shanks.entities.Employee;
import com.shanks.util.HibernateUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			session.beginTransaction();
			session.save(emp);
			session.getTransaction().commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Employee getEmpById(int id) {
		// TODO Auto-generated method stub
		Employee emp = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			session.beginTransaction();
			emp = session.get(Employee.class, id);
		}
		return emp;
	}

	@Override
	public void updateEmpById(int empId) {
		// TODO Auto-generated method stub
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			Employee emp = session.get(Employee.class, empId);
			if(emp != null) {
				session.beginTransaction();
				emp.setSalary("780000");
				session.update(emp);
				session.getTransaction().commit();
			} 
		}
	}

	@Override
	public void deteleEmpById(Employee emp) {
		// TODO Auto-generated method stub
		try(Session session =  HibernateUtil.getSessionFactory().openSession()) {
			Employee employee = session.get(Employee.class, 2);
			if(employee!= null) {
				session.beginTransaction();
				session.delete(employee);
				session.getTransaction().commit();
			}
		}
	}

}

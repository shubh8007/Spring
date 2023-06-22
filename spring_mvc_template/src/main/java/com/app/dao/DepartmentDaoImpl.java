package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Department;
@Repository//Mandotry annotations to tell SC:following is Spring Bean
//Containing data Acess Logic
public class DepartmentDaoImpl implements Departmentdao {
//dependancy:SF
	@Autowired//Mandtory Dependency :required =true,filed level D.I
	private SessionFactory sf;//Automatically Spring supplied 
	//LocalSessionFactoryBean
	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return sf.getCurrentSession().
				createQuery("select d from Department d",Department.class)
				.getResultList();
	}
	

}

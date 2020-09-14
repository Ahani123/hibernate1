package com.crud.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.crud.dto.StudentDTO;

public class StudentDAO {
	
	public static Session getSession()
	{
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(StudentDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		return session;
	}
	
	public void saveStudent(StudentDTO dto)
	{
		Session session=getSession();
		Transaction transaction = session.beginTransaction();
		session.save(dto);
		transaction.commit();
		System.out.println("data inserted successfully...........");
	}
	
	public StudentDTO getStudent(Long id)
	{
		Session session=getSession();
	return 	session.get(StudentDTO.class, id);
	}
	
	public void updateStudent(Long id,Long newMobileNumber)
	{
		StudentDTO studentDTO = getStudent(id);
		if(studentDTO!=null)
		{
		Session session=getSession();
		Transaction transaction = session.beginTransaction();
		studentDTO.setPhoneNumber(newMobileNumber);
		session.update(studentDTO);
		transaction.commit();
		System.out.println("updated succesfully......");
		}
	}
	
	public void deleteStudent(Long id)
	{
		StudentDTO studentDTO = getStudent(id);
		if(studentDTO!=null)
		{
			Session session = getSession();
			Transaction transaction = session.beginTransaction();
			studentDTO.setId(id);
			session.delete(studentDTO);
			transaction.commit();		
			System.out.println("deleted successfully.......");
		}
	}
}

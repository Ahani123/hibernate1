package com.crud.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.crud.dto.StudentDTO;

public class HqlDAO {
	
	public static Session getSession()
	{
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(com.crud.dto.StudentDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		return session;
	}
	
	public  List<StudentDTO> getDetails()
	{
		Session session=getSession();
		Query query = session.createQuery("from StudentDTO");
		List<StudentDTO> list = query.list();
		return list;
	}
	
	public StudentDTO getDetailsById(Long id)
	{
		Session session = getSession();
		Query query = session.createQuery("from StudentDTO where id=:rid");
		query.setParameter("rid", id);
		StudentDTO unique = (StudentDTO) query.uniqueResult();
		return unique;
		
	}
	
	public void updatePhoneNumberById(Long id,Long ph)
	{
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("update StudentDTO set phoneNumber=:ph where id=:id");
		query.setParameter("ph", ph);
		query.setParameter("id", id);
		query.executeUpdate();
		transaction.commit();
	}
	
	public void deleteById(Long id)
	{
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("delete StudentDTO where id=:id");
		query.setParameter("id", id);
		query.executeUpdate();
		transaction.commit();
	}
}

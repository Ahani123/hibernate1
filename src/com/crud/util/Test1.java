package com.crud.util;

import java.util.Iterator;
import java.util.List;

import com.crud.dao.HqlDAO;
import com.crud.dao.StudentDAO;
import com.crud.dto.StudentDTO;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * HqlDAO dao = new HqlDAO(); List<StudentDTO> list = dao.getDetails();
		 * 
		 * Iterator<StudentDTO> itr = list.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */
		
		/*
		 * StudentDTO dto = new StudentDTO(); dto.setName("muntaj");
		 * dto.setPhoneNumber(234287L); dto.setQualification("home_maker");
		 * dto.setAddress("pedda_malkapuram"); StudentDAO studentDAO = new StudentDAO();
		 * studentDAO.saveStudent(dto);
		 * 
		 */
		
		/*
		 * HqlDAO dao = new HqlDAO(); StudentDTO detailsById = dao.getDetailsById(3L);
		 * System.out.println(detailsById);
		 */
		
		HqlDAO dao = new HqlDAO();
		dao.deleteById(3L);
	}
}

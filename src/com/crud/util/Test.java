package com.crud.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crud.dao.StudentDAO;
import com.crud.dto.StudentDTO;

public class Test extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
	StudentDTO dto=new StudentDTO();
	dto.setName(req.getParameter("nm"));
	dto.setPhoneNumber(Long.parseLong(req.getParameter("ph")));
	dto.setAddress(req.getParameter("ad"));
	dto.setQualification(req.getParameter("ql"));
	StudentDAO dao1=new StudentDAO();
	dao1.saveStudent(dto);
	out.print("data inserted succesfully..............");
	
	}
}

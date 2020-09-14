package com.crud.dto;

import java.io.Serializable;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="student")
public class StudentDTO  implements Serializable{
	
	@Id
	@GenericGenerator(name="anything", strategy="increment")
	@GeneratedValue(generator = "anything")
	@Column(name="Id")
	private Long id;
	@Column(name="Name")
	private String name;
	@Column(name="PhoneNumber")
	private Long phoneNumber;
	@Column(name="Address")
	private String address;
	@Column(name="Qualification")
	private String qualification;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", address=" + address
				+ ", qualification=" + qualification + "]";
	}
	
	
	
}

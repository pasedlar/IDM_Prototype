package com.ach_services.eclipselink.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User_table implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private String edipi;
	private String first_name;
	private String middle_name;
	private String last_name;
	private String ssn;
	private String email;
	private String cell_number;
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String zip;
	private String zip_plus_5;
	
	
	public User_table(String edipi, String first_name, String middle_name, String last_name, String ssn, String email,
			String cell_number, String street1, String street2, String city, String state, String zip,
			String zip_plus_5) {
		super();
		this.edipi = edipi;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.ssn = ssn;
		this.email = email;
		this.cell_number = cell_number;
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.zip_plus_5 = zip_plus_5;
	}

	public User_table() {
		super();
	}
	
	public String getEdipi() {
		return edipi;
	}
	public void setEdipi(String edipi) {
		this.edipi = edipi;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCell_number() {
		return cell_number;
	}
	public void setCell_number(String cell_number) {
		this.cell_number = cell_number;
	}
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getZip_plus_5() {
		return zip_plus_5;
	}
	public void setZip_plus_5(String zip_plus_5) {
		this.zip_plus_5 = zip_plus_5;
	}

	@Override
	public String toString() {
		return "User_table [edipi=" + edipi + ", first_name=" + first_name + ", middle_name=" + middle_name
				+ ", last_name=" + last_name + ", ssn=" + ssn + ", email=" + email + ", cell_number=" + cell_number
				+ ", street1=" + street1 + ", street2=" + street2 + ", city=" + city + ", state=" + state + ", zip="
				+ zip + ", zip_plus_5=" + zip_plus_5 + "]";
	}

}

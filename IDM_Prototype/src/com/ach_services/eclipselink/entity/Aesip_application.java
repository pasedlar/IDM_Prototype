package com.ach_services.eclipselink.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "IDM_PROTOTYPE.AESIP_APPLICATION")
@NamedQuery(name="findAllAesipApplications", query = "SELECT OBJECT(apps) FROM Aesip_application apps")
public class Aesip_application implements Serializable {

	@Id
	@Column(name = "aesip_app_id")
	private String aesip_app_id;
	@Column(name = "aesip_app_name")	
	private String aesip_app_name;
	@Column(name = "aesip_app_description")	
	private String aesip_app_description;
	
	public Aesip_application(String aesip_app_id, String aesip_app_name, String aesip_app_description) {
		super();
		this.aesip_app_id = aesip_app_id;
		this.aesip_app_name = aesip_app_name;
		this.aesip_app_description = aesip_app_description;
	}

	public Aesip_application()	{
		super();
	}

	public String getAesip_app_id() {
		return aesip_app_id;
	}

	public void setAesip_app_id(String aesip_app_id) {
		this.aesip_app_id = aesip_app_id;
	}

	public String getAesip_app_name() {
		return aesip_app_name;
	}

	public void setAesip_app_name(String aesip_app_name) {
		this.aesip_app_name = aesip_app_name;
	}

	public String getAesip_app_description() {
		return aesip_app_description;
	}

	public void setAesip_app_description(String aesip_app_description) {
		this.aesip_app_description = aesip_app_description;
	}

	@Override
	public String toString() {
		return "Aesip_application [aesip_app_id=" + aesip_app_id + ", aesip_app_name=" + aesip_app_name
				+ ", aesip_app_description=" + aesip_app_description + "]";
	}
	
	
}

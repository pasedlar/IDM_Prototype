package com.ach_services.eclipselink.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "IDM_PROTOTYPE.AESIP_APPLICATION")
public class User_access implements Serializable {

	@Id
	
	private String edipi;
	private String aesip_app_id;
	private Date from_date;
	private Date to_date;
	private String date_limited;
	private String grantor_edipi;
	
	
	public User_access(String edipi, String aesip_app_id, Date from_date, Date to_date, String date_limited,
			String grantor_edipi) {
		super();
		this.edipi = edipi;
		this.aesip_app_id = aesip_app_id;
		this.from_date = from_date;
		this.to_date = to_date;
		this.date_limited = date_limited;
		this.grantor_edipi = grantor_edipi;
	}

	public User_access() {

	}

	public String getEdipi() {
		return edipi;
	}

	public void setEdipi(String edipi) {
		this.edipi = edipi;
	}

	public String getAesip_app_id() {
		return aesip_app_id;
	}

	public void setAesip_app_id(String aesip_app_id) {
		this.aesip_app_id = aesip_app_id;
	}

	public Date getFrom_date() {
		return from_date;
	}

	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}

	public Date getTo_date() {
		return to_date;
	}

	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}

	public String getDate_limited() {
		return date_limited;
	}

	public void setDate_limited(String date_limited) {
		this.date_limited = date_limited;
	}

	public String getGrantor_edipi() {
		return grantor_edipi;
	}

	public void setGrantor_edipi(String grantor_edipi) {
		this.grantor_edipi = grantor_edipi;
	}

	@Override
	public String toString() {
		return "User_access [edipi=" + edipi + ", aesip_app_id=" + aesip_app_id + ", from_date=" + from_date
				+ ", to_date=" + to_date + ", date_limited=" + date_limited + ", grantor_edipi=" + grantor_edipi + "]";
	}

	
	
}

package com.accionlabs.AMSCaps.domain;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name="agencydetails")
public class AmsCaps {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int agencyid;
	private String agencyname;
	private String agencytype;
	private String agencyaddress;
	private String agencydesc;
	private LocalDateTime created_date;
	private LocalDateTime modified_date;
	public AmsCaps() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AmsCaps(int agencyid, String agencyname, String agencytype, String agencyaddress, String agencydesc,
			LocalDateTime created_date, LocalDateTime modified_date) {
		super();
		this.agencyid = agencyid;
		this.agencyname = agencyname;
		this.agencytype = agencytype;
		this.agencyaddress = agencyaddress;
		this.agencydesc = agencydesc;
		this.created_date = created_date;
		this.modified_date = modified_date;
	}
	public int getAgencyid() {
		return agencyid;
	}
	public void setAgencyid(int agencyid) {
		this.agencyid = agencyid;
	}
	public String getAgencyname() {
		return agencyname;
	}
	public void setAgencyname(String agencyname) {
		this.agencyname = agencyname;
	}
	public String getAgencytype() {
		return agencytype;
	}
	public void setAgencytype(String agencytype) {
		this.agencytype = agencytype;
	}
	public String getAgencyaddress() {
		return agencyaddress;
	}
	public void setAgencyaddress(String agencyaddress) {
		this.agencyaddress = agencyaddress;
	}
	public String getAgencydesc() {
		return agencydesc;
	}
	public void setAgencydesc(String agencydesc) {
		this.agencydesc = agencydesc;
	}
	public LocalDateTime getCreated_date() {
		return created_date;
	}
	public void setCreated_date(LocalDateTime created_date) {
		this.created_date = created_date;
	}
	public LocalDateTime getModified_date() {
		return modified_date;
	}
	public void setModified_date(LocalDateTime modified_date) {
		this.modified_date = modified_date;
	}	
}

package com.cognixia.jump.models;

public class Department {
	
	private int id;
	
	private String depName;
	
	private String depPhone;

	public Department(int id, String depName, String depPhone) {
		super();
		this.id = id;
		this.depName = depName;
		this.depPhone = depPhone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getDepPhone() {
		return depPhone;
	}

	public void setDepPhone(String depPhone) {
		this.depPhone = depPhone;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", depName=" + depName + ", depPhone=" + depPhone + "]";
	}
	
	
	
	
	
	
	

}

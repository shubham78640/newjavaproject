package com.firstproject;

public class students {
	
	private int stdId;
	private String stdName;
	private String stdPhone;
	public students(int stdId, String stdName, String stdPhone) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdPhone = stdPhone;
	}
	public students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public students(String stdName, String stdPhone) {
		super();
		this.stdName = stdName;
		this.stdPhone = stdPhone;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	@Override
	public String toString() {
		return "students [stdId=" + stdId + ", stdName=" + stdName + ", stdPhone=" + stdPhone + "]";
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdPhone() {
		return stdPhone;
	}
	public void setStdPhone(String stdPhone) {
		this.stdPhone = stdPhone;
	}
	

}

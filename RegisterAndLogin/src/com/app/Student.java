package com.app;

public class Student 
{
	private int rollno;
	private String name;
	private String cls;
	private int batch;
	private String addr;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCls() {
		return cls;
	}
	public void setCls(String cls) {
		this.cls = cls;
	}
	public int getBatch() {
		return batch;
	}
	public void setBatch(int batch) {
		this.batch = batch;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	// Default Constructor
	 public Student(){
	 super();
	 }
	 // Parameterized Constructor
	 public Student(int rollno, String name, String cls, int batch,
	 String addr) {
	 super();
	 this.rollno = rollno;
	 this.name = name;
	 this.cls = cls;
	 this.batch = batch;
	 this.addr = addr;
	 }
}

package com.hema.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employ")

public class Employ {
	
	private int empno;
	private String name;
	private String dept;
	private String desig;
	private int basic;
	
	@Id
	@Column(name="Empno")
	public int getEmpno() {
		return empno;
	}
	@Column(name="Empno")
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	@Column(name="Name")
	public String getName() {
		return name;
	}
	@Column(name="Name")
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="Dept")
	public String getDept() {
		return dept;
	}
	@Column(name="Dept")
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Column(name="Desig")
	public String getDesig() {
		return desig;
	}
	@Column(name="Desig")
	public void setDesig(String desig) {
		this.desig = desig;
	}
	@Column(name="Basic")
	public int getBasic() {
		return basic;
	}
	@Column(name="Basic")
	public void setBasic(int basic) {
		this.basic = basic;
	}

}

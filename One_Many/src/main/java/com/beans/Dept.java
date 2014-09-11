package com.beans;

import java.util.Set;

import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Dept {
	@Id
	private int deptno;

	private String dname;

	private String loc;

	@OneToMany(mappedBy = "dept")
	Set<Employee> set;

	public Set<Employee> getSet() {
		return set;
	}

	public void setSet(Set<Employee> set) {
		this.set = set;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

}

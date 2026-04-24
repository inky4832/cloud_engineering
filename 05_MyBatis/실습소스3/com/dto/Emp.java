package com.dto;

import org.apache.ibatis.type.Alias;

@Alias("EmpDTO")
public class Emp {

	int empno;
	String username;  // 실제 컬럼명은 ename
	String job;
	int mgr;
	String hiredate;
	int salary;       //실제 컬럼명은 sal
	int commission;    // 실제 컬럼명은 comm
 	int deptno;
 	
	public Emp() {}

	public Emp(int empno, String username, String job, int mgr, String hiredate, int salary, int commission,
			int deptno) {
		this.empno = empno;
		this.username = username;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.salary = salary;
		this.commission = commission;
		this.deptno = deptno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", username=" + username + ", job=" + job + ", mgr=" + mgr + ", hiredate="
				+ hiredate + ", salary=" + salary + ", commission=" + commission + ", deptno=" + deptno + "]";
	}
 	
}

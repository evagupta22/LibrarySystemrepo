package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeDetails {
	@Id
	private int empId;
	private String empName;
	private String empDept;
	private String empTech;

	public EmployeeDetails() {
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getEmpTech() {
		return empTech;
	}

	public void setEmpTech(String empTech) {
		this.empTech = empTech;
	}
	
	@Override
	public String toString() {
		return "EmployeeDetails [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empTech="
				+ empTech + "]";
	}
}
package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {
	@Id
	private int laptopModel;
	private String companyName;
	
	public Laptop() {
	}

	public int getLaptopModel() {
		return laptopModel;
	}

	public void setLaptopModel(int laptopModel) {
		this.laptopModel = laptopModel;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Laptop [laptopModel=" + laptopModel + ", companyName=" + companyName + "]";
	}
}
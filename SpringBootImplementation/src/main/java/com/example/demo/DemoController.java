package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.dao.EmployeeRepository;
import com.example.demo.model.EmployeeDetails;

@Controller
public class DemoController {
	EmployeeRepository repo;
	
	@RequestMapping("/view")
	public String viewEmployee(EmployeeDetails empDetails) {
		System.out.println("Checking multiple inputs  from user"+empDetails);
		return "view";
	}
	@RequestMapping("/insert")
	public String addEmployeeRecords(EmployeeDetails empDetails) {
		System.out.println("Checking inputs  from user"+empDetails);
		repo.save(empDetails);
		return "index";
	}
	@RequestMapping("/fetch")
	public String getEmployeeDetails(EmployeeDetails empDetails) {
		return "view";
	}
}
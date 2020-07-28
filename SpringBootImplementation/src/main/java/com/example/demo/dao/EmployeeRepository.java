package com.example.demo.dao;
//import java.util.List;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.EmployeeDetails;

public interface EmployeeRepository extends CrudRepository<EmployeeDetails, Integer>{
	/*how can one find records based on column value which is not primary key
		List<EmployeeDetails> findByEmpTechnology(String technology);
		
		List<EmployeeDetails> findByEmpIdGreaterThan(int empId);
		
		@Query("from EmployeeDetails where empTech=?1 order by empName")
		List<EmployeeDetails> findByEmpTechnoogySorted(String empTech);*/
}

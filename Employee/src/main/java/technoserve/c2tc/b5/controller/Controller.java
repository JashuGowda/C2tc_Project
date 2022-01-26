package technoserve.c2tc.b5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import technoserve.c2tc.b5.Service.EmployeeService;
import technoserve.c2tc.b5.entities.Employee;

@RestController
public class Controller {
	@Autowired
	EmployeeService es;
	
	@PostMapping("/addEmployee")
	public void addEmployee(@RequestBody Employee e) {
		es.addEmployee(e);
		
	}
	@PutMapping("/updateEmployee")
	public void updateEmployee(@RequestBody Employee e) {
		es.updateEmployee(e);
		
	}@GetMapping("/getEmployee/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return es.getEmployee(id);
		
	}
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return es.deleteEmployee(id);
		
	}


}

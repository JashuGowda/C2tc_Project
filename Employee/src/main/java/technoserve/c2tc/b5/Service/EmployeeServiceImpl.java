package technoserve.c2tc.b5.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import technoserve.c2tc.b5.Repo.EmployeeRepo;
import technoserve.c2tc.b5.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepo er;
	

	@Override
	public void addEmployee(Employee e) {
		er.save(e);
	}
	

	@Override
	public void updateEmployee(Employee e) {
		er.save(e);
		
	}


	@Override
	public Employee getEmployee(int id) {
		return er.findById(id).get();
	}


	@Override
	public String deleteEmployee(int id) {
		Employee e = er.findById(id).get();
		er.delete(e);
		return " The Employee with id=" + id + " is successfully deleted";
	}


	

	
		
	}
	



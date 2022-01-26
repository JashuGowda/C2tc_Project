package technoserve.c2tc.b5.Service;

import technoserve.c2tc.b5.entities.Employee;

public interface EmployeeService {
	public void addEmployee(Employee e);
	public void updateEmployee(Employee e);
	public Employee getEmployee(int id);
	public String deleteEmployee(int id);

}

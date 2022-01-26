package technoserve.c2tc.b5.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import technoserve.c2tc.b5.entities.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}

package com.techelevator.projects;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.jdbc.JDBCEmployeeDAO;

public class JDBCEmployeeDAOIntegrationTest extends DAOIntegrationTest{

	private JDBCEmployeeDAO dao;

	
	@Before
	public void setup() {
		dao = new JDBCEmployeeDAO(getDataSource());
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		String sqlInsertEmployee1 = "INSERT INTO employee (employee_id, department_id, first_name, last_name, birth_date, gender, hire_date) " + 
				"VALUES (21, 1, 'Bob', 'Test', '1990-12-28', 'F', '2011-08-01')";
		String sqlInsertEmployee2 = "INSERT INTO employee (employee_id, department_id, first_name, last_name, birth_date, gender, hire_date) " + 
				"VALUES (22, 2, 'Jo', 'Fud', '1980-07-14', 'M', '1998-09-01');";
		jdbcTemplate.update(sqlInsertEmployee1);
		jdbcTemplate.update(sqlInsertEmployee2);
	}
	
	@Test
	public void testGetAllEmployees() {
		LocalDate bday1 = LocalDate.of(1990, 12, 28);
		LocalDate hday1 = LocalDate.of(2011, 8, 01);
		LocalDate bday2 = LocalDate.of(1980, 7, 14);
		LocalDate hday2 = LocalDate.of(1998, 9, 01);

		Employee expectedEmployee1 = createEmployee(1L, "Bob", "Test", bday1, 'F', hday1);
		Employee expectedEmployee2 = createEmployee(2L, "Jo", "Fud", bday2, 'M', hday2);

		
		List<Employee> actualEmployees = dao.getAllEmployees();
		
		assertEmployeeIsEqual(expectedEmployee1, actualEmployees.get(12));
		assertEmployeeIsEqual(expectedEmployee2, actualEmployees.get(13));
	}
	
	@Test
	public void testSearchByEmployeeName() {
		LocalDate bday1 = LocalDate.of(1990, 12, 28);
		LocalDate hday1 = LocalDate.of(2011, 8, 01);
		Employee expectedEmployee1 = createEmployee(1L, "Bob", "Test", bday1, 'F', hday1);
		
		List<Employee> actualEmployees = dao.searchEmployeesByName("Bob", "Test");
		
		assertEmployeeIsEqual(expectedEmployee1, actualEmployees.get(0));
	}
	
	@Test
	public void testSearchByDepartmentId() {
		LocalDate bday1 = LocalDate.of(1990, 12, 28);
		LocalDate hday1 = LocalDate.of(2011, 8, 01);
		Employee expectedEmployee1 = createEmployee(1L, "Bob", "Test", bday1, 'F', hday1);
		
		List<Employee> actualEmployees = dao.getEmployeesByDepartmentId(1L);
		
		assertEmployeeIsEqual(expectedEmployee1, actualEmployees.get(1));
	}
	
	@Test
	public void testEmployeeChangedDepartments() {
		LocalDate bday1 = LocalDate.of(1990, 12, 28);
		LocalDate hday1 = LocalDate.of(2011, 8, 01);
		Employee expectedEmployee1 = createEmployee(1L, "Bob", "Test", bday1, 'F', hday1);
		expectedEmployee1.setDepartmentId(2L);
		List<Employee> employees = dao.searchEmployeesByName("Bob", "Test");
		Long employeeId = employees.get(0).getId();
		
		dao.changeEmployeeDepartment(employeeId, 2L);
		List<Employee> actualEmployee = dao.searchEmployeesByName("Bob", "Test");
		
		assertEmployeeIsEqual(expectedEmployee1, actualEmployee.get(0));
	}
	
	
	
	private void assertEmployeeIsEqual(Employee expected, Employee actual) {
		assertEquals(expected.getDepartmentId(), actual.getDepartmentId());
		assertEquals(expected.getFirstName(), actual.getFirstName());
		assertEquals(expected.getLastName(), actual.getLastName());
		assertEquals(expected.getBirthDay(), actual.getBirthDay());
		assertEquals(expected.getGender(), actual.getGender());
		assertEquals(expected.getHireDate(), actual.getHireDate());
	}
	
	private Employee createEmployee(Long departmentId,
	String firstName,
	String lastName,
	LocalDate birthDay,
	char gender,
	LocalDate hireDate) {
		Employee employee = new Employee();
		employee.setDepartmentId(departmentId);
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setBirthDay(birthDay);
		employee.setGender(gender);
		employee.setHireDate(hireDate);
		return employee;
	}

}

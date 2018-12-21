package com.techelevator.projects;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.jdbc.JDBCDepartmentDAO;


public class JDBCDepartmentDAOIntegrationTest extends DAOIntegrationTest{
	
	private JDBCDepartmentDAO dao;

	
	@Before
	public void setup() {
		dao = new JDBCDepartmentDAO(getDataSource());
	}
	
	@Before
	public void cleanDatabase() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		jdbcTemplate.update("DELETE FROM project_employee");
		jdbcTemplate.update("DELETE FROM employee");
		jdbcTemplate.update("DELETE FROM department");
		String sqlInsertDepartment1 = "INSERT INTO department (name) VALUES ('Department of Redundancy')";
		String sqlInsertDepartment2 = "INSERT INTO department (name) VALUES ('Network Administration')";
		jdbcTemplate.update(sqlInsertDepartment1);
		jdbcTemplate.update(sqlInsertDepartment2);

		
	}
	
	@Test
	public void testDepartmentsAreEqual() {
		Department expectedDepartment1 = createDepartment("Department of Redundancy");
		Department expectedDepartment2 = createDepartment("Network Administration");
		
		List<Department> actualDepartments = dao.getAllDepartments();
		
		assertDepartmentIsEqual(expectedDepartment1, actualDepartments.get(0));
		assertDepartmentIsEqual(expectedDepartment2, actualDepartments.get(1));
	}
	
	@Test
	public void testDepartmentSearchIsEqual() {
		Department expectedDepartment1 = createDepartment("Department of Redundancy");
		
		List<Department> actualDepartments = dao.searchDepartmentsByName("Department of Redundancy");
		
		assertDepartmentIsEqual(expectedDepartment1, actualDepartments.get(0));
	}
	
	@Test
	public void testSavedDepartmentIsEqual() {
		Department expectedDepartment1 = createDepartment("Department of Redundancy");
		List<Department> departments = dao.searchDepartmentsByName("Department of Redundancy");
		expectedDepartment1.setId(departments.get(0).getId());
		expectedDepartment1.setName("Department of Saving");
		
		dao.saveDepartment(expectedDepartment1);
		List<Department> actualDepartments = dao.searchDepartmentsByName("Department of Saving");
		
		assertDepartmentIsEqual(expectedDepartment1, actualDepartments.get(0));
	}
	
	
	@Test
	public void testCreatedDepartmentIsEqual() {
		Department expectedDepartment1 = createDepartment("Department of Creation");
		
		dao.createDepartment(expectedDepartment1);
		List<Department> actualDepartments = dao.getAllDepartments();
		
		assertDepartmentIsEqual(expectedDepartment1, actualDepartments.get(2));
	}
	
	
	
	private void assertDepartmentIsEqual(Department expected, Department actual) {
		assertEquals(expected.getName(), actual.getName());
	}
	
	private Department createDepartment(String name) {
		Department department = new Department();
		department.setName(name);
		return department;
	}

}

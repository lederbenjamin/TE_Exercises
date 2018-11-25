package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;


import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.EmployeeDAO;

public class JDBCEmployeeDAO implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCEmployeeDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT employee_id, department_id, first_name, last_name, birth_date, gender, hire_date FROM employee";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while(results.next()) {
			employees.add(mapRowToEmployee(results));
		}
		return employees;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		ArrayList<Employee> employees = new ArrayList<>();
		String sqlSearchEmployeesByName = "SELECT employee_id, department_id, first_name, last_name, birth_date, gender, hire_date "+
										   "FROM employee "+
										   "WHERE first_name LIKE ? AND last_name LIKE ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSearchEmployeesByName, firstNameSearch, lastNameSearch);
		while(results.next()) {
			employees.add(mapRowToEmployee(results));
		}
		return employees;
	}

	@Override
	public List<Employee> getEmployeesByDepartmentId(long id) {
		ArrayList<Employee> employees = new ArrayList<>();
		String sqlGetEmployeesByDepartmentId = "SELECT employee_id, department_id, first_name, last_name, birth_date, gender, hire_date "+
										   "FROM employee "+
										   "WHERE department_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetEmployeesByDepartmentId, id);
		while(results.next()) {
			employees.add(mapRowToEmployee(results));
		}
		return employees;
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		ArrayList<Employee> employees = new ArrayList<>();
		String sqlGetEmployeesWithoutProjects = "SELECT e.employee_id, e.department_id, e.first_name, e.last_name, e.birth_date, e.gender, e.hire_date "+
										   "FROM employee e "+
										   "FULL OUTER JOIN project_employee pe "+
										   "ON e.employee_id = pe.project_id "+
										   "WHERE pe.project_id IS NULL"			;
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetEmployeesWithoutProjects);
		while(results.next()) {
			employees.add(mapRowToEmployee(results));
		}
		return employees;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) {
		ArrayList<Employee> employees = new ArrayList<>();
		String sqlGetEmployeesByProjectId = "SELECT e.employee_id, e.department_id, e.first_name, e.last_name, e.birth_date, e.gender, e.hire_date "+
										   "FROM employee e "+
										   "LEFT JOIN project_employee pe "+
										   "ON e.employee_id = pe.project_id "+
										   "WHERE pe.project_id = ?"			;
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetEmployeesByProjectId, projectId);
		while(results.next()) {
			employees.add(mapRowToEmployee(results));
		}
		return employees;
	}

	@Override
	public void changeEmployeeDepartment(Long employeeId, Long departmentId) {
		String sql = "UPDATE employee SET department_id = ? WHERE employee_id = ?";
		jdbcTemplate.update(sql, departmentId, employeeId);
		
	}
	
	private Employee mapRowToEmployee(SqlRowSet results) {
		Employee theEmployee;
		theEmployee = new Employee();
		theEmployee.setId(results.getLong("employee_id"));
		theEmployee.setDepartmentId(results.getLong("department_id"));
		theEmployee.setFirstName(results.getString("first_name"));
		theEmployee.setLastName(results.getString("last_name"));
		theEmployee.setBirthDay(results.getDate("birth_date").toLocalDate());
		theEmployee.setGender(results.getString("gender").charAt(0));
		theEmployee.setHireDate(results.getDate("hire_date").toLocalDate());
		return theEmployee;
	}

}

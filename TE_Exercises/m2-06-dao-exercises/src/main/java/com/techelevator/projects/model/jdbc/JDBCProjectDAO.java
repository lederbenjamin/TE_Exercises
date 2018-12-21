package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;
import com.techelevator.projects.model.ProjectDAO;

public class JDBCProjectDAO implements ProjectDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCProjectDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Project> getAllActiveProjects() {
		ArrayList<Project> allActiveProjects = new ArrayList<>();
		String sqlAllActiveProjects = "SELECT project_id, name "+
				"FROM project "+
				"WHERE from_date <= current_date AND to_date > current_date "+
				"OR from_date <= current_date AND to_date is null";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlAllActiveProjects);
		while (results.next()) {
			allActiveProjects.add(mapRowToProject(results));
		}
		return allActiveProjects;
	}

	@Override
	public void removeEmployeeFromProject(Long projectId, Long employeeId) {
		String sqlInsertEmployee = "DELETE FROM project_employee " + "WHERE project_id = ? " + "AND employee_id = ?";
		jdbcTemplate.update(sqlInsertEmployee, projectId, employeeId);
	}

	@Override
	public void addEmployeeToProject(Long projectId, Long employeeId) {
		String sqlInsertEmployee = "INSERT INTO project_employee(project_id, employee_id) " + "VALUES(?, ?)";
		jdbcTemplate.update(sqlInsertEmployee, projectId, employeeId);
	}

	private Project mapRowToProject(SqlRowSet results) {
		Project theProject;
		theProject = new Project();
		theProject.setId(results.getLong("project_id"));
		theProject.setName(results.getString("name"));
		return theProject;
	}
}

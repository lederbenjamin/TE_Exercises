CREATE TABLE department
(
	department_number	serial                  not null,
	department_name		varchar(50)             not null,
	employee_headcount	integer	                not null,
	
	CONSTRAINT pk_department_number PRIMARY KEY (department_number)	
);

CREATE TABLE department_employee 
(
        department_number            integer                 not null,
        employee_number              integer                 not null,
        
        CONSTRAINT pk_department_employee PRIMARY KEY(department_number, employee_number)
);

CREATE TABLE employee
(
     employee_number            serial                  not null,
     job_title		        varchar(50)		not null,
     last_name	                varchar(50)	        not null,
     first_name		        varchar(50)	        not null,
     gender                     varchar(25)	        not null,
     birthday                   date    	        not null,
     hire_date                  date    	        not null,
     department                 varchar(25)	        not null,
     
     CONSTRAINT pk_employee_number PRIMARY KEY (employee_number)
);

CREATE TABLE employee_project 
(
        
        employee_number              integer                 not null,
        project_number               integer                 not null,
        
        CONSTRAINT pk_employee_project PRIMARY KEY(employee_number, project_number)
); 

CREATE TABLE project
(
	project_number		serial                  not null,
	project_name		varchar(50)		not null,
	start_date		date		        not null,
        employees_working	integer		        not null,
       
	constraint pk_project_number primary key (project_number)
);


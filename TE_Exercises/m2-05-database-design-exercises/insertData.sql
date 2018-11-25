INSERT INTO department (department_name, employee_headcount) VALUES
    ('SALES', 2),
    ('ENGINEERING', 4),
    ('HR', 2);
    
INSERT INTO employee (job_title, last_name, first_name, gender, birthday, hire_date, department) VALUES
    ('Engineer', 'Smith', 'John', 'male', '1990-09-01', '2018-01-03', 'ENGINEERING'),
    ('Engineer', 'Doe', 'Jane', 'female', '1990-09-02', '2018-01-04', 'ENGINEERING'),
    ('Engineer', 'Sue', 'Sally', 'female', '1990-09-03', '2018-01-05', 'ENGINEERING'),
    ('Engineer', 'Carter', 'Coach', 'male', '1990-09-05', '2018-01-06', 'ENGINEERING'),
    ('Account Manager', 'Shmo', 'Joe', 'male', '1990-09-06', '2018-01-07', 'SALES'),
    ('Account Manager', 'Stink', 'Jill', 'female', '1990-09-07', '2018-01-08', 'SALES'),
    ('HR Manager', 'Sucks', 'Karen', 'female', '1990-09-08', '2018-01-02', 'HR'),
    ('President', 'Bates', 'Gill', 'male', '1990-09-09', '2017-01-01', 'HR');

INSERT INTO project (project_name, start_date, employees_working) VALUES
    ('GetMoney App', '2018-02-01', 4),
    ('SalesDriver App', '2018-02-01', 4),
    ('Vendor Aquisition', '2018-02-01', 2),
    ('Training', '2018-02-01', 6);
    
INSERT INTO employee_project (employee_number, project_number) VALUES
    (1, 1),
    (2, 1),
    (3, 1),
    (4, 1),
    (1, 2),
    (2, 2),
    (3, 2),
    (4, 2),
    (5, 3),
    (6, 3),
    (7, 4),
    (8, 4);
    
INSERT INTO department_employee (department_number, employee_number) VALUES
    (2, 1),
    (2, 2),
    (2, 3),
    (2, 4),
    (1, 5),
    (1, 6),
    (3, 7),
    (3, 8);
           
       
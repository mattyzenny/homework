DROP TABLE IF EXISTS date;
DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS department;
DROP TABLE IF EXISTS project;

BEGIN TRANSACTION;

CREATE TABLE employee
(
employeeId SERIAL,
firstName VARCHAR(100) NOT NULL,
lastName VARCHAR(100) NOT NULL, 
gender CHAR(1) NOT NULL,
jobTitle VARCHAR(100) NOT NULL,

        CONSTRAINT pk_employee PRIMARY KEY (employeeId)
);

CREATE TABLE department
(
departmentId SERIAL,
name VARCHAR (100) NOT NULL,
numberOfEmployees INT,

        CONSTRAINT pk_department PRIMARY KEY (departmentId)
);


CREATE TABLE project
(
projectId SERIAL,
projectName VARCHAR(100) NOT NULL,
numberOnProject INT NOT NULL,
departmentId INT NOT NULL,

        CONSTRAINT pk_project PRIMARY KEY (projectId),
        CONSTRAINT departmentId FOREIGN KEY (departmentId) REFERENCES department(departmentId)
 );


CREATE TABLE date
(
employeeId INT,
projectId INT,
startDate TIMESTAMP NOT NULL,
birthDate TIMESTAMP NOT NULL,
projectDate TIMESTAMP NOT NULL,

        CONSTRAINT pk_date PRIMARY KEY (employeeId, projectId),
        CONSTRAINT fk_date_employee FOREIGN KEY (employeeId) REFERENCES employee (employeeId),
        CONSTRAINT fk_date_project FOREIGN KEY(projectId) REFERENCES project (projectId)
        
);


INSERT INTO employee (firstName, lastName, gender, jobTitle)
VALUES ('John', 'Smith', 'M', 'TechMaster'),
('Mike', 'Young', 'M', 'ScrumMeister'),
('Sara', 'Jenkins', 'F', 'Manager'),
('Bethany', 'Walsh', 'F', 'Coordinator'),
('Natalia', 'Kavun', 'F', 'Lead Instructor'),
('Ben', 'Shapiro', 'M', 'Architetor'),
('Donald', 'Crump', 'M', 'Organizational Manager'),
('Bert', 'AnErnie', 'M', 'Lead Developer');

INSERT INTO department (name, numberOfEmployees)
VALUES ('Scranton', 600),
('Millsap', 300),
('Funstown', 1000);


INSERT INTO project (projectName, numberOnProject, departmentId)
VALUES ('The invention of Rollback beta version', 5, 2),
('New tool for Java', 300, 3),
('New synthetic/hybrid paper', 1, 1),
('Dwights Invention', 25, 1);


INSERT INTO date (employeeId, projectId, startDate, birthDate, projectDate)
VALUES (1, 2, '2005-01-01', '1990-01-01', CURRENT_TIMESTAMP),
(3, 1, '2015-12-23', '2000-05-25', CURRENT_TIMESTAMP),
(1, 1, '2003-12-25', '1990-12-25', '2017-03-20');


ROLLBACK;
COMMIT;
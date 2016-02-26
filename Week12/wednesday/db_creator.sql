CREATE TABLE Departments(
	DepartmentID int PRIMARY KEY,
	DepartmentName varchar(20) PRIMARY KEY
);

CREATE TABLE Employee (
	EmployeeID int PRIMARY KEY,
	EmployeeName varchar(40) PRIMARY KEY, 
	EmployeeEmail varchar(20),
	DateOfBirth date,
	Manager varchar(20) REFERENCES Employee(EmployeeName),
	DepartmentID int REFERENCES Departments(DepartID)
);

CREATE TABLE Categories ( 
	Code varchar(3) PRIMARY KEY,
	CategoryName varchar(40)
);

CREATE TABLE Product (
	ProductName varchar(40) PRIMARY KEY,
	SinglePrice int,
	Category varchar(40) REFERENCES Categories(CategoryName)
);

CREATE TABLE Custemers (
	CustemerName varchar(40) PRIMARY KEY,
	CustemerEmail varchar(20),
	CustemerAddres varchar(50),
	CustemerDiscount int
);

CREATE TABLE Orders (
	OrderDateAndTime date,
	OrderCustumer varchar(40) REFERENCES Custemers(CustemerName),
	OrdersTottalPrice int,

);

CREATE TABLE OrderProducts (
	ProductName
);




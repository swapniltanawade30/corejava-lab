package com.EmployeeManagmentSystem.Ems;

import com.EmployeeManagmentSystem.model.Employee;

public interface EmployeeEms {
	void addEmpolyee();

	boolean deleteEmpolyee(int id);

	boolean updateEmployee(int id, Employee e);

	Employee findEmployee(int id);

	void displayAll();
}

package com.EmployeeManagmentSystem.EmsImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.EmployeeManagmentSystem.Ems.EmployeeEms;
import com.EmployeeManagmentSystem.model.Employee;

public class EmployeeEmsImpl implements EmployeeEms {
	List<Employee> eList = new ArrayList<Employee>();
	// creating Scanner Object
	Scanner sc = new Scanner(System.in);

	public void addEmpolyee() {
		// TODO Auto-generated method stub
		// creating employees object
		Employee ee = new Employee();
		// input the details of student
		System.out.println("Enter the Employee id :");
		ee.setId(sc.nextInt());
		System.out.println("Enter the Employee name :");
		ee.setName(sc.next());
		System.out.println("Enter the Salary :");
		ee.setSalary(sc.nextFloat());

		// adding the employees into the collection
		eList.add(ee);
		System.out.println(eList);

	}

	public boolean deleteEmpolyee(int id) {
		// TODO Auto-generated method stub
		boolean status = false;
		Employee edel = null;
		// finding the student
		for (Employee e : eList) {
			if (e.getId() == id)
				edel = e;
		}
		// check whether the record is present
		if (edel == null)
			status = false;
		else {
			eList.remove(edel);
			status = true;
		}

		return status;
	}

	public boolean updateEmployee(int id, Employee e) {
		// TODO Auto-generated method stub
		return false;
	}

	public Employee findEmployee(int id) {
		// TODO Auto-generated method stub
		Employee efind = null;
		// finding the student
		for (Employee e : eList) {
			if (e.getId() == id)
				efind = e;
		}

		return efind;
	}

	public void displayAll() {
		// TODO Auto-generated method stub
		for (Employee e : eList) {
			System.out.println(e);
		}

	}

}
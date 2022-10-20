package com.EmployeeManagmentSystem;

import java.util.Scanner;

import com.EmployeeManagmentSystem.Ems.EmployeeEms;
import com.EmployeeManagmentSystem.EmsImpl.EmployeeEmsImpl;
import com.EmployeeManagmentSystem.model.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void menu() {
		System.out.println("MENU:");
		System.out.println("1. Add Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Search Employee");
		System.out.println("5. Display all the Employee");
		System.out.println("6.Exit");
	}

	public static void main(String[] args) {

		// creating Scanner Object
		Scanner sc1 = new Scanner(System.in);
		// creating object of impl
		EmployeeEms company = new EmployeeEmsImpl();

		// declaring varible choice
		try {
			int ch = 0;
			do {
				menu();
				ch = sc1.nextInt();
				int Empid;
				switch (ch) {
				case 1:
					company.addEmpolyee();
					System.out.println("Employee inserted..........");
					break;
				case 2:
					System.out.println("Enter the Employee Id to be deleted:");
					int id = sc1.nextInt();
					boolean flag = company.deleteEmpolyee(id);
					if (flag)
						System.out.println("Employee deleted.......");
					else
						System.out.println("No Employee found......");
					break;
				case 4:
					Employee em = null;
					System.out.println("Enter the Id to be searched:");
					id = sc1.nextInt();
					em = company.findEmployee(id);
					if (em == null)
						System.out.println("Employee not found.......");
					else
						System.out.println(
								"Student Id :" + em.getId() + "  Name:" + em.getName() + "   Marks:" + em.getSalary());
					break;

				case 5:
					Employee.displayAll();
					break;

				case 6:
					System.exit(0);
					break;
				default:
					System.out.println("Wrong input.......");

				}

			} while (ch != 6);

			// end of do while

			sc1.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

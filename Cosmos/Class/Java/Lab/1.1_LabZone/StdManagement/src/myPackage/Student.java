package myPackage;

import java.util.Scanner;

public class Student {
	/*
	 * Here we made all these variable and the 'sc' object static so that they are
	 * shared by all instances and we can access them without creating instances
	 * (objects)
	 */
	static String[] Name = new String[100]; // size of array = 100
	static int[] age = new int[100];
	static int[] rollNumber = new int[100];
	static int count = 0;

	static Scanner sc = new Scanner(System.in);

	static void addDetails() {
		System.out.print("Enter name: ");
		Name[count] = sc.next();

		System.out.print("Enter age: ");
		age[count] = sc.nextInt();

		System.out.print("Enter roll no.:");
		rollNumber[count] = sc.nextInt();

		count++;
		System.out.println("Student added successfully!");
	}

	static void searchStudentsByRoll() {
		System.out.print("\nEnter roll to be searched: ");
		int roll = sc.nextInt();
		for (int i = 0; i < count; i++) {
			if (roll == rollNumber[i])
				System.out.println(
						"\nDetail of student having roll no " + roll + "\n" + roll + "\t" + Name[i] + "\t" + age[i]);
		}
	}

	static void showAll() {
		System.out.print("\n.....Student Details.....\n");
		for (int i = 0; i < count; i++) {
			System.out.println(rollNumber[i] + "\t" + Name[i] + "\t" + age[i]);
		}
	}

	static void avgAge() {
		int ageSum = 0;
		for (int i = 0; i < count; i++) {
			ageSum += age[i];
		}

		double avgAge = (double) ageSum / count;

		System.out.println("\nAverage age of students is " + avgAge);
	}

	public static void main(String[] args) {
		while (true) {
			System.out.println(
					"\nEnter\n 1 for adding student details: \n 2 for showing all students: \n 3 for searching students by roll no: \n 4 for getting average age of students: \n 5 for exit: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				addDetails();
				break;
			case 2:
				showAll();
				break;
			case 3:
				searchStudentsByRoll();
				break;
			case 4:
				avgAge();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Please enter valid choice!!");
			}
		}
	}
}

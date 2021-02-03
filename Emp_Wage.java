package java_practice;

public class Emp_Wage {
	public static void main(String args[]) {
		final int FULL_TIME = 1;
		int empType = (int) (Math.random() * 10) % 4;
		if (empType == FULL_TIME) {
			System.out.println("Employee is Present");

		} else {
			System.out.println("Employee is Absent");
		}
	}
}

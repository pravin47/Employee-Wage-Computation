package java_practice;

public class Emp_Wage {
	public static void main(String args[]) {
		final int Wage_per_Hour = 20;
		int wage = 0;
		final int FULL_TIME = 1;
		int empType = (int) (Math.random() * 10) % 4;
		int Fulldayhour = 0;
		if (empType == FULL_TIME) {
			System.out.println("Employee is Present");
			Fulldayhour = 8;
		} else {
			System.out.println("Employee is Absent");
		}
		wage = Wage_per_Hour * Fulldayhour;
		System.out.println("Employee per Daily Wage is = " + wage);
	}
}

package java_practice;

public class Emp_Wage {
	public static void main(String args[]) {
		final int Wage_Per_Hour = 20;
		int wage = 0;
		final int Full_Time = 1;
		final int Part_Time = 2;
		int empType = (int) (Math.random() * 10) % 3;
		int Fulldayhour = 0;
		int Part_Time_Hour = 0;
		if (empType == Full_Time) {
			System.out.println("Employee is Present");
			Fulldayhour = 8;
		} else if (empType == Part_Time) {
			System.out.println("employee is part time");
			Part_Time_Hour = 8;
		} else {
			System.out.println("Employee is Absent");
		}
		wage = Wage_Per_Hour * Fulldayhour;
		int Parttime_Wage = Wage_Per_Hour * Part_Time_Hour;
		System.out.println("Employee per Daily Wage is = " + wage);
		System.out.println("Part time per Daily Wage is = " + Parttime_Wage);
	}
}

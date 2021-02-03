package java_practice;

public class Emp_Wage {
	public static void main(String args[]) {
		final int Wage_Per_Hour = 20;
		int wage = 0;
		final int Full_Time = 1;
		final int Part_Time = 2;
		int empType = (int) (Math.random() * 10) % 3;
		int Working_hour = 0;

		switch(empType) {
		
		case 1:
				System.out.println("Employee Is Full Time");
				Working_hour =8;
				break;
		case 2: 
				System.out.println("Employee is part time");
				Working_hour = 8;
				break;
		default:
				System.out.println("Employee is Absent");
				
			}
			wage=Wage_Per_Hour*Working_hour;
			System.out.println("Daily Employee Wage is : " +wage);
		}
}

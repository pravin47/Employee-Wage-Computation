package java_practice;

public class Emp_Wage {
	public static void main(String args[]) {
		final int Wage_Per_Hour = 20;
		int wage = 0;
		final int Full_Time = 1;
		final int Part_Time = 2;
		final int Working_Day_PerMonth = 20;
		int Working_hour = 0;
		int Max_Working_Hour = 100;
		int day = 0;
		int Total_Working_Hour = 0;
		int total_wage=0;
		for ( day = 1, Total_Working_Hour = 0; day <= Working_Day_PerMonth
				&&Total_Working_Hour < Max_Working_Hour; day++,Total_Working_Hour += Working_hour)
			{
			int empType = (int) (Math.random() * 10) % 3;
			switch (empType) {

			case 1:
				Working_hour = 8;
				break;
			case 2:
				Working_hour = 8;
				break;
			default:
				Working_hour = 0;

			}
			wage = (Working_Day_PerMonth * (Wage_Per_Hour * Working_hour));
			total_wage += wage;
			}
			System.out.println("Total Wage is = :" +total_wage);
	}
}

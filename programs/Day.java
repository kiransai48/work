package codecamp_2;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) 
	{
		int temp,temp1,temp2,month, year, week, day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of days:");
		temp = sc.nextInt();
		year=temp/365;
		temp1=temp%365;
		System.out.print(year+"year ");
		week=temp/7;
		month=temp/30;
		System.out.print(month+"month ");
		temp2=week&7;
		System.out.print(week+"weeks ");
		day=temp;
		System.out.print(day+"days ");
		
	}
}

	



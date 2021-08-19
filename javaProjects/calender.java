import java.io.*;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class sd {
	public static int numOfDays(int i, int year) {
		if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			return 31;
		else if (i == 4 || i == 6 || i == 9 || i == 11)
			return 30;
		else if (isLeap(year))
			return 29;
		else
			return 28;
	}

	public static boolean isLeap(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0 && year % 400 != 0)
				return false;
			return true;
		}
		return false;
	}

	public static int day(int month, int day, int year) {
		int y = year - (14 - month) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = (day + x + (31 * m) / 12) % 7;
		return d;
	}

	public static void main(String[] args) {
		int num, counter = 0;
		String s = JOptionPane.showInputDialog("Enter the year");
		int n = Integer.parseInt(s);
		String[] arrM = new String[] { "January", "February", "March", "April", "May", "June", "July", "August",
				"Septemper", "October", "November", "December" };
		String[] arrD = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		for (int i = 1; i <= 12; i++) {
			System.out.println(arrM[i - 1]);
			for (int d = 0; d < arrD.length; d++)
				System.out.print(arrD[d] + " ");
			System.out.println("");
			num = numOfDays(i, n);
			for (int j = 0; j <= num; j++) {
				if (j == 0)
					for (int m = 1; m <= day(i, 1, n); m++) {
						System.out.print("   " + " ");
						counter = day(i, 1, n);
					}
				else {
					if (j < 10)
						System.out.print(" " + j + "  ");
					else
						System.out.print(" " + j + " ");
					counter++;
				}
				if (counter == 7) {
					System.out.println("");
					counter = 0;
				}
			}
			System.out.println();
			System.out.println("-----------------------");

		}
	}
}
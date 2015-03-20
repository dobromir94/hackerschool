package com.java.fasttask;

import java.util.Arrays;
import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		System.out.print("Input:");
		int positionToSearch = input.nextInt();
		long num = 1;
		StringBuilder n;

		for (int i = 1; i <= 3200000; i++) {
			num = i * i;
			n = sb.append(num);
			if (n.length() > positionToSearch) {
				System.out.println("Output:" + n.charAt(positionToSearch - 1));
				break;
			} else {
				//System.out.println("BreaK!");
			}
		}
	}
}

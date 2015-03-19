package com.fasttask.java;

import java.util.Arrays;
import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int[] poweredNums = { 1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 225 };
		Scanner input = new Scanner(System.in);

		System.out.println("Nomer na poziciq, na koqto e chisloto");
		int n = input.nextInt();

		// for (int i = 0; i < poweredNums.length; i++) {
		switch (n) {
		case 0:
			System.out.println("vhod: " + n);
			System.out.println("Izhod: " + poweredNums[0]);
			break;
		case 1:
			System.out.println("vhod: " + n);
			System.out.println("Izhod: " + poweredNums[1]);
			break;
		case 2:
			System.out.println("vhod: " + n);
			System.out.println("Izhod: " + poweredNums[2]);
			break;
		case 3:
			System.out.println("vhod: " + n);
			System.out.println("Izhod: " + poweredNums[3]);
			break;
		case 4:
			System.out.println("vhod: " + n);
			System.out.println("Izhod: " + poweredNums[4]);
			break;
		case 5:
			System.out.println("vhod: " + n);
			System.out.println("Izhod" + poweredNums[5]);
			break;
		case 6:
			System.out.println("vhod: " + n);
			System.out.println("Izhod: " + poweredNums[6]);
			break;
		case 7:
			System.out.println("vhod: " + n);
			System.out.println("Izhod: " + poweredNums[7]);
			break;
		case 8:
			System.out.println("vhod: " + n);
			System.out.println("Izhod: " + poweredNums[8]);
			break;
		case 9:
			System.out.println("vhod: " + n);
			System.out.println("Izhod: " + poweredNums[9]);
			break;
		case 10:
			System.out.println("vhod: " + n);
			System.out.println("Izhod: " + poweredNums[10]);
			break;
		case 11:
			System.out.println("vhod: " + n);
			System.out.println("Izhod: " + poweredNums[11]);
			break;
		case 12:
			System.out.println("vhod: " + n);
			System.out.println("Izhod: " + poweredNums[12]);
			break;
		case 13:
			System.out.println("vhod: " + n);
			System.out.println("Izhod: " + poweredNums[13]);
			break;
		case 14:
			System.out.println("vhod: " + n);
			System.out.println("Izhod: " + poweredNums[14]);
			break;
		default:
			System.out.println("Nevaliden vhod!");
			break;
		}

		// }

	}
}

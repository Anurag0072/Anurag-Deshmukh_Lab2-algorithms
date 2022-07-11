package com.Lab2.Denominations;

import java.util.Scanner;

import com.Lab2.currency.Currency;
import com.Lab2.currency.MergeSort;
import com.Lab2.currency.NotesCount;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of currency Denominations");
		int noOfDenominations = sc.nextInt();
		int [] denominations = new int[noOfDenominations];
		System.out.println("Enter the currency Denominations");
		for(int i =0; i< noOfDenominations;i++) {
			denominations[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		for (int i: denominations) {
			System.out.println(i + " ");
		}
		System.out.println();
		Currency c = new Currency(denominations, noOfDenominations);
		MergeSort.sort(c.denominations, 0, noOfDenominations -1);
		for(int i=0; i< noOfDenominations; i++) {
			System.out.println(c.denominations[i] + " ");
		}
		System.out.println();
		NotesCount.noOfDenomination(c.denominations,amount);
	}

}

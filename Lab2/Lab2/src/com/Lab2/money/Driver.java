package com.Lab2.money;

import java.util.Scanner;

public class Driver {
	
    public void moneyinput() {
    	int transactions[];
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the no of transactions ");
    	int num = sc.nextInt();
    	transactions = new int[num];
    	
    	for (int i =0; i< num;i++) {
    		System.out.println("Enter transaction at position "+ i+1);
    		transactions[i] = sc.nextInt();
    		
    	}
    	displayTransactions(transactions);
    	
    	System.out.println("input Today's target ");
    	int target = sc.nextInt();
    	int datavalue = payMoney.achiver(transactions, target);
    	if (datavalue == -1) {
    		System.out.println("Target " +target+ " not achived");
    	}else {
    		System.out.println("Target " + target + " achieved in " + datavalue + "number of days");
    	}
    }    
    public static void displayTransactions(int [] transactions) {
    	for(int i =0; i< transactions.length;i++) {
    		System.out.print(transactions[i]+ " ");
    	
    	}
    	System.out.println();
    }
   public static void main(String[] args) {
	   Driver d =new Driver();
	   d.moneyinput();
}		
}

package com.Lab2.money;

public class payMoney {
	public static int achiver(int transactions[], int target) {
		for(int i=0; i< transactions.length;i++) {
			if(target == transactions[i] || target < transactions[i] ) {
				return i+1;
			}else {
				target -= transactions[i];
			}
		}
		return -1;
	}
}

package com.sz.contests2;

import java.util.Scanner;

public class PrettyAveragePrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int [] arr = new int [N];
		int times = 0;
		for (int i=0; i<N; i++)
		{
			arr[i] = sc.nextInt();
			arr[i] *= 2;
		}
		int [][] primes = new int [N][2];
		for (int t=0; t<N; t++)
		{
			for (int i=3; i<arr[t]; i++)
			{
				times = 0;
				for (int j = 2; j<=Math.sqrt(arr[t])+1; j++) {
					if (i%j == 0) {
						times++;
						break;
					}
				}
				if(times==0 && arr[t]-i>=3)
				{
					primes[t][0] = i; 
					primes[t][1] = arr[t]-i;
				}
			}
		}
		for (int i=0; i<primes.length; i++)
		{
			for(int j=0; j<primes[i].length; j++)
			{
				System.out.print(primes[i][j]);
				if (j==0)
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

package codechef;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    int[] a1 = new int[n];
		    int[] a2 = new int[m];
 		    for(int i = 0 ; i< n ; i++){
		        a1[i] = sc.nextInt();
		    }
		    for(int j = 0 ; j < m ; j++){
		        a2[j] = sc.nextInt();
		    }
		    int c = 0 ;
		    for(int p = 0 ; p < n ; p++){
		        for(int q = 0 ; q < m ; q++){
		            if(a1[p] > a2[q]){
		                c++;
		            }
		        }
		    }
		    System.out.println(c);
		}

	}
}

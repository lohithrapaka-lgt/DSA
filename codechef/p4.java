package codechef;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }

            int r = 0;
            for (int i = n; i >= 1; i--) {
                if (a[i] != i) {
                    r = i;
                    break;
                }
            }

            if (r == 0) {
                System.out.println(0);
            } else {
                int min = a[r];
                for(int h = r+1 ; h <= n ; h++){
                    if(a[h] < min){
                        min = a[h];
                    }
                }
                System.out.println(min);
            }
        }
    }
}

	


package codechef;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
int r = x - 100;
int a = 0;

if (r >= 0) {
    for (int i = r; i >= 50; i -= 50) {
        a++;
    }
}
System.out.println(a);

		
	}
   
}

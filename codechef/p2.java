package codechef;

import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }

            Arrays.sort(a); 

            int max = 0;
            int re = a[0];
            int Freq = 1;

            for (int j = 1; j < n; j++) {
                if (a[j] == a[j - 1]) {
                    Freq++;
                } else {
                    if (Freq > max) {
                        max = Freq;
                        re = a[j - 1];
                    }
                    Freq = 1;
                }
            }
            if (Freq > max) {
                max = Freq;
                re = a[n - 1];
            }

            System.out.println(re);
        }
    }
}

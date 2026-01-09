public class p5 {
    public static void main(String args[]){
        pattern5(5);
        }

    public static void pattern5(int n) {
        for(int i = 1 ; i<=2*n ; i++){
            int c = i>n ? 2*n-i :i;
            int s = n-c;
            for(int k = 0;k<s;k++){
                System.out.print("  ");
            }
            for(int j = c ; j>=1 ; j--){
                System.out.print(j+" ");
            }
            for(int l = 2;l<=c;l++){
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
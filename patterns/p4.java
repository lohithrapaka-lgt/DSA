public class p4 {
    public static void main(String args[]){
        pattern4(5);
        }

    public static void pattern4(int n) {
        for(int i = 1 ; i<=2*n ; i++){
            int c = i>n? 2*n-i:i;
            int s = n-c;
            for(int j = 1 ; j<=s ; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k<=c ; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
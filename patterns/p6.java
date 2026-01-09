public class p6 {
    public static void main(String args[]){
        pattern6(5);
        }

    public static void pattern6(int n) {
        for(int i = 0 ; i<=n ; i++){
            for(int j = 0 ; j<=n ; j++){
            int a = n -  (Math.min(Math.min(i,j),Math.min(n-i,n-j))) ;
            System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
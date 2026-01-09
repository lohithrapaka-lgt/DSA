public class p3 {
    public static void main(String args[]){
        pattern3(5);
        }

    public static void pattern3(int n) {
        for(int i = 1 ; i<=n*2-1 ; i++){
            int c = i>n ? 2*n-i :i;
            for(int j = 1 ; j<=c ; j++){
                System.out.print("* ");
            }
            System.out.println();
            
        }
        
    }
}
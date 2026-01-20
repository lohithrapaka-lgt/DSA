import java.util.*;
class no_spaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String o = "";
        for(int i = 0 ; i< input.length();i++){
            if(Character.isLetter(input.charAt(i))){
                o += input.charAt(i);
            }
        }
        System.out.println(o);
    
    sc.close();
    }
}
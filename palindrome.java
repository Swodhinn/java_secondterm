import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String word= input.next();
        word=word.toUpperCase();
        String reverse="";
        for (int i=word.length()-1;i>=0;i--){
            reverse=reverse+word.charAt(i);
        };
        if (word.equals(reverse)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
}

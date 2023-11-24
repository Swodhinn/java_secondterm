
import java.util.Scanner;

public class vowel_consonant {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name = input.next();
        name=name.toUpperCase();
        int i;
        char a;
        int consonant=0;
        for (i=0;i<=(name.length()-1);i++){
            a=name.charAt(i);
            if (a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
                System.out.println();
            }
            else {
                consonant=consonant+1;
            }

        }
        System.out.println("consonant= "+consonant);
        System.out.println("vowel= "+(name.length()-consonant));
    }
}
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        System.out.println("please enter any String");
        Scanner scanner=new Scanner(System.in);
        String word="";
        char[]word_char;
        word=scanner.nextLine();
        word_char=word.toCharArray();
        String reverse_word="";
        int counter=0;
        for (int i=word.length()-1;i>=0;i--){
            counter++;
            reverse_word+=word_char[i];
        }
        System.out.println(reverse_word);
        System.out.println("length "+word.length());
        System.out.println("the length of String is "+counter);
    }
}

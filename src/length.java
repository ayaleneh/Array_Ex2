import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter any word that you want to find length");
        String word="";
        word=scanner.nextLine();
        int counter=0;
        for (int i=word.length()-1;i>=0;i--) {
            counter++;
        }
        System.out.println("the length of String is "+counter);
    }
}

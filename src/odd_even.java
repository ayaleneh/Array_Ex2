import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        int []array=new int[10];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<array.length;i++) {
            System.out.println("please enter "+(i+1)+" element");
            array[i]=scanner.nextInt();
        }
        for(int i=0;i<array.length;i++){
            if((array[i]%2)==0){
                System.out.print("even_number "+array[i]+" ");
            }
            else{
                System.out.print("odd_number "+array[i]+" ");
            }
        }
    }
}

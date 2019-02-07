import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        Integer []array=new Integer[10];
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<array.length;i++){
            System.out.println("please eneter array "+(i+1)+" element");
            array[i]=scanner.nextInt();
        }
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(array));
        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
        System.out.println( Arrays.toString(numbersWithoutDuplicates) );
    }
}

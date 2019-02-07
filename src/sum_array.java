public class sum_array {
    public static void main(String[] args) {
       int []array1= {1,7,6,5,9};
       int []array2= {2,7,6,3,4};
       for(int i=0;i<array1.length;i++){
           for(int j=0;j<array2.length;j++){
               if((array1[i]+array2[j])==13){
                   System.out.println("found");
                   System.out.println("("+array1[i]+","+array2[j]+")");
               }
//               System.out.print(array1[i]);
//               System.out.print(array2[j]);
           }
       }
    }
}

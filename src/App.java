import java.util.Scanner;

public class App {
   static double sum;
   static double result;
   static double average_calculation (double [] arr){
       for (int i = 0 ; i < arr.length;i++){         
           sum+=arr[i];          
       }
    result=sum/arr.length;
    return result;
    }
    public static void main(String[] args) throws Exception {
        int count=0;
        int countdown=10;
         double [] numbers=new double[10];

         System.out.println("Please enter ten numbers ");

        while(count<10){
            
            try (Scanner input = new Scanner(System.in)) {
                for (int i = 0; i <10;i++){
                    numbers[i]=input.nextDouble();
                    count++;
                    
                    countdown--;
                    System.out.println(count+" "+"number entered"+
                    " "+countdown+" "+"to go");

                }
            }
        }
        //Average ave = new Average();
        System.out.println("The Average for this 10 numbers is :"+ average_calculation(numbers));     
    }
}

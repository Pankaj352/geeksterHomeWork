import java.util.Scanner;
class SumLastDigit {
     public static void main(String[] args) 
     {
                   Scanner myData = new Scanner(System.in);
                   int x = myData.nextInt();
                   int y = myData.nextInt();
                   int z = x % 10;
                   int m = y % 10;
                   int add = z + m;
                   System.out.println(add);

     }       
}

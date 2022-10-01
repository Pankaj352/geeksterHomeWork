import java.util.Scanner;

class largeNum {
              public static void main(String[] args)
              {
                            Scanner input = new Scanner(System.in);
                            int num1 = input.nextInt();
                            int num2 = input.nextInt();
                            if(num1 > num2)
                            {
                                          System.out.println("num1 is large number");
                            }
                            else if(num2>num1)
                            {
                                          System.out.println("num2 is large number");
                            }
              }
}
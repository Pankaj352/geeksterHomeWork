import java.util.Scanner;
class incomeofman {
              public static void main(String[] args)
              {
                            Scanner input = new Scanner(System.in);
                            int income = input.nextInt();
                            if(income<500000)
                            {
                                          System.out.println("No tax to be paid ");

                            }
                            if(income>=500000)
                            {
                                          System.out.println("Tax to be paid");
                            }
              }              
}

import java.util.Scanner;

public class Age {
              public static void main(String[] args)
              {
                            Scanner input = new Scanner(System.in);
                            int age = input.nextInt();
                            if(age >=70)
                            {
                                          System.out.println("Super Senior Citizen");
                            }
                            else if(age<70 || age>=59 )
                            {
                                          System.out.println("Senior Citizen");
                            }
                          else if(age<59 || age>=18)
                            {
                                          System.out.println("Adult");
                            }
              }
              
}

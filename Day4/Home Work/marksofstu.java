import java.util.Scanner;

public class marksofstu {
              public static void main(String[] args)
              {
                            Scanner input = new Scanner(System.in);
                            int marks = input.nextInt();
                            if(marks<33)
                            {
                                          marks += 4;

                            }
                            System.out.println(marks);
              }
              
}

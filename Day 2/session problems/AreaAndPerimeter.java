import java.util.Scanner;

// "static void main" must be defined in a public class.
public class AreaAndPerimeter {
              public static void main(String[] args) {
                            System.out.println("Area of the Rectangle");
                            Scanner input = new Scanner(System.in);
                            int length, breadth, area,l, b, perimeter;
                            length = input.nextInt();
                             breadth = input.nextInt();
                             
                            area = 2 * (length + breadth);
                            System.out.println(area);
                            System.out.println("To print Perimeter");
                            Scanner mydata = new Scanner(System.in);
                            l = mydata.nextInt();
                            b = mydata.nextInt();
                            perimeter = l * b;
                            System.out.println(perimeter);

              }
}
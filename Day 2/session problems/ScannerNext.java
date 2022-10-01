 import java.util.Scanner;

 // "static void main" must be defined in a public class.
class ScannerNext {
              public static void main(String[] args) {
                            Scanner input = new Scanner(System.in);
                            System.out.print("Enter your name: ");

                            // reads the entire word
                            String value = input.next();
                            System.out.println("Using next(): " + value);

                            input.close();
              }
}
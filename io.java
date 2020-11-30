import java.util.Scanner;
import java.io;

public class IO {

    public static void main(String[] args){
        System.out.println("Input/Output Example");

        File file;
        Scanner scan;

        try {
            file = new file("data.csv");
            scan = new Scanner(file);

            while (scan.hasNextInt()) {
                int num = scan.Int();
                System.out.println("The next number is " + num);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("done");
        }
        
        
        
        // Exception -> IOException
        
        // throws -> some other code handles it, not my problem
        // try/catch -> we manage it ourselves


    }
}
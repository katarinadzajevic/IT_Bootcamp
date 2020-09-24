import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;


public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc;
        int count;
        String fileName = args[0];
        String message;

        if (args.length !=1){
            System.exit(1);
        }

        sc = new Scanner(new File(fileName));
        count= Integer.parseInt(sc.next());
        System.out.print(count);
        for (int i = 0; i <= count; i++) {
            message = sc.nextLine();
            System.out.println(message);

        }

    }
}

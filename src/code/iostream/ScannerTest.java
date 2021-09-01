package code.iostream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        try {
            File sampleFile = new File("sample text.txt");
            Scanner scan = new Scanner(sampleFile);
            List<String> data = new ArrayList<>();
            while (scan.hasNextLine()) {
                data.add(scan.nextLine());
            }
            scan.close();
//            System.out.println(data);
            data.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("end of program");
        }

    }
}

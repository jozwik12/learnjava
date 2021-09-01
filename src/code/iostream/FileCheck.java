package code.iostream;

import java.io.File;

public class FileCheck {

    public static void main(String[] args) {
        File file = new File("testFolder");
        if(file.mkdirs()) System.out.println("dir created");
    }
}

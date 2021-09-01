package code.iostream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class SearchFilesByExtension {

    public static void main(String[] args) throws IOException {
    }

    public static long getNumberOfFilesWithExtension(Path pathToStartSearch, String extension) throws IOException {
        if (pathToStartSearch == null || extension == null || extension.isEmpty()) {
            return 0;
        }
        try (Stream<Path> stream = Files.find(pathToStartSearch, Integer.MAX_VALUE, (specificPath, attr) -> String.valueOf(specificPath).endsWith(extension)))
        {
            return stream.count();
        }

    }
}

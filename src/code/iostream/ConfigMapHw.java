package code.iostream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.stream.Collectors;

public class ConfigMapHw {

    public String getValueFromConfigMap(Path configMapFilePath, String keyName) throws IOException {
        if (configMapFilePath == null || keyName == null) return null;
        Map<String, String> dupa = Files.lines(configMapFilePath)
                .collect(Collectors.toMap(l -> ((String) l).split("=")[0], l -> ((String) l).split("=")[1]));

        return dupa.get(keyName);

    }
}

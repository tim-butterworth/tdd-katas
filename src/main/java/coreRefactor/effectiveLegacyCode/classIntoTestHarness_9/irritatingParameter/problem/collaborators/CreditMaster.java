package coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.irritatingParameter.problem.collaborators;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CreditMaster {

    private final String fileContent;

    public CreditMaster(String fileName, Boolean isLocal) {
        this.fileContent = readTheFile(fileName, isLocal);
    }

    private String readTheFile(String fileName, Boolean isLocal) {
        if (isLocal) {
            File file = new File(fileName);

            return readResource(file, this::fileToInputStream);
        } else {
            try {
                return readResource(new URL(fileName), this::urlToInputStream);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private <T> String readResource(T t, Function<T, InputStream> toInputStream) {
        try (
                InputStream inputStream = toInputStream.apply(t);
                InputStreamReader reader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(reader)
        ) {
            return bufferedReader.lines().collect(Collectors.joining());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private InputStream fileToInputStream(File file) {
        try {
            return new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private InputStream urlToInputStream(URL url) {
        try {
            return url.openStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

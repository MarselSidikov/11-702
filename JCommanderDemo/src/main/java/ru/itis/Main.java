package ru.itis;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 03.05.2018
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {

    @Parameter(names = "-classFolder")
    private String classFolder;

    public static void main(String[] args) {
        Main main = new Main();
        JCommander.newBuilder()
                .addObject(main)
                .build()
                .parse(args);
        try {
            main.run();
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public void run() throws Exception {
            Files
                    .list(Paths.get(classFolder))
                    .forEach(file -> {
                        try {
                            URL url = new URL("file://C:\\Users\\admin.WIN-IPM3OA3VQNQ\\Desktop\\Java\\Classes\\");
                            URLClassLoader loader = URLClassLoader.newInstance(new URL[]{url}, getClass().getClassLoader());
                            Class aClass = loader.loadClass("User");
                            System.out.println(aClass.getName());
                        } catch (Exception e) {
                            throw new IllegalArgumentException(e);
                        }
                    });
    }
}

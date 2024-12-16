package org.okten.files;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FilesDemo {

    @SneakyThrows
    public static void main(String[] args) {
        Path path = Path.of("data/test.txt");
        System.out.println(Files.readAllLines(path));

         path = Path.of("data/test2.txt");
        Files.writeString(path, "Brad, 50, Actor", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }
}

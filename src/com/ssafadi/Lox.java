package com.ssafadi;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lox {
    public static void main(String [] args) throws IOException {
        if (args.length > 1) {
            System.out.println("Usage: jlox [script]");
            System.exit(64);
        }
        else if (args.length == 1) {
            System.out.println(System.getProperty("user.dir"));
            runFile(args[0]);
        }
        else{
            // runPrompt();
        }
    }

    private static void runFile(String path) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(path));
        String s = new String(bytes, Charset.defaultCharset());
        System.out.println(s);
//        run(s);

    }

}

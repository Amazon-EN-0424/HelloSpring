package com.ironhack.hellospring;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.Scanner;

@Component
public class Speaker implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Greetings, what's your name?");
        Scanner scanner = new Scanner(System.in);
        var name = scanner.nextLine();
        System.out.printf("Hello " + name);
    }
}

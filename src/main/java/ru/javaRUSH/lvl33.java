package ru.javaRUSH;

import java.util.Scanner;

public class lvl33 {

    public static void main(String[] args) {


        String militaryCommissar = ", явитесь в военкомат";
        Scanner console = new Scanner(System.in);
        int age = console.nextInt();
        String name = console.nextLine();
        if (age >= 18 && age <= 28)
            System.out.println(name  + militaryCommissar);
        else
            System.out.println("1");


    }
}



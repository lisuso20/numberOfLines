package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        BaseService bs = new BaseService();

        System.out.println("Enter a file name: ");
        bs.output(reader.next());
    }
}

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

package ex42;

import java.util.*;
import java.io.*;

public class App {

    private static void parse(String s){

        int i = 0;
        int count = 0;

        while(i < s.length()){

            if(s.charAt(i) == ',') {
                if(count >= 7)
                    System.out.print(" \t ");
                else if(count == 6)
                    System.out.print(" \t ");
                else
                    System.out.print(" \t \t ");

                count = 0;
                i++;

            }
            else {
                System.out.print(s.charAt(i));
                count++;
                i++;
            }
        }
        System.out.print("\n");

    }

    public static void main(String[] args) throws FileNotFoundException{

        System.out.println("Last\t\tFirst\t\tSalary\n-------------------------------");

        File in = new File("C:\\Users\\Fabri\\IdeaProjects\\giolito-cop3330-assignment3v2\\src\\main\\java\\ex42\\exercise42_input.txt");


        Scanner sc = new Scanner(in);

        while(sc.hasNextLine()){
            String temp = sc.nextLine();

            parse(temp);
        }
    }
}

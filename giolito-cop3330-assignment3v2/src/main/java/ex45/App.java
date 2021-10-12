/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

package ex45;

import java.util.*;
import java.io.*;

public class App {



    public static void main(String[] args) throws FileNotFoundException{

        File in = new File("C:\\Users\\Fabri\\IdeaProjects\\giolito-cop3330-assignment3v2\\src\\main\\java\\ex45\\exercise45_input.txt");

        Scanner input = new Scanner(in);
        Scanner user = new Scanner(System.in);

        System.out.println("What is the name of the output file?");
        try {
            String file = user.nextLine();
            FileWriter out = new FileWriter(file);

            while(input.hasNextLine()){
                String line = input.nextLine();
                if(line.contains("utilize"))
                    line = line.replace("utilize", "use");
                if(line.contains("Utilize"))
                    line = line.replace("Utilize", "Use");

                out.write(line + "\n");
            }
            out.close();

        } catch(IOException e){
            System.out.println("An error occurred.");
        }
    }
}

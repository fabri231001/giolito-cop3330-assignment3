/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

package ex41;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class App {

    private static ArrayList<String> sortNames(ArrayList<String> names){

        ArrayList<String> sortedNames= names;
        Collections.sort(sortedNames);

        return sortedNames;
    }

    public static void main(String[] args) {

        File in = new File("C:\\Users\\Fabri\\IdeaProjects\\giolito-cop3330-assignment3v2\\src\\main\\java\\ex41\\exercise41_in.txt");
        ArrayList<String> names = new ArrayList<String>();
        try{
            Scanner sc = new Scanner(in);

            while(sc.hasNextLine()){
                String s = sc.nextLine();
                names.add(s);
            }
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<String> s = sortNames(names);

        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\Fabri\\IdeaProjects\\giolito-cop3330-assignment3v2\\src\\main\\java\\ex41\\exercise41_out.txt");
            myWriter.write("Total of " + s.size() + " names\n" + "-------------------\n");
            String temp;
            for(int i = 0; i < s.size(); i++) {
                temp = s.get(i);
                myWriter.write(temp + "\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}

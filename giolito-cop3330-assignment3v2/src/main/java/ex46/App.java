/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

package ex46;

import java.io.*;
import java.util.*;
import java.lang.*;

public class App {

    private static int wordCounter(String s, File in) throws FileNotFoundException{

        int count = 0;
        Scanner sc = new Scanner(in);

        while(sc.hasNext())
            if(sc.next().contains(s))
                count++;

        return count;

    }

    private static void displayWordCounter(String s, int count){

        String ast = "*";
        String finalAst = new String(new char[count]).replace("\0", ast);
        String fin = s + ": \t" + finalAst;

        System.out.println(fin);
    }

    public static void main(String[] args) throws FileNotFoundException{

        File in = new File("C:\\Users\\Fabri\\IdeaProjects\\giolito-cop3330-assignment3v2\\src\\main\\java\\ex46\\exercise46_input.txt");

        Scanner sc = new Scanner(in);
        ArrayList<String> diffNames = new ArrayList<String>();

        while(sc.hasNext()){
            String s;
            if(diffNames.size() == 0){
                s = sc.next();
                diffNames.add(s);
            }
            s = sc.next();
            if(!diffNames.contains(s))
                diffNames.add(s);
        }

        while(diffNames.size() != 0){
            int max = wordCounter(diffNames.get(0), in);
            int index = 0;
            for(int i = 0; i < diffNames.size(); i++){
                int current = wordCounter(diffNames.get(i), in);
                if(current > max) {
                    max = current;
                    index = i;
                }
            }

            displayWordCounter(diffNames.get(index), max);
            diffNames.remove(index);
        }


    }
}

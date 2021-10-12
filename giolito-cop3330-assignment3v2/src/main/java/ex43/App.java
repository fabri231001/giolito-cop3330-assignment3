package ex43;

import java.io.*;
import java.util.*;

public class App {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Site name: ");
        String name = sc.nextLine();
        System.out.println("Author: ");
        String author = sc.nextLine();
        System.out.println("Do you want a folder for JavaScript?");
        String javaFolder = sc.nextLine();
        System.out.println("Do you want a folder for CSS?");
        String cssFolder = sc.nextLine();

        String path = "C:\\Users\\Fabri\\IdeaProjects\\giolito-cop3330-assignment3v2\\src\\main\\java\\ex43\\website\\" + name;

        File file = new File(path);
        boolean b = file.mkdirs();

        if(b)
            System.out.println("Created ./website/" + name);
        else
            System.out.println("Sorry couldn't create directory");


    }
}

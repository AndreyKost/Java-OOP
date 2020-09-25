package JarOfT;

import JarOfT.Jar;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Jar<String> jar=new Jar<>();
        jar.add("Geri");
        jar.add("Nikol");
        jar.add("Moni");
        System.out.println(jar.remove());
        System.out.println(jar.remove());


    }
}

package pr;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = sc.next();
        System.out.println("Welcome "+ name);
    }
}

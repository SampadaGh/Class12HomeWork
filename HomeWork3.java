package homeWorkClass12;

import com.sun.javafx.iio.gif.GIFImageLoader2;
import com.sun.media.sound.RIFFInvalidDataException;
import sun.awt.image.GifImageDecoder;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        /*
        3) Write a program that reads two people's first
        names and if they expecting boy or girl?
                Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY

        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? girl
        Suggested baby name: MAIEL
         */
        Scanner name=new Scanner(System.in);
        System.out.println("Enter Mom's first name");
        String momName= name.next();
        System.out.println("Enter Dad's first name");
        String dadName=name.next();
        System.out.println("Are you expecting boy or girl?");
        String baby=name.next();


        if(baby.equalsIgnoreCase("boy")){

            int len=momName.length();
            String boyName=dadName.substring(0,3 )+momName.substring(len-2,len);
            System.out.println("Suggested baby name is: "+boyName);


        }if(baby.equalsIgnoreCase("girl")){
            int len2=dadName.length();
            String girlName=momName.substring(0,2)+dadName.substring(len2-3,len2);
            System.out.println("Suggested baby name is: "+girlName);

        }


    }
}

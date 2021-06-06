/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Gracie Bliss
 */
import java.util.*;
public class apps {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("What is your age? ");

        String age=in.nextLine();

        int ageNum=Integer.parseInt(age);

        String isOld="old";

        if(ageNum<16){
            isOld="not old";
        }
        System.out.print("You are "+isOld+" enough to legally drive.");
    }
}

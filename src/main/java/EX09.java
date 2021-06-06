/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Vincent Smith
 */


import java.util.Scanner;

public class EX09 {
    static final int gal = 350;
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the room?");
        int length = input.nextInt();

        System.out.println("What is the width of the room?");
        int width = input.nextInt();

        int ttl = length*width;
        float numgal = ttl/gal;
        System.out.println("You will need to Purchase " + Math.ceil(numgal) + " gallons to cover " + ttl + " square feet");




    }
}

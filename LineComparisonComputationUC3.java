package com.Bridgelabz.Day03LineComparisonProblem;

import java.util.Scanner;

public class LineComparisonComputationUC3 {
    //creating static variables in lineLengthCal method
    public static int lineLengthCal() {
        //Scanner class created for taking input from the user
        Scanner scanner = new Scanner(System.in);
        int x1,y1,x2,y2;
        //A length as two points (x1,y1) (x2,y2)
        System.out.println("Enter the co-ordinates of line!!: x1,y1,x2,y2");
        System.out.println("Enter the value of X1 co-ordinate ");
        x1 = scanner.nextInt();
        System.out.println("Enter the value of Y1 co-ordinate ");
        y1 = scanner.nextInt();
        System.out.println("Enter the value of X2 co-ordinate ");
        x2 = scanner.nextInt();
        System.out.println("Enter the value of Y2 co-ordinate ");
        y2 = scanner.nextInt();
        //Length of line is given in UC1
        int lineLength = (int)Math.sqrt(Math.pow((x1-x2), 2)
            + Math.pow((y1-y2), 2) );
        //returning the length of line
        return lineLength;

}
    //Method equalityCheck with parameters
    public static void equalityCheck(int lineOneLength , int lineTwoLength ) {
        //if condition will check whether the length of lines are equal or not and which line is greater
        if(lineOneLength == lineTwoLength ) {
            System.out.println("Lines are Equal");
        }
        else if(lineOneLength > lineTwoLength){
            System.out.println("Line1 is greater than Line2 ");
        }
        else {
            System.out.println("Line2 is greater than Line1 ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line\n"
                + "Comparison Computation\n"
                + "Program on Master Branch");
        int lineOneLength = lineLengthCal();
        int lineTwoLength = lineLengthCal();
        System.out.println("The length of line 1 is: "+lineOneLength);
        System.out.println("The length of line 2 is: "+lineTwoLength);
        equalityCheck(lineOneLength,lineTwoLength);
    }
}

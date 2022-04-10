package com.Bridgelabz.Day03LineComparisonProblem;
import java.util.Scanner;

public class LineComparisonComputationUC1 {
    //Creating method lineLengthCal
    public static int lineLengthCal() {
        //creating static variables in lineLengthCal method
        int x1,y1,x2,y2;
        //Scanner class created for taking input from the user
        Scanner scanner = new Scanner(System.in);
        //A length as two points (x1,y1) (x2,y2)
        System.out.println("Enter the co-ordinates of line!!: x1,y1,x2,y2");
        System.out.println("Enter the value of X1 co-ordinate ");
        x1 = scanner.nextInt();
        System.out.println("Enter the value of Y2 co-ordinate ");
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

    public static void main(String[] args) {
        //Method lineLengthCal called to return length of line
        int lineLength = lineLengthCal();
        System.out.println("The length of line is: "+lineLength);
    }
}

package ScapCleanUpLater;

import java.util.*;

public class App 
{

    public static void makingABox(int w, int h){
        //the char characters defined in variables
        char topLeft = '┌';
        char middle = '─';
        char topRight = '┐';
        char bottomLeft = '└';
        char bottomRight = '┘';
        char vertical = '│';


        //making the top row
        //defining the legnth of the top row of the box
        char[] colums = new char[w];
        //making the corners
        colums[0] = topLeft;
        colums[colums.length-1] = topRight;

        //making the horizontal line in between the corners
        for(int i = 1; i<colums.length -1; i++){
            colums[i] = middle;
        }

        //converting the char array to a String to print out
        System.out.println(new String(colums));

        //middle section
        //clearing out the array we used before
        colums = new char[w];
        //the for loop minuses the upper and bottom line of the square and works for the middle
        for(int i = 0; i< h-2; i++){
            //making the left edge
            colums[0] = vertical;
            //making the middle hollow as java see this as empty boxes in the middle
            for(int j = 1; j<colums.length -1; j++){
                colums[j] = ' ';
            }
            //making the right edge
            colums[colums.length-1] = vertical;
            //converts to a String
            System.out.println(new String(colums));
        }


        //bottom
        //similar to what happen at the top edge
        //clearing array
        colums = new char[w];
        //bottom corners
        colums[0] = bottomLeft;
        colums[colums.length-1] = bottomRight;
        //middle horizontal line
        for(int i = 1; i<colums.length -1; i++){
            colums[i] = middle;
        }

        //converts to String
        System.out.println(new String(colums));

    }


    public static void main(String[] args) {

        makingABox(5,3);

    }
}

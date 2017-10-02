/**
 * 
 * @author Joseph Brooksbank 
 * Lab 06
 * 10/2/17
 */

import edu.princeton.cs.introcs.StdDraw;
import java.util.Scanner;

public class ShapeDrawing {

    public static final int CANVAS_SIZE = 300;

    public static void main(String[] args) {

        String shape = Ask_Question("What shape (circle, square, triangle?");
        String color = Ask_Question("What color (red, green, blue, yellow)?");

        switch(color) {
            case "red":
                StdDraw.setPenColor(StdDraw.RED);
                break;
            case "green":
                StdDraw.setPenColor(StdDraw.GREEN);
                break;
            case "blue":
                StdDraw.setPenColor(StdDraw.BLUE);
                break;
            case "yellow":
                StdDraw.setPenColor(StdDraw.YELLOW);
                break;
            default:
                StdDraw.setPenColor(StdDraw.BLACK);
                break;
        }
        switch (shape) {
            case "square":
                StdDraw.square(CANVAS_SIZE/2, CANVAS_SIZE/2, 50);
                break;
            case "circle":
                StdDraw.circle(CANVAS_SIZE/2, CANVAS_SIZE/2, 50);
                break;
            case "triangle":

        }


        }


    }
    private static String  Ask_Question(String question){
        Scanner userInput = new Scanner(System.in);
        System.out.println(question);
        String user_response = userInput.nextLine();
        user_response = user_response.toLowerCase();
        user_response = user_response.trim();
        return user_response;
    }

}

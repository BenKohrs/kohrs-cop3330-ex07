import java.util.Scanner;
import java.util.Calendar;
public class problem7 {
    public static void main(String[] args) {
        double height, width, area, perimeter;
        Scanner x = new Scanner(System.in);
        System.out.println("What is the length of the room in feet?");
        height = x.nextFloat();
        System.out.println("What is the width of the room in feet?");
        width = x.nextFloat();
        area = width * height;
        Double squareArea = area * 0.09290304;
        int intArea = (int) area;
        System.out.println("You entered dimensions of " + (int) height
        + " feet by " + (int) width + " feet.\nThe area is\n"
        + intArea + " square feet\n" + squareArea + " square meters");
    }
}

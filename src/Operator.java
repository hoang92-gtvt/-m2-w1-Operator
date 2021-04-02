
import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scaner = new Scanner(System.in);

        System.out.println("Enter Width: ");
        width=scaner.nextFloat();
        System.out.println("Enter Height: ");
        height=scaner.nextFloat();

        float area = width*height;
        System.out.println( "Diện tích là :" + area);


    }
}

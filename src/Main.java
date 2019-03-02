import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scInput = new Scanner(System.in);

        System.out.println(" Process show Area, Perimeter and color of triangle ");
        Triangle triangle = new Triangle();

        System.out.println("Do you want input side of Triangle");
        System.out.println("1. Yes");
        System.out.println("2. No");

        while (checkAnwser()) {
            System.out.print(" Enter side1= ");
            double side1 = scInput.nextDouble();

            System.out.print(" Enter side1= ");
            double side2 = scInput.nextDouble();

            System.out.print(" Enter side1= ");
            double side3 = scInput.nextDouble();

            triangle.setSide1(side1);
            triangle.setSide2(side2);
            triangle.setSide3(side3);

            System.out.println(triangle);


            System.out.println(" Process show Area, Perimeter and color of triangle ");
            System.out.println("Do you want input side of Triangle");
            System.out.println("1. Yes");
            System.out.println("2. No");
        }


    }

    public static boolean checkAnwser() {
        Scanner scInput = new Scanner(System.in);
        String answer = scInput.nextLine();
        if (answer.equals("Yes")) {
            return true;
        } else return false;
    }
}

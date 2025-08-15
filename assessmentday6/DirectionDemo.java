package assessmentday6;

import java.util.Scanner;

enum Direction {
    NORTH, SOUTH, EAST, WEST
}

public class DirectionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a direction (NORTH, SOUTH, EAST, WEST): ");
        String input = sc.next().toUpperCase();

        try {
            Direction dir = Direction.valueOf(input);

            switch (dir) {
                case NORTH:
                    System.out.println("Move north");
                    break;
                case SOUTH:
                    System.out.println("Move south");
                    break;
                case EAST:
                    System.out.println("Move east");
                    break;
                case WEST:
                    System.out.println("Move west");
                    break;
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid direction entered.");
        }
    }
}


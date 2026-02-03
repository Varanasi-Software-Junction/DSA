package simpleprojects;

import java.util.Scanner;

public class UndoRedoUsingTravel {

    static String[] stations = new String[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String location = "Nai Basti";
        stations[0] = location;
        int locations = 0;
        while (true) {
            System.out.println("\n0-Exit, 1-Show, 2-Move,3-Undo,4-Redo");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 0:
                    return;
                case 1:
                    System.out.println("Show");
                    System.out.println(location);
                    break;
                case 2: {
                    System.out.println("Move\nEnter new location\n");
                    String newlocation = scanner.nextLine();
                    location += " --> " + newlocation;
                    stations[++locations] = location;
                }
                break;
                case 3:
                    System.out.println("Undo");
                    location = stations[--locations];
                    break;
                case 4:
                    System.out.println("Redo");
                    break;
                default:

                    System.out.println("Invalid");
                    break;
            }
        }
    }
}

package Homework6;

import javax.xml.catalog.Catalog;
import java.util.*;

public class Sort {

    public static void Sort(Map<Integer, Laptop> laptop) {


        Set<String> result = new HashSet<>();
        System.out.println("Command Options: ");
        System.out.println("1: search on brend");
        System.out.println("2: search on color");
        System.out.println("3: view all leptop");
        System.out.println("4: Quit");
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
//        while (true) {
        switch (choice) {

            case "1":
                while (true) {
                    System.out.print("search on brend, (for exit enter - *)");
                    System.out.println(laptop);
                    Scanner in1 = new Scanner(System.in);
                    System.out.print("Enter search on brend");
                    String brend = in1.nextLine();
                    System.out.println(brend);
                    for (Map.Entry<Integer, Laptop> item : laptop.entrySet()) {
                        if (brend.equals(item.getValue().brend)) {
                            result.add(String.valueOf(item.getValue()));
                        }
                    }
                    System.out.println(result);

                    if (brend.equals("*")) {
                        System.exit(0);
                    }
                }

            case "2":
                while (true) {
                    System.out.print("search on color, (for exit enter - *)");
                    System.out.println(laptop);
                    Scanner in1 = new Scanner(System.in);
                    System.out.print("Enter search on color");
                    String color = in1.nextLine();

                    for (Map.Entry<Integer, Laptop> item : laptop.entrySet()) {

                        if (color.equals(item.getValue().color)) {
                            result.add(String.valueOf(item.getValue()));
                        }
                    }
                    System.out.println(result);

                    if (color.equals("*")) {
                        System.exit(0);
                    }
                }

            case "3":

                System.out.println("view all leptop");
                System.out.println(laptop);
                System.exit(0);

            case "4":
                System.exit(0);

        }

    }
}
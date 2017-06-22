package task_2_1;

import java.util.Scanner;

public class CollectionApp {
    public static void main(String[] args) {

        CollectionHolder collection = new CollectionHolder();
        while (true) {
            System.out.println("Make your choice: ");
            System.out.println("1.Add element to collection.");
            System.out.println("2.Remove element from collection.");
            System.out.println("3.Enter Integer to check if collection contains it.");
            System.out.println("4.Enter Index to find element.");
            System.out.println("5.Find Max value.");
            System.out.println("6.Find Min value.");
            System.out.println("7.Find Average value. ");
            System.out.println("8.Exit app.");
            System.out.println("9. Print collection.");

            Scanner scanner = new Scanner(System.in);
            int choice = 0;
            try{
                choice = scanner.nextInt();
            }catch (Exception e) {
                System.out.println("Not an integer!");
            }

            switch (choice) {

                case (1): {
                    collection.addElement();
                    break;
                }
                case (2) : {
                    collection.removeElement();
                    break;
                }
                case (3) : {
                    collection.checkElement();
                    break;
                }
                case (4) : {
                    collection.searchIndex();
                    break;
                }
                case (5) : {
                    collection.findMaxValue();
                    break;
                }
                case (6) : {
                    collection.findMinValue();
                    break;
                }
                case (7) : {
                    collection.calcAverage();
                    break;
                }
                case (8) : {
                    collection.exitApp();
                    break;
                }
                case (9) : {
                    for (Integer x : collection.massive
                            ) {
                        System.out.print(x + " ");
                    }
                    System.out.println();
                    break;
                }
                default:
                    System.out.println(" Make correct choice.");
                    break;
            }
        }
    }
}
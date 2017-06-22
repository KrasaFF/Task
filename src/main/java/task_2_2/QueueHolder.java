package task_2_2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class QueueHolder {
    static Queue<Integer> massive;
    private int newInteger;
    private int choice;
    Scanner scanner = new Scanner(System.in);

    QueueHolder() {
        massive = new LinkedList<Integer>();
    }

    private void notIntegerMessage() {
        System.out.println("Not integer, try again.");
    }

    private void checkInput() {

        System.out.println("Enter integer.");
        choice=0;
        boolean isInteger = false;
        while (!isInteger) {
            try {
                newInteger = Integer.parseInt(scanner.next());
                choice = newInteger;
                isInteger = true;
            } catch (Exception e) {
                notIntegerMessage();
                System.out.println("checking");
                System.out.println("\n");
            }
        }
    }

    void addElementToCollection() {
        System.out.println("Add element to collection.");
        checkInput();
        massive.add(newInteger);
    }

    void printMassive() {
        Iterator iterator = massive.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n");
    }

    int makingCorrectChoice() {
        boolean correctChoice = false;


        while (!correctChoice) {
            try {
                choice = Integer.parseInt(scanner.next());
                correctChoice = true;
            } catch (Exception e) {
                System.out.println("Not integer!");

            }
        }
        return choice;
    }
}
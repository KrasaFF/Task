package task_2_1;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class CollectionHolder {
    public ArrayList<Integer> massive;
    private int intNumber;
    private int index;

    CollectionHolder() {
        massive = new ArrayList<Integer>();
    }
    Scanner scanner = new Scanner(System.in);

    // method to enter any integer
    public void checkInput() {
        boolean isInteger = false;
        while (!isInteger) {
            try { intNumber = Integer.parseInt(scanner.next());
                isInteger = true;
            }catch (Exception e) {
                System.out.println("Not integer, try again.");
            }
        }
    }


    //next element to collection
    void addElement() {
        System.out.println("Enter next element to collection.");
        checkInput();
        int newElement;
        ListIterator<Integer> integerIterator=massive.listIterator();
        while(integerIterator.hasNext()){
            newElement = integerIterator.next() +intNumber;
            integerIterator.set(newElement);
        }
        massive.add(intNumber);
    }

    void removeElement() {
        System.out.println("Enter index to remove element.");

        int index=0;
        boolean correctIndex = false;
        while(!correctIndex) {
            checkInput();
            if (intNumber < 0 || intNumber > massive.size()-1) {
                System.out.println("Index is incorrect.");
            } else {
                index = intNumber;
                correctIndex = true;
            }
        }
        int del = massive.get(index);
        ListIterator<Integer> integerListIterator = massive.listIterator();
        int newElement;
        while (integerListIterator.hasNext()) {
            newElement = integerListIterator.next() - del;
            integerListIterator.set(newElement);
        }
        massive.remove(index);
    }

    //check if collection contains element
    void checkElement() {
        System.out.println("Enter integer to check if collection contains it.");
        checkInput();
        boolean result = massive.contains(intNumber);
        if (result) {
            System.out.println("Yes");
        }else System.out.println("No");
    }

    void searchIndex() {
        System.out.println("Enter index to look at element.");
        checkInput();
        index = intNumber;
        System.out.println(massive.get(index));
    }

    void findMaxValue() {
        int maxValue = 0;
        for (Integer n: massive) {
            if (n > maxValue) maxValue = n;
        }
        System.out.println("Max value is: " + maxValue);
    }

    void  findMinValue() {
        int minValue = 0;
        for (Integer n: massive) {
            if (minValue > n) {minValue = n;
        }    else{minValue = n;}
        }
        System.out.println("Min value is: " +minValue);
    }

    void calcAverage() {
        int sum = 0;
        for (Integer n: massive
                ) {
            sum+=n;
        }
        int average = sum/massive.size();
        System.out.println("Average is: " + average);
    }

    void exitApp() {
        System.out.println("Exiting...");
        System.exit(0);
    }
}
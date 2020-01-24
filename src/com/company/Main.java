package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // 1) create a new array list, add some colors (string) and print out the collection

        ArrayList<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Green");
        System.out.println(colors);

        // 2) iterate through all elements in a array list

        for (int i = 0; i < colors.size(); i++) {
            colors.get(i);
        }

        // 3) insert an element into the array list at the first position

        colors.add(0, "Blue");

        // 4) retrieve an element (at a specified index) from a given array list

        ArrayListMethods.RetrieveElementAtSpecifiedIndex(colors, 0);

        // 5) update specific array element by given element

        ArrayListMethods.UpdateElement(colors, "Blue", "Purple");

        // 6) remove the third element from a array list

        ArrayListMethods.RemoveElementByIndex(colors, 2);

        // 7) search an element in a array list

        ArrayListMethods.SearchElement(colors, "Purple");

        // 8) sort a given array list

        ArrayListMethods.SortAlphabetically(colors);

        // 9) copy one array list into another

        ArrayList<String> copyOfColors = new ArrayList<>(colors);

        // 10) reverse elements in a array list.

        ArrayListMethods.ReverseElements(colors);

        // 11) compare two array lists.

        ArrayListMethods.CompareTwoArrayLists(colors, copyOfColors);

        // 12) Write a program of swap two elements in an array list.

        ArrayListMethods.ReplaceTwoElements(colors, 0, 1);

        // 13) join two array lists.

        colors.addAll(copyOfColors);

        // 14) clone an array list to another array list.

        ArrayList<String> cloneOfColors = (ArrayList<String>) colors.clone();

        // 15) empty an array list.

        cloneOfColors.clear();

        // 16) test an array list is empty or not.

        cloneOfColors.isEmpty();

        // 17) replace the second element of a ArrayList with the specified element

        colors.set(1, "Pink");

    }
}

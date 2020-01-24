package com.company;

import java.util.ArrayList;

public abstract class ArrayListMethods {

    public static String RetrieveElementAtSpecifiedIndex(ArrayList<String> arrayList, int index) {
        return arrayList.get(index);
    }

    public static void UpdateElement(ArrayList<String> arrayList, String elementInArray, String newElement) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (elementInArray.equals(arrayList.get(i))) {
                arrayList.set(i, newElement);
            }
        }
    }

    public static void RemoveElementByIndex(ArrayList<String> arrayList, int index) {
        arrayList.remove(index);
    }

    public static boolean SearchElement(ArrayList<String> arrayList, String element) {
        boolean searchResult = false;
        for (int i = 0; i < arrayList.size(); i++) {
            if (element.equals(arrayList.get(i))) {
                searchResult = true;
            }
        }
        return searchResult;
    }

    public static void SortAlphabetically(ArrayList<String> arrayList) {
        boolean loop = true;
        while (loop) {
            int check = 0;
            for (int i = 0; i < arrayList.size() - 1; i++) {
                if (arrayList.get(i).charAt(0) > arrayList.get(i + 1).charAt(0)) {
                    String color;
                    color = arrayList.get(i);
                    arrayList.remove(i);
                    arrayList.add(i + 1, color);
                    check++;
                }
            }
            if (check == 0) {
                loop = false;
            }
        }
    }

    public static void ReverseElements(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.add(i, arrayList.get(arrayList.size() - 1));
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public static boolean CompareTwoArrayLists(ArrayList<String> arrayList1, ArrayList<String> arrayList2) {
        boolean check = true;
        if (arrayList1.size() == arrayList2.size())
            for (int i = 0; i < arrayList1.size(); i++) {
                if (!arrayList1.get(i).equals(arrayList2.get(i))) {
                    check = false;
                }
            }
        return check;
    }

    public static void ReplaceTwoElements(ArrayList<String> arrayList, int firstElementIndex, int secondElementIndex) {
        String color = arrayList.get(secondElementIndex);
        arrayList.set(secondElementIndex, arrayList.get(firstElementIndex));
        arrayList.set(firstElementIndex, color);
    }
}

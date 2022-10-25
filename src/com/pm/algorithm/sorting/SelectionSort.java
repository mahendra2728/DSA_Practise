package com.pm.algorithm.sorting;

import java.util.Arrays;

public class SelectionSort {

  private static int[] array = {6, 9, 3, 1, 2};

  public static void main(String[] args) {
    System.out.println("Before : " + Arrays.toString(array));
    selectionSort();
    System.out.println("After : " + Arrays.toString(array));
  }

  public static void selectionSort() {

    for (int i = 0; i < array.length; i++) {
      int minIndex = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[minIndex]) {
          minIndex = j;
        }
      }

      if (i != minIndex) {
        int temp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = temp;
      }
    }
  }
}

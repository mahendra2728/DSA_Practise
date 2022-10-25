package com.pm.algorithm.sorting;

import java.util.Arrays;

public class BubbleSort {

  private static int[] array = {6, 5, 3, 6, 9, 4, 1};

  public static void main(String[] args) {
    System.out.println("Before : " + Arrays.toString(array));
    bubbleSort();
    System.out.println("After : " + Arrays.toString(array));
  }

  public static void bubbleSort() {
    for (int i = array.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }
}

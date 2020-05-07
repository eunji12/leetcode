package me.home;

import static me.home.arrays.ArraysProblems.*;

public class Main {

  public static void main(String[] args) {

    //LeetCode Arrays Max Consecutive Ones
    findMaxConsecutiveOnes(new int[]{0, 0, 1, 1, 1, 0, 0, 1, 1});

    //LeetCode Arrays Find Numbers with Even Number of Digits
    findNumbers(new int[]{12, 345, 2, 6, 7896});
    //findNumbers2(new int[]{12,345,2,6,7896});

    //LeetCode Arrays Squares of a Sorted Array
    sortedSquares(new int[]{-4, -1, 0, 3, 10});

    //LeetCode Arrays Duplicate Zeros
    duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0});

    //LeetCode Arrays Merge Sorted Array
    merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);

  }
}

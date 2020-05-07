package me.home.arrays;

import java.util.Arrays;

public class ArraysProblems {
  public static int findMaxConsecutiveOnes(int[] nums) {
    System.out.println("hellp");
    int max = 0;
    int cnt = 0;
    int[] var3 = nums;
    int var4 = nums.length;

    for (int var5 = 0; var5 < var4; ++var5) {
      int n = var3[var5];
      if (n == 1) {
        ++cnt;
      } else {
        if (n > max) {
          max = n;
        }

        cnt = 0;
      }
    }

    max = Math.max(max, cnt);
    if (max > 1) {
      ++max;
    }

    return max;
  }

  public static int findNumbers(int[] nums) {
    int digit = 0;
    int result = 0;
    int[] var3 = nums;
    int var4 = nums.length;

    for (int var5 = 0; var5 < var4; ++var5) {
      int n = var3[var5];

      for (int tmp = n; tmp > 0; ++digit) {
        tmp /= 10;
      }

      if (digit % 2 == 0) {
        ++result;
      }

      digit = 0;
    }

    return result;
  }

  public static int findNumbers2(int[] nums) {
    int count = 0;
    int[] var2 = nums;
    int var3 = nums.length;

    for (int var4 = 0; var4 < var3; ++var4) {
      int n = var2[var4];
      if (n + "".length() % 2 == 0) {
        ++count;
      }
    }

    return count;
  }

  public static int[] sortedSquares(int[] A) {
    int[] result = new int[A.length];

    for (int i = 0; i < A.length; ++i) {
      result[i] = A[i] * A[i];
    }

    Arrays.sort(result);
    return result;
  }

  public static void duplicateZeros(int[] arr) {
    System.out.println(Arrays.toString(arr));

    for (int i = 0; i < arr.length; ++i) {
      if (arr[i] == 0) {
        for (int j = arr.length - 1; j > i; --j) {
          arr[j] = arr[j - 1];
        }

        ++i;
      }
    }

  }

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int[] var4 = nums2;
    int var5 = nums2.length;

    for (int var6 = 0; var6 < var5; ++var6) {
      int n2 = var4[var6];
      nums1[m++] = n2;
    }

    Arrays.sort(nums1);
  }
}

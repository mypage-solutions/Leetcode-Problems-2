package com.mykhailo;

import java.util.*;

public class LeetCodeProblems2 {

    // 2177. Find Three Consecutive Integers That Sum to a Given Number
    public static long[] sumOfThree(long num) {
        if (num % 3 == 0) {
            long[] result = new long[3];
            result[0] = num / 3 - 1;
            result[1] = num / 3;
            result[2] = num / 3 + 1;
            return result;
        } else {
            return new long[0];
        }
    }

    // 217. Contains Duplicate
    public static boolean containsDuplicate1(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        Set<Integer> set = new HashSet<>(list);
        return set.size() < nums.length;
    }

    public static boolean containsDuplicate2(int[] nums) {
        Integer[] newNums = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Set<Integer> set = new HashSet<>(Arrays.asList(newNums));
        return set.size() < nums.length;
    }

    // 4. Median of Two Sorted Arrays
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, result, 0, nums1.length);
        System.arraycopy(nums2, 0, result, nums1.length, nums2.length);
        Arrays.sort(result);
        if (result.length % 2 == 0) {
            return (result[result.length / 2 - 1] + result[result.length / 2]) / 2d;
        } else {
            return result[result.length / 2] * 1d;
        }
    }

    // 240. Search a 2D Matrix II
    public static boolean searchMatrix1(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target)
                return true;
            if (matrix[i][j] > target)
                j--;
            else
                i++;
        }
        return false;
    }

    public static boolean searchMatrix2(int[][] matrix, int target) {
        for (int i = matrix.length - 1; i >= 0; i--)
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target)
                    return true;
                if (matrix[i][j] > target)
                    break;
            }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfThree(33)));
        System.out.println(containsDuplicate1(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
        System.out.println(containsDuplicate2(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
        System.out.println(findMedianSortedArrays(new int[]{2, 3}, new int[]{3, 4}));
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {
                18, 21, 23, 26, 30}};
        System.out.println(searchMatrix1(matrix, 29));
        System.out.println(searchMatrix2(matrix, 29));
    }
}

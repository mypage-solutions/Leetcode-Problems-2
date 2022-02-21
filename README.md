![GitHub code size in bytes](https://img.shields.io/github/languages/count/mypage-solutions/Leetcode-Problems-2)
![GitHub top language](https://img.shields.io/github/languages/top/mypage-solutions/Leetcode-Problems-2)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/mypage-solutions/Leetcode-Problems-2)
![GitHub last commit](https://img.shields.io/github/last-commit/mypage-solutions/Leetcode-Problems-2)

# Leetcode Problems Solution 

## Table of Contents

- [General Info](#general-information)
- [Technologies Used](#technologies-used)
- [Project Status](#project-status)
- [Contact](#contact)

## General Information

1. [Find Three Consecutive Integers That Sum to a Given Number](#find-three-consecutive-integers-that-sum-to-a-given-number)
2. [Contains Duplicate](#contains-duplicate)
3. [Median of Two Sorted Arrays](#median-of-two-sorted-arrays)
4. [Search a 2D Matrix](#search-a-2d-matrix)
5. [Missing Number](#missing-number)

<br>

#### Find Three Consecutive Integers That Sum to a Given Number
<a href="https://leetcode.com/problems/find-three-consecutive-integers-that-sum-to-a-given-number/"><em>Description</em></a>
```java
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
```
<br>

#### Contains Duplicate
<a href="https://leetcode.com/problems/contains-duplicate/"><em>Description</em></a>
```java
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
```
<br>

#### Median of Two Sorted Arrays
<a href="https://leetcode.com/problems/median-of-two-sorted-arrays/"><em>Description</em></a>
```java
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
```
<br>

#### Search a 2D Matrix
<a href="https://leetcode.com/problems/search-a-2d-matrix-ii/"><em>Description</em></a>
```java
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
```
<br>

#### Missing Number
<a href="https://leetcode.com/problems/missing-number/submissions/"><em>Description</em></a>
```java
public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        if (nums[0] != 0) {
            return 0;
        }
        while (start < nums.length - 1) {
            start++;
            if (nums[start] != start) {
                return start;
            }
        }
        return nums[nums.length - 1] + 1;
    }
```
<br>

## Technologies Used

<p>
<img src="https://github.com/mypage-solutions/Images/blob/main/Images/devicon/java-original.svg" width="35" height="35" /><span>&nbsp;&nbsp;</span>
<img src="https://github.com/mypage-solutions/Images/blob/main/Images/devicon/intellij-original.svg" width="35" height="35" /><span>&nbsp;&nbsp;</span>
<img src="https://github.com/mypage-solutions/Images/blob/main/Images/devicon/git-original.svg" width="35" height="35" /><span>&nbsp;&nbsp;</span>
<img src="https://github.com/mypage-solutions/Images/blob/main/Images/devicon/github-original.svg" width="35" height="35" /><span>&nbsp;&nbsp;</span>
</p>
  
## Project Status

_In progress_.

## Contact

<p align="center">
<a href="https://twitter.com/Michael22878035"><img src="https://github.com/mypage-solutions/Images/blob/main/Images/icons/twitter-fill.png" /></a>
<a href="mailto:m_musienko@outlook.com"><img src="https://github.com/mypage-solutions/Images/blob/main/Images/icons/mail-fill.png" /></a>
<a href="https://www.linkedin.com/in/mykhailo-musiienko-80849880/"><img src="https://github.com/mypage-solutions/Images/blob/main/Images/icons/linkedin-box-fill.png" /></a>
<a href="https://t.me/Mykhailo_Musiienko"><img src="https://github.com/mypage-solutions/Images/blob/main/Images/icons/telegram-fill.png" /></a>
</p>

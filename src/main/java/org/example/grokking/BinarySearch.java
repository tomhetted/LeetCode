package org.example.grokking;

public class BinarySearch {

    public static int binarySearch(int[] sortedList, int item) {
        int low = 0;
        int mid = 0;
        int high = sortedList.length - 1;
        int guess = 0;

        while (low <= high) {
            mid = low + (high - low) / 2; //safe from overflowing mid counting
            guess = sortedList[mid];

            if (guess == item) {
                return mid;
            } else if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] list = new int[1000];

        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }

        System.out.println(binarySearch(list, 499));
    }

}

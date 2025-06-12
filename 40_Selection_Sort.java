import java.util.*;
public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {10, 220, 30, 140, 2, 1, 50};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;

            for (int j = i+1; j < arr.length ; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }
            }

        }


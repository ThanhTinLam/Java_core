package vn.eLib.array;

public class BubbleSort {
    static void bubbleSort(int arr[]) {
        int temp;
        int i,
                j;

        boolean swapped = false;


        for (i = 0; i < arr.length - 1; i++) {
            swapped = false;


            for (j = 0; j < arr.length - 1 - i; j++) {
                System.out.print("compare elements: [" + arr[j] + ", " + arr[j + 1] + "]");

                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                    System.out.println(" => exchange [" + arr[j] + ", " + arr[j + 1] + "]");
                } else {
                    System.out.println(" => no exchange");
                }
            }

            if (!swapped) {
                break;
            }

            System.out.println("number of loops " + (i + 1));
            display(arr);
        }
    }

    public void display(int arr[]) {
        int i;
        System.out.print("[");

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("]\n");
    }

    public static void main(String[] args) {

        int arr[] = {
                6,
                7,
                0,
                2,
                8,
                1,
                3,
                9,
                4,
                5
        };

        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Array input: ");
        bubbleSort.display(arr);
        System.out.println("-----------------------------");
        bubbleSort.bubbleSort(arr);
        System.out.println("-----------------------------");
        System.out.println("\nArray after sorting: ");
        bubbleSort.display(arr);
    }
}


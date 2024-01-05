package Controller;

public class Algorithm {
    public static class Search {
        public static void linearSearch(float[] arr, float k) {
            int n = arr.length;
            int s = -1;
            for (int i = 0; i < n; i++) {
                if (arr[i] == k) {
                    s = i;
                    break;
                }
            }
            if (s == -1) {
                System.out.println("Unfound!");
            } else {
                System.out.println("The number is found at position " + (s + 1));
            }
        }

        public static void binarySearch(float[] arr, float k) {
            int head = 0;
            int tail = arr.length - 1;
            int s = -1;
            while (head <= tail) {
                int mid = (head + tail) / 2;
                if (arr[mid] == k) {
                    s = mid;
                    break;
                } else if (arr[mid] < k) {
                    head = mid + 1;
                } else {
                    tail = mid - 1;
                }
            }
            if (s == -1) {
                System.out.println("Unfound!");
            } else {
                System.out.println("The number is found at position " + (s + 1));
            }
        }
    }

    public static class Sort {
        public static void bubbleSort(float[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        float temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        public static void quickSort(float[] arr, int low, int high) {
            if (low < high) {
                int pivotIndex = partition(arr, low, high);
                quickSort(arr, low, pivotIndex - 1);
                quickSort(arr, pivotIndex + 1, high);
            }
        }

        public static int partition(float[] arr, int low, int high) {
            float pivot = arr[(low + high) / 2];
            int i = low - 1;
            int j = high + 1;

            while (true) {
                do {
                    i++;
                } while (arr[i] < pivot);
                do {
                    j--;
                } while (arr[j] > pivot);
                if (i >= j) {
                    return j;
                }
                float temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
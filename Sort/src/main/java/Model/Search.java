package Model;

public class Search {
    public void Linearsearch(float[] arr, float k){
        int n = arr.length;
        int s = -1;
        for (int i = 0; i < n; i++){
            if (arr[i] == k){
                s = i;
                break;
            }
        }
        if (s == -1){
            System.out.println("Unfound!");
        } else {
            System.out.println("The number is found at position " + (s + 1));
        }
    }
    
    public void Binarysearch(float[] arr, float k){
        int head = 0;
        int tail = arr.length - 1;
        int s = -1;
        while (head <= tail){
            int mid = (head + tail) / 2;
            if (arr[mid] == k){
                s = mid;
                break;
            } else if (arr[mid] < k){
                head = mid + 1;
            } else {
                tail = mid - 1;
            }
        }
        if (s == -1){
            System.out.println("Unfound!");
        } else {
            System.out.println("The number is found at position " + (s + 1));
        }
    }
}
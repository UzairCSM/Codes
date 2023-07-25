package RecursionQuestions;

public class RotatedBinarySearch {
    public static int Binary(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[start] <= arr[mid]) {
            if ((target >= arr[start] && target <= arr[mid])) {
                return Binary(arr, start, mid - 1, target);
            }
            //  return Binary(arr,start,mid-1,target);
            else {
                return Binary(arr, mid + 1, end, target);
            }
        }
        //  if(arr[start]>=arr[mid]){
        if (target >= arr[mid] && target <= arr[end]) {
            return Binary(arr, mid + 1, end, target);
        }
        return Binary(arr, mid - 1, end, target);

    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
        int target = 2;
        System.out.println(Binary(arr, 0, arr.length - 1, target));
    }
}


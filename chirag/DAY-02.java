 class Star {
    public static void main(String[] args) {
        int rows = 5; 
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// find maximum number in an array
class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8};
        int max = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum number in the array: " + max);

       }  
 }
// }time  and space complexity - O(n)
//count even numbers in an array
class Even{
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8};
        int count = 0; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Count of even numbers in the array: " + count);
    }
}
//time complexity - O(n)
//space complexity - O(1)
//binary search in a sorted array
class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8, 10};
        int target = 7;
        int low = 0;
        int high = arr.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}
//time complexity - O(log n)
//space complexity - O(1)
//two pointer 
class TwoPointer {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5;
        int left = 0;
        int right = arr.length - 1;
        boolean found = false;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("Pair found: " + arr[left] + " and " + arr[right]);
                found = true;
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (!found) {
            System.out.println("No pair found");
        }
    }
}
//time complexity - O(n)
//space complexity - O(1)
//reverse an array
class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
//time complexity - O(n)
//space complexity - O(1)
//fibonacci number
class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to generate
        int a = 0, b = 1;

        System.out.print("Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}

//time complexity - O(2^n)
//space complexity - O(1)
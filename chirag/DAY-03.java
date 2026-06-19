//array program
class Array{
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
//reverse array
class ReverseArray{
    public static void main(String[] args) {
        vector<int> temp ,n=arr size ();
        for(int i=0;i<arr size();i++){
            temp[i] = arr[arr.size() - 1 - i];
        }
        for(int i=0;i<arr size();i++){
            System.out.println(temp[i]);
        }
    }
}
//two pointer approach in array
class TwoPointer{
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
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

package arrays;

public class BasicProblems {

    static int AvgofArr(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int avg = sum / n;
        return avg;
    }

    static int[] MultiplyBy10(int[] arr) {
        int n = arr.length;
        int element;
        int[] newArr = new int[n];
        for (int i = 0; i < n; i++) {
            element = arr[i];
            element = element * 10;
            newArr[i] = element;
        }
        return newArr;
    }

    static boolean linearSearch(int[] arr, int key) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    static int[] getPosNegSum(int arr[]){
        int n = arr.length;
        int PosSum = 0;
        int NegSum = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                PosSum+= arr[i];
            }
            else{
                NegSum+= arr[i];
            }
        }
        int ans[] = {PosSum,NegSum};
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 10, -20, 30, -40, 50 };
        int ans[] = getPosNegSum(arr);
        for (int value: ans){
            System.out.println(value);

        }
        // int result = AvgofArr(arr);
        // System.out.println("Average = " + result);

        // System.out.println(linearSearch(arr, 40));
        
        // int[] result = MultiplyBy10(arr);
        // for (int value : result) {
        //     System.out.print(value + " ");
        // }

        // System.out.println();
    }

}

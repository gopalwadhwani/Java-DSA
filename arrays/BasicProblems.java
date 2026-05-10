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

    static int[] getPosNegSum(int arr[]) {
        int n = arr.length;
        int PosSum = 0;
        int NegSum = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                PosSum += arr[i];
            } else {
                NegSum += arr[i];
            }
        }
        int ans[] = { PosSum, NegSum };
        return ans;
    }

    static int[] getZeroOneCount(int arr[]) {
        int n = arr.length;
        int ZeroCount = 0;
        int OneCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                ZeroCount++;
            } else {
                OneCount++;
            }
        }
        int ans[] = { ZeroCount, OneCount };
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 0, 0, 0, 0 };
        int ans[] = getZeroOneCount(arr);
        System.out.println("Zero count: " + ans[0]);
        System.out.println("One count: " + ans[1]);
        // int ans[] = getPosNegSum(arr);

        // System.out.println("Positive Sum = " + ans[0]);
        // System.out.println("Negative Sum = " + ans[1]);
        // int result = AvgofArr(arr);
        // System.out.println("Average = " + result);

        // System.out.println(linearSearch(arr, 40));

        // int[] result = MultiplyBy10(arr);
        // for (int value : result) {
        // System.out.print(value + " ");
        // }

        // System.out.println();
    }

}

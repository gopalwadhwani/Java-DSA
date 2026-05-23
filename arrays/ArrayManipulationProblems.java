package arrays;

public class ArrayManipulationProblems {
    // static void shiftBy1(int arr[]){
    //     int n = arr.length;
    //     int temp = arr[n-1];
        
    //     for(int i=n-1 ;  i > 0 ; i++){
    //         arr[i] = arr[i - 1];
    //     }
    //     arr[0] = temp;
    // }


    // static void reverseArray(int arr[]){
    //     int n = arr.length;
    //     int i = 0;
    //     int j = n-1;
    //     while (i<=j){
    //         int temp = arr[i];
    //         arr[i] = arr[j];
    //         arr[j] = temp;
    //         i++;
    //         j--;
    //     }
    // }
    // static void printAlternate(int arr[]){
    //     int n = arr.length;
    //     int i = 0;
    //     int j = n-1;
    //     while(i<=j){
    //         if(i==j){
    //             System.out.print(arr[i] + " ");
    //             i++;
    //         } else{
    //             System.out.print(arr[i] + " ");
    //             i++;
    //             System.out.print(arr[j] + " ");
    //             j--;
    //         }
    //     }
    
    // }

    static void PrintFirstSecondHalf(int arr[]){
        int n = arr.length;
        int mid = n/2;
        for(int i=0; i<mid; i++){
             System.out.print(arr[i] + " ");
        }
        for(int i=mid; i<n ; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        // printAlternate(arr);
        // reverseArray(arr);
        // for(int num: arr){
        //     System.out.println(num + " ");
        // }
        // shiftBy1(arr);
        // for(int num: arr){
        //     System.out.print(num + " ");
        // }
    }
}
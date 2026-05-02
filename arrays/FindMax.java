package arrays;

public class FindMax{
    public static void main(String[] args) {
        int arr[]= {3,2,-5,21,10};
        int n = arr.length;
        int maxValue = arr[0];

        for(int i=0 ; i<n ; i++){ 
            if(arr[i]>maxValue){
                maxValue=arr[i];
            }
        }
        System.out.println("Maximum value = " + maxValue);
    }
}
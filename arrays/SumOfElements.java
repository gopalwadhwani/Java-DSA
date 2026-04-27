package arrays;

public class SumOfElements{
    public static void main(String[] args) {
        
        int arr[]= {10,20,30,40,50};
        int n=arr.length;
        int sum=0;

        for(int i=1; i<=n; i++){
            int value = arr[i];
            sum= sum + value;
        }
        System.out.println("sum of elements in a array is:"+sum);
    }
}
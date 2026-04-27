package arrays;

public class ProductOfArrElements{
    public static void main(String[] args) {
        
        int arr[]= {10,20,30,40,50};
        int n=arr.length;
        int ans=1;

        for(int i=1; i<=n; i++){
            int value = arr[i];
            ans = ans * value;
        }
        System.out.println("Product of elements in a array is:"+ans);
    }
}
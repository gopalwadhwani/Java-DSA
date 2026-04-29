package arrays;

public class Array {

    public static void main(String[] args) {

        int arr1[] = new int[3];
        int[] arr2 = { 1, 2, 3 };

        System.out.println(arr1.length);
        System.out.println(arr2[0]);

        // Array initialization
        int numbers[] = { 10, 20, 30, 40, 50 };
        int marks[] = new int[5];

        // Accessing elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);

        // Array length
        System.out.println("Array length: " + numbers.length);

        // Traversing using for loop
        System.out.println("\nFor loop traversal:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Traversing using while loop
        System.out.println("\n\nWhile loop traversal:");
        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i++;
        }

        // Traversing using do-while loop
        System.out.println("\n\nDo-while loop traversal:");
        int j = 0;
        do {
            System.out.print(numbers[j] + " ");
            j++;
        } while (j < numbers.length);

        // Traversing using enhanced for loop
        System.out.println("\n\nFor-each loop traversal:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Updating array element
        numbers[1] = 99;
        System.out.println("\n\nUpdated second element: " + numbers[1]);

        // Default values in array
        System.out.println("\nDefault values in marks array:");
        for (int value : marks) {
            System.out.print(value + " ");
        }
    }
}
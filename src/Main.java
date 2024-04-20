import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Array arr = new Array();
        System.out.println("Enter array size: ");
        int arraySize = in.nextInt();
        int[] array = new int[arraySize];

        System.out.println("Enter array elements: ");
        arr.inputArray(array, arraySize);

        System.out.println("Enter the required array segment [a;b]: ");
        int a = in.nextInt();
        int b = in.nextInt();

        arr.printArray(array, arraySize);
        System.out.println("Sum: " + arr.Sum(array, arraySize));
        System.out.println("Number of even numbers: " + arr.evenNumberCounter(array, arraySize));
        System.out.println("The number of numbers belonging to the segment [" + a + "; " + b + "]: " +
                arr.numberOfNumbersBelongingToTheSegment(array, arraySize, a, b));
        System.out.println("Are all elements positive: " + arr.positiveElements(array, arraySize));
        arr.reverseOrder(array, arraySize);
        System.out.println("Inverted array: ");
        arr.printArray(array, arraySize);
    }
}

import java.util.Scanner;
public class Array
{
    //задание 1.8
    public void printArray(int[] array, int arraySize)
    {
        System.out.print("Array: ");
        for(int i = 0; i < arraySize; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    //задание 1.9
    public void inputArray(int[] array, int arraySize)
    {
        for(int i = 0; i < arraySize; i++)
        {
            Scanner in = new Scanner(System.in);
            array[i] = in.nextInt();
        }
    }

    //задание 1.10
    public int Sum(int[] array, int arraySize)
    {
        int sum = 0;
        for(int i = 0; i < arraySize; i++)
        {
            sum += array[i];
        }
        return sum;
    }

    //задание 1.11
    public int evenNumberCounter(int[] array, int arraySize)
    {
        int count = 0;
        for(int i = 0; i < arraySize; i++)
        {
            if(array[i] % 2 == 0 && array[i] != 0) count++;
        }
        return count;
    }

    //задание 1.12
    public int numberOfNumbersBelongingToTheSegment(int[] array, int arraySize, double a, double b)
    {
        int count = 0;

        if( a > b)
        {
            double temp = a;
            a = b;
            b = temp;
        }

        for(int i = 0; i < arraySize; i++)
        {
            if(array[i] >= a && array[i] <= b) count++;
        }
        return count;
    }

    //задание 1.13
    public boolean positiveElements(int[] array, int arraySize)
    {
        int count = 0;

        for (int i = 0; i < arraySize; i++)
        {
            if(array[i] < 0) count++;
        }

        if(count > 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    //задание 1.14
    public void reverseOrder(int[] array, int arraySize)
    {
        for (int i = 0; i < arraySize / 2; i++)
        {
            int temp  = array[i];
            array[i] = array[arraySize - i - 1];
            array[arraySize - i - 1] = temp;
        }
    }
}
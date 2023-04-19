import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputNumbers = scanner.nextLine().split(", ");
        int[] numbers = new int[inputNumbers.length];
        for (int i = 0; i < inputNumbers.length; i++) {
            numbers[i]=Integer.parseInt(inputNumbers[i]);
        }
        String end = scanner.nextLine();
        Lake lake = new Lake(numbers);

        int lastEvenIndex = 0;
        if(numbers.length%2==0)
        {
            lastEvenIndex = numbers.length-2;
        }
        else{
            lastEvenIndex= numbers.length-1;
        }
        for (int i = 0; i < numbers.length; i+=2) {
            System.out.print(numbers[i]+", ");
            if(i==lastEvenIndex)
            {
                i=-1;
            }
        }
    }
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimeNumbers implements Iterable<Integer>{
    List<Integer> numbers = new ArrayList<>();
    static boolean isPrime(int n)
    {

        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
    public void add(Integer integer)
    {
        numbers.add(integer);
    }
    public void printPrimeNumbers()
    {
        Iterator<Integer> it = numbers.iterator();

        for(Integer num: numbers) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }
    private final class PrimeNumbersIterator implements Iterator<Integer>{
        int index = 0;
        @Override
        public boolean hasNext() {
            return this.index>=0;
        }

        @Override
        public Integer next() {
            return numbers.get(index);
        }
    }
    @Override
    public Iterator<Integer> iterator() {
        return new PrimeNumbersIterator();
    }

    public static void main(String[] args) {
        PrimeNumbers num = new PrimeNumbers();
        num.add(12);
        num.add(11);
        num.add(15);
        num.add(1);
        num.add(29);
        num.printPrimeNumbers();

    }
}

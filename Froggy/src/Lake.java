import java.util.ArrayList;
import java.util.Iterator;

public class Lake implements Iterable<Integer>{
int[] lake = new int[10];

    public Lake() {
    }

    public Lake(int[] lake) {
        this.lake = lake;
    }

    private final class Frog implements Iterator<Integer>{
        private int index = 0;
        private int lastEvenIndex = index-1;
        @Override
        public boolean hasNext() {
            return index>=0;
        }

        @Override
        public Integer next() {
            for (int i = 0; i < lake.length; i++) {
                Integer frog = lake[i];
            }
            return frog;
        }
    }
    @Override
    public Iterator iterator() {
        return new Frog();
    }
}

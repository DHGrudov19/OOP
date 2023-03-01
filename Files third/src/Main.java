import java.io.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
      List<Integer> ints = new ArrayList<>();
        ints.add(10);
        ints.add(12);
        ints.add(13);
      String path = "C:\\Users\\DHGrudov19\\Documents\\OOP\\OOP\\Files third\\IDK.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(ints);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
        List<Integer> deserializedInts = (List<Integer>) objectInputStream.readObject();

        for (int i = 0; i < deserializedInts.size(); i++) {
            System.out.println(deserializedInts.get(i));
        }


    }

}

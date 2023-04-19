public class Main {
    public static void main(String[] args) {
        Jar<Integer> ints = new Jar<>();
        ints.add(10);
        Jar<String> string = new Jar<>();
        string.add("wasssa");
        System.out.println(ints.get(0));
        System.out.println(string.get(0));
    }

}

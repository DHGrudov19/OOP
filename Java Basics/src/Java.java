import java.util.Scanner;
public class Java {
    public static void main(String[] arguments){
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        checkString(word);
    }
    public static void checkString(String word)
    {
      int len = word.length()/2;
      if(word.length()%2==0)
      {
          System.out.println(word.charAt(len-1)+""+word.charAt(len));
      }
      else
      {
          System.out.println(word.charAt(len));
      }
    }
}

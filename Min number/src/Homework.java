import java.util.Scanner;

public class Homework {


        static void minNum(int a, int b, int c) {
            int firstMin;
            firstMin = Math.min(Math.min(a, b), c);
            System.out.println(firstMin);
        }

        static void countVowels(String word)
        {
            int count = 0;
            for(int i = 0; i < word.length(); i++)
            {
                char ch = word.charAt(i);
                if(ch=='a'||ch== 'e'||ch== 'i'|| ch=='o'|| ch=='u'||ch=='A'||ch== 'E'||ch== 'I'|| ch=='O'|| ch=='U' )
                {
                    count++;
                }
            }
            System.out.println(count);
        }

        static void isLeapYear(int year)
        {
            if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            {
                System.out.println("Year is leap");
            }
            else
            {
                System.out.println("Year is not leap");
            }
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a, b, c;
            int year;
            String word;
            System.out.println("Enter three numbers!");
            a = Integer.parseInt(scan.nextLine());
            b = Integer.parseInt(scan.nextLine());
            c = Integer.parseInt(scan.nextLine());
            System.out.println("The smallest of them is: ");
            minNum(a, b, c);
            System.out.println("Enter word!");
            word=scan.nextLine();
            System.out.println("The number of vowels is: ");
            countVowels(word);
            System.out.println("Enter year! ");
            year = Integer.parseInt(scan.nextLine());
            isLeapYear(year);

        }
    }



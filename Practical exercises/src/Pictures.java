import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pictures extends Picture {
    List<Picture> pictureList = new ArrayList<>();

    public void returnByAuthor(String author) {
        for (int i = 0; i < pictureList.size(); i++) {
            if (pictureList.get(i).getAuthor().equals(author))
                System.out.println(pictureList.get(i));
        }
    }

    public void returnAvgPrice(String author) {
        int count = 0;
        double tempPrice = 0;
        if (author.isEmpty()) {
            for (int i = 0; i < pictureList.size(); i++) {
                tempPrice += pictureList.get(i).getPrice();
            }
            System.out.println(tempPrice / pictureList.size());
        } else {
            for (int i = 0; i < pictureList.size(); i++) {
                if (pictureList.get(i).getAuthor().equals(author))
                    count++;
            }
            for (int i = 0; i < pictureList.size(); i++) {
                if (pictureList.get(i).getAuthor().equals(author))
                    tempPrice += pictureList.get(i).getPrice();
            }
            System.out.println(tempPrice / count);
        }
    }

    public void findMostExpensive() {
        double temp = pictureList.get(0).getPrice();
        for (int i = 0; i < pictureList.size(); i++) {
            if (temp < pictureList.get(i).getPrice()) {
                temp = pictureList.get(i).getPrice();
            }
        }
        for (int i = 0; i < pictureList.size(); i++) {
            if (pictureList.get(i).getPrice() == temp) {
                System.out.println(pictureList.get(i));
            }
        }
    }

    public Pictures(List<Picture> pictureList) {
        this.pictureList = pictureList;
    }

    public Pictures() {
    }

    public List<Picture> getPictureList() {
        for (int i = 0; i < pictureList.size(); i++) {
            System.out.println(pictureList.get(i));
        }
        return pictureList;
    }

    public void setPictureList(List<Picture> pictureList) {
        this.pictureList = pictureList;
    }

    public void addPictureToList(Picture picture) {
        if (pictureList.contains(picture)) {
            System.out.println("Picture already exists!");
        } else {
            pictureList.add(picture);
        }
    }

    public void deletePictureFromList(int id) {
        int count = 0;
        for(int i = 0; i < pictureList.size(); i++)
        {
            if(pictureList.get(i).getId()==id)
            {
                pictureList.remove(count);
            }
            count++;
        }
    }

    public void returnByName(String name) {
        Picture obj = new Picture();
        if (author.equals(name)) {
            for (Picture i : pictureList) {
                System.out.println(i);
            }
        }
    }

    public static void menu() {
        System.out.println("MENU:");
        System.out.println("1.Add picture");
        System.out.println("2.Delete picture");
        System.out.println("3.Info for picture by author");
        System.out.println("4.Find most expensive by author");
        System.out.println("5.Find average price");
        System.out.println("6.Info for all pictures");
        System.out.println("0.Exit");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pictures obj = new Pictures();
        Picture firstPicture = new Picture(1, "Ivan", "Dimitar", 10);
        Picture secondPicture = new Picture(2, "Ivan", "Ivan", 10);
        Picture thirdPicture = new Picture(3, "Kirooo", "Dimitar", 1011);


        obj.addPictureToList(firstPicture);
        obj.addPictureToList(secondPicture);
        obj.addPictureToList(thirdPicture);



        menu();
        int answer = Integer.parseInt(scanner.nextLine());
while(answer!=0){

            if (answer == 1) {
                int id = Integer.parseInt(scanner.nextLine());
                String name = scanner.nextLine();
                String author = scanner.nextLine();
                double price = Double.parseDouble(scanner.nextLine());
                Picture newPicture = new Picture(id, name, author, price);
                obj.addPictureToList(newPicture);
                menu();
                answer = Integer.parseInt(scanner.nextLine());
            }
            else if (answer == 2) {
                System.out.println("Delete picture with id: ");
                int answer1 = Integer.parseInt(scanner.nextLine());
                obj.deletePictureFromList(answer1);
                menu();
                answer = Integer.parseInt(scanner.nextLine());
            }

            else if (answer == 3) {
                System.out.println("Enter author's name: ");
                String author = scanner.nextLine();
                obj.returnByAuthor(author);
                menu();
                answer = Integer.parseInt(scanner.nextLine());
            }

            else if (answer == 4) {
                System.out.println("The most expensive picture");
                obj.findMostExpensive();
                menu();
                answer = Integer.parseInt(scanner.nextLine());
            }

            else if (answer == 5) {
                System.out.println("Enter average price by author: ");
                String author = scanner.nextLine();
                obj.returnAvgPrice(author);
                menu();
                answer = Integer.parseInt(scanner.nextLine());
            }
            else if (answer == 6) {
                System.out.println("List of all pictures");
                obj.getPictureList();
                menu();
                answer = Integer.parseInt(scanner.nextLine());
            }
            else if (answer == 0) {
                System.out.println("End");
            }

        }
    }
    }


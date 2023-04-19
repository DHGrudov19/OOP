import java.util.*;

public class FilmCollection {
    List<Film> filmList = new ArrayList<>();



    public void addFilm(Film film)
    {
        if(!filmList.contains(film)) {
            filmList.add(film);
        }
        else {
            System.out.println("The film already exists!");
        }
    }

    public void removeFilm(int id)
    {
        int count=0;
        for (int i = 0; i < filmList.size(); i++) {
            if (filmList.get(i).getId() == id) {
                filmList.remove(count);
            }
            count++;
        }

    }

    public void searchByName(String name)
    {
        int count=0;
        for (int i = 0; i < filmList.size(); i++) {
            if(filmList.get(i).getName().equals(name))
            {
                System.out.println(filmList.get(i));
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("Movie with this name does not exists!");
        }
    }
    public void searchByYear(int year)
    {
        int count=0;
        for (int i = 0; i < filmList.size(); i++) {

            if(filmList.get(i).getYear()==year)
            {
                System.out.println(filmList.get(i));
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("Film from this year does not exists!");
        }
    }
    public void printSortedByYear() {
      Collections.sort(filmList);
      for(Film film: filmList)
      {
          System.out.println(film);
      }
    }
    public FilmCollection() {
    }

    public FilmCollection(List<Film> filmList) {
        this.filmList = filmList;
    }

    public List<Film> getFilmList() {
        return filmList;
    }

    public void setFilmList(List<Film> filmList) {
        this.filmList = filmList;
    }

    public static void Menu()
    {
        System.out.println("Menu:");
        System.out.println("1.Add film");
        System.out.println("2.Delete film");
        System.out.println("3.Search film");
        System.out.println("4.List all films");
        System.out.println("0.Exit");
    }
    public static void SearchMenu()
    {
        System.out.println("Search By:");
        System.out.println("1.Search by year");
        System.out.println("2.Search by name");
        System.out.println("0.Exit");
    }

    public static void main(String[] args) {
        Film obj = new Film(1,"Shawshank redemption","Drama",1994,142);
        Film obj1 = new Film(2,"The Godfather","Criminal, Drama",1972,175);
        Film obj2 = new Film(3,"The dark knight","Action, Crime, Drama",2008,152);
        Film obj3 = new Film(4,"Schindler's List","Biography, Drama, History",1993,195);

        FilmCollection collection = new FilmCollection();
        collection.addFilm(obj);
        collection.addFilm(obj1);
        collection.addFilm(obj2);
        collection.addFilm(obj3);

        List<Film> films = new ArrayList<>();
films.add(obj);

        Scanner scanner = new Scanner(System.in);
        int answer;
            Menu();
            answer=scanner.nextInt();
        //scanner.nextLine();
        while(answer!=0) {
            if (answer == 1) {
                System.out.println("Add film:");
                System.out.println("Enter id:");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter name:");
                String name;
                name= scanner.nextLine();

                System.out.println("Enter genre:");
                String genre;
                genre= scanner.nextLine();

                System.out.println("Enter year:");
                int year = scanner.nextInt();
                System.out.println("Enter duration:");
                double duration = scanner.nextDouble();
                Film film = new Film(id, name, genre, year, duration);
                collection.addFilm(film);
                System.out.println("Your film was added!");
                Menu();
                answer=scanner.nextInt();

            }
            if (answer == 2) {
                System.out.println("Remove film by id:");
                System.out.println("Enter id:");
                int id = scanner.nextInt();
                collection.removeFilm(id);
                System.out.println("Film with id " + id + " was removed!");
                Menu();
                answer=scanner.nextInt();

            }
            if (answer == 3) {
                int secondaryAnswer;
                int year;
                String name;
                SearchMenu();
                secondaryAnswer = scanner.nextInt();
                if (secondaryAnswer == 1) {
                    System.out.println("Enter year:");
                    year = scanner.nextInt();
                    collection.searchByYear(year);
                }
                if (secondaryAnswer == 2) {
                    System.out.println("Enter name:");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    collection.searchByName(name);
                }
                Menu();
                answer = scanner.nextInt();
            }
            if (answer == 4) {
                System.out.println("List of all films:");
                collection.printSortedByYear();
                Menu();
                answer = scanner.nextInt();
            }
        }





    }
}

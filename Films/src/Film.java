public class Film implements Comparable<Film>{
    private int id;
    private String name;
    private String genre;
    private int year;
    private double  duration;

    @Override
    public int compareTo(Film film) {
        if(year==film.year){
            return 0;
        }
        else if(year> film.year)
        {
            return 1;
        }
        else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                ", duration=" + duration +
                '}';
    }

    public Film() {
    }

    public Film(int id, String name, String genre, int year, double duration) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }



    public static void main(String[] args) {
        Film obj = new Film(1,"s","r",2,2);
        System.out.println(obj);
    }
}

public class Humam {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    public Humam(String name, int yearOfBirth, String town, String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        }
        this.town = town;
        if (town == null) {
            this.town = "Информация не указана";
        }
        this.jobTitle = jobTitle;
        if (jobTitle == null) {
            this.jobTitle = "Информация не указана";
        }
        this.name = name;
        if (name == null) {
            this.name = "Информация не указана";
        }
    }
    public void introduceYourself() {
        System.out.println("Привет! Меня зовут " + name + " Я из города " + town + " родил ся/ась в "
                + yearOfBirth + " году. Я работаю на должности " + jobTitle + "." + " Будем знакомы! ");
    }
}

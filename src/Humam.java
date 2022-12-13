public class Humam {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    public Humam(String name, int yearOfBirth, String town, String jobTitle) {
        if (this.yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else if (this.yearOfBirth < 0) {
            this.yearOfBirth = 0;
        }

        if (this.town != null) {
            this.town = town;
        } else if (this.town == null) {
            this.town = "Информация не указана";
        }
        if (this.jobTitle != null) {
            this.jobTitle = jobTitle;
        } else if (this.jobTitle == null) {
            this.jobTitle = "Информация не указана";
        }

        if (this.name != null) {
            this.name = name;
        } else if (this.name == null) {
            this.name = "Информация не указана";
        }

    }
    void protectFromNull() {

    }

    public void introduceYourself() {
        System.out.println("Привет! Меня зовут " + name + " Я из города " + town + " родил ся/ась в "
                + yearOfBirth + " году. Я работаю на должности " + jobTitle + "." + " Будем знакомы! ");
    }
}

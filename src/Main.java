public class Main {
    public static void main(String[] args) {

        Humam humam1 = new Humam();
        humam1.name = "Максим";
        humam1.yearOfBirth = 1988;
        humam1.town = "Минск";
        humam1.jobTitle = "бренд-менеджер";

        Humam humam2 = new Humam();
        humam2.name = "Аня";
        humam2.yearOfBirth = 1993;
        humam2.town = "Москва";
        humam2.jobTitle = "методист образовательных программ";

        Humam humam3 = new Humam();
        humam3.name = "Катя";
        humam3.yearOfBirth = 1992;
        humam3.town = "Калининград";
        humam3.jobTitle = "продакт-менеджер";

        Humam humam4 = new Humam();
        humam4.name = "Москва";
        humam4.yearOfBirth = 1995;
        humam4.town = "Москва";
        humam4.jobTitle = "директор по развитию бизнеса";

        humam1.introduceYourself();
        humam2.introduceYourself();
        humam3.introduceYourself();
        humam4.introduceYourself();

    }
}
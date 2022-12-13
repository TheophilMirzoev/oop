public class Main {
    public static void main(String[] args) {

        Humam humam1 = new Humam("Максим", 1988, "Минск", "бренд-менеджер");
        Humam humam2 = new Humam("Аня",1993, "Москва", "методист образовательных программ");
        Humam humam3 = new Humam("Катя", 1992, "Калининград", "продакт-менеджер");
        Humam humam4 = new Humam("Москва", 1995, "Москва", "директор по развитию бизнеса");

        humam1.introduceYourself();
        humam2.introduceYourself();
        humam3.introduceYourself();
        humam4.introduceYourself();
    }
}
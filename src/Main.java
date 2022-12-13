public class Main {
    public static void main(String[] args) {

        Humam maksim = new Humam("Максим", 1988, "Минск", "бренд-менеджер");
        Humam anna = new Humam("Аня",1993, "Москва", "методист образовательных программ");
        Humam katya = new Humam("Катя", 1992, "Калининград", "продакт-менеджер");
        Humam artem = new Humam("Артем", 1995, "Москва", "директор по развитию бизнеса");
        maksim.introduceYourself();
        anna.introduceYourself();
        katya.introduceYourself();
        artem.introduceYourself();
    }
}
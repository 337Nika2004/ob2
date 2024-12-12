public class Main {
    public static void main(String[] args) {
        Author mia = new Author("Ли", "Мие");
        Author shimada = new Author("Содзи", "Симада");

        Book worldInDream = new Book ( "Магазин снов мистера Талергута", mia,  2020);
        Book worldInDream2 = new Book ( "Магазин снов мистера Талергута", mia,  2020);
        Book detective = new Book ("Хрустальная пирамида", shimada , 2024);

        System.out.println(worldInDream.equals(worldInDream2));
        System.out.println(worldInDream.equals(detective));

        System.out.println(worldInDream);
        System.out.println(detective);

        worldInDream.setPublicationYear(2022);
        System.out.println(worldInDream);

        System.out.println(worldInDream.hashCode());
    }
}
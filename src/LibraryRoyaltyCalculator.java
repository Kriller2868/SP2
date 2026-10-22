//MIDLERTIDIG MAIN

public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {
        Author olga = new Author("Olga Ravn");
        olga.addTitle(new PrintedBook("Celestine", "SKØN", 140, 166));
        olga.addTitle(new AudioBook("Celestine", "SKØN", 140, 192));
        olga.addTitle(new EAudioBook("Hovsa min hest faldt", "TE", 50, 97, 205, 300));
        olga.addTitle(new EBook("Jayden gik en tur i skoven", "FAG", 50, 97, 205, 360000, true));
        olga.addTitle(new EBook("Jaydens dybbeste tanker", "LYRIK", 50, 97, 205, 20000, false));

        System.out.printf("%s: %.2fkr%n", olga.getName(), olga.calculateRoyalties());

        //Author jayden = new Author("Jayden shu");
        // jayden.addTitle(new PrintedBook("Velo freeze", "DAUS", 140, 189));

        // System.out.println(olga.getName() +  ": " + olga.calculateRoyalties() + "kr");

        //System.out.printf("%s: %.2fkr%n", jayden.getName(), jayden.calculateRoyalties());

        // Author jaydenS = new Author("Jayden smith");
        // jaydenS.addTitle(new EAudioBook("Jaydens eventyr", "FAG", 50, 97, 205, 192));
        // jaydenS.addTitle(new EBook("Jayden eventyr tid", "FAG", 50, 97, 205, 360000, false));
        // jaydenS.addTitle(new EBook("Jayden eventyr tid", "FAG", 50, 97, 205, 360000, true));
        // jaydenS.addTitle(new PrintedBook("varme tider i skoven med jayden", "BI", 140, 166));
        // jaydenS.addTitle(new AudioBook("how to git gud with jayden: Fortnite edition", "TE", 140, 192));
        // System.out.printf("%s: %.2fkr%n", jaydenS.getName(), jaydenS.calculateRoyalties());
    }
}
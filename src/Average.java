import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        float math, phy, chem, music, hist, tur;
        System.out.println("Please enter your math score: ");
        math = take.nextFloat();
        System.out.println("Please enter your phy score: ");
        phy = take.nextFloat();
        System.out.println("Please enter your chem score: ");
        chem = take.nextFloat();
        System.out.println("Please enter your music score: ");
        music = take.nextFloat();
        System.out.println("Please enter your hist score: ");
        hist = take.nextFloat();
        System.out.println("Please enter your tur score: ");
        tur = take.nextFloat();
        float sum = math + phy + chem + music + hist + tur;
        float average = sum / 6;
        boolean b = average >= 60;
        System.out.println("Your average: " + average);
        String condition = b ? "Passed" : "Not Passed";
        System.out.println("End of the year: " + condition );
    }
}

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        Matematic schoolMatematic = new Matematic(20, 2);
        schoolMatematic.name = "Иван";
        schoolMatematic.surname = "?";


        System.out.println(schoolMatematic.calculateSqareSurface( side: 5));


    }
}

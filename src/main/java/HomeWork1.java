import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String line = scan.nextLine();
        System.out.println("Enter your city");
        String line2 = scan.nextLine();
        System.out.println("Enter your age");
        //scanner nextInt has minor bug and consumes 2 scans if after nextInt follows nextLine
        int i1 = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your hobby");
        String line3 = scan.nextLine();
        System.out.println("Name:" + line);
        System.out.println("City:" + line2);
        System.out.println("Age:" + i1);
        System.out.println("Hobby:" + line3);
        System.out.println("Человек по имени " + line + " живёт в городе " + line2 + ". Ему " + i1 +
                " лет и он любит заниматься " + line3 + ".");
        System.out.println("\\\"" + line +"\""+ " - name\n" +
                line2 + " - city\n" +
                i1 + " - age\n" +
                line3 + " - hobby\n");
    }
}

import java.time.LocalDate;
import java.util.Scanner;

class Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var dateString = scan.next();
        String[] dateArrayString = dateString.split("/");

        var day = Integer.parseInt(dateArrayString[0]);
        var month = Integer.parseInt(dateArrayString[1]);
        var year = Integer.parseInt(dateArrayString[2]);

        try {
            LocalDate date = LocalDate.of(year, month, day);
            System.out.println(date);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        scan.close();
    }
}
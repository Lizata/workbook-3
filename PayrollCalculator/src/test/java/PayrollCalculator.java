import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator {
    public static void main(String[] args) {
        // id|name|hours-worked|pay-rate

        try (BufferedReader reader = new BufferedReader(new FileReader("employees.csv"))) {
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                 String[] data = line.split ("\\|");
                 if (data.length == 4) {
                     int id =
    Integer.parseInt (data[0]);
                     String name =data[1];
                     double hoursWorked = Double.parseDouble (data[2]);
                     double payRate = Double.parseDouble (data[3]);

                     // Calculate pay for the employee
                     double totalPay = hoursWorked * payRate;

                     // Output the pay information
                     System.out.println("Employee ID:" + id);
                     System.out.println("Employee Name:" + name);
                     System.out.println("Hours Worked:" + hoursWorked);
                     System.out.println("Total pay: $" + totalPay);
                     System.out.println();
                 }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



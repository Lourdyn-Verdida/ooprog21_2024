import java.util.Scanner;

public class BloodData {
    public static void main(String[] args) {
        TestBloodData patient = new TestBloodData();
        Scanner scanner = new Scanner(System.in);

         System.out.print("Enter blood type (A, B, AB, O): ");
        String bloodType = scanner.nextLine();

        System.out.print("Enter Rh factor (+ or -): ");
        String rhFactor = scanner.nextLine();
        patient.setBlood(bloodType);
        patient.setRH(rhFactor);

        patient.displayBloodInfo();
        
          }
}
public class TestBloodData {
    private  String bloodType;
    private  String rhFactor;

    public TestBloodData() {
        bloodType = "A";
        rhFactor = "-";
    }

    public TestBloodData(String bloodType, String rhFactor) {
        this.setBlood(bloodType);
        this.setRH(rhFactor);
    }

    public void setBlood(String bloodType) {
        if (bloodType.equals("A") || bloodType.equals("B") || bloodType.equals("AB") || bloodType.equals("O")) {
            this.bloodType = bloodType;
        } else {
            System.out.println("Invalid blood type");
        }
    }
    public String getBlood() {
        return bloodType;
    }
    public void setRH(String rhFactor) {
        if (rhFactor.equals("+") || rhFactor.equals("-")) {
            this.rhFactor = rhFactor;
        } else {
            System.out.println("Invalid Rh factor");
        }
    }
        public String getRH() {
        return rhFactor;
    }
    public void displayBloodInfo() {
        System.out.println("Your Blood Type is: " + bloodType + "\nYour Rh Factor type is: " + rhFactor);
    }
}

package stuff;

import java.time.LocalDate;

public class Doctor extends Employee{
    public Doctor(String name, LocalDate birthDate, String gender, String department, String position, double salary) {
        super(name, birthDate, gender, department, position, salary);
    }

    public void doCheckup(){
        System.out.println("Checkup patient");
    }
    public void prescribeMedication(){
        System.out.println("Medication");
    }
    public void giveAppointments(){
        System.out.println("Medical appointments");
    }

}

package stuff;

import animals.Animal;

import java.time.LocalDate;
import java.util.List;


public class Doctor extends Employee{
    public Doctor(String name, LocalDate birthDate, String gender, String department, String position, double salary) {
        super(name, birthDate, gender, department, position, salary);
    }

    public void doCheckup(Animal patient){
        System.out.println("Checkup patient");
    }
    public void prescribeMedication(Animal patient){
        System.out.println("Medication");
    }
    public List<String> giveAppointments(Animal patient, List<String> appointments){
        return appointments;
    }

}

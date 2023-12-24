package stuff;

import animals.Animal;

import java.time.LocalDate;
import java.util.List;

public class Nurse extends Employee implements GeneralNurseProcedures{
    public Nurse(String name, LocalDate birthDate, String gender, String department, String position, double salary) {
        super(name, birthDate, gender, department, position, salary);
    }
    public void makeAppointments(Animal patient, List<String> appointments){
        System.out.println("Doing medical procedure");
    }
}

package stuff;

import java.time.LocalDate;

public class Nurse extends Employee implements GeneralNurseProcedures{
    public Nurse(String name, LocalDate birthDate, String gender, String department, String position, double salary) {
        super(name, birthDate, gender, department, position, salary);
    }
    public void makeAppointment(){
        System.out.println("Doing medical procedure");
    }
}

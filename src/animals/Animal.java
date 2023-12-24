package animals;

import java.time.LocalDate;
import java.util.List;

public abstract class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List<String> vaccination;
    protected List<String> appointments;
    protected String illness;
    protected String ownerName;
    protected String type;

    public Animal(String name, LocalDate birthDate, List<String> vaccination, String illness, String ownerName) {
        this.name = name;
        this.birthDate = birthDate;
        this.vaccination = vaccination;
        this.illness = illness;
        this.ownerName = ownerName;
        this.type = getClass().getSimpleName();
    }
    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<String> getVaccination() {
        return vaccination;
    }

    public String getIllness() {
        return illness;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public List<String> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<String> appointments) {
        this.appointments = appointments;
    }

    private void wakeUp(){
        System.out.println("animals.Animal is wakeup");
    }

    private void wakeUp(int time){
        System.out.println("animals.Animal is wakeup in " + time);
    }

    private void eat(){
        System.out.println("animals.Animal ate");
    }

    private void play(){
        System.out.println("animals.Animal played");
    }

    private void sleep(){
        System.out.println("animals.Animal sleeping");
    }

//    public abstract void lifeCircle();



    @Override
    public String toString() {
        return "animals.Animal{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", vaccination=" + vaccination +
                ", illness='" + illness + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}

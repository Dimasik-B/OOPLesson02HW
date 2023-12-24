import animals.Animal;
import animals.Flyable;
import animals.Goable;
import animals.swimmable;
import stuff.Doctor;
import stuff.Nurse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VeterinaryClinic {
    private List<Animal> patients = new ArrayList<>();

    public void addPatient(Animal animal){
        patients.add(animal);
    }
    public void addPatients(Animal ... animals){
        Collections.addAll(patients, animals);
    }
    public List<Goable> getGoables(){
        List<Goable> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if(animal instanceof Goable)
                result.add((Goable) animal);
        }
        return result;
    }
    public List<Flyable> getFlyable(){
        List<Flyable> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if(animal instanceof Flyable)
                result.add((Flyable) animal);
        }
        return result;
    }
    public List<swimmable> getSwimable(){
        List<swimmable> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if(animal instanceof swimmable)
                result.add((swimmable) animal);
        }
        return result;
    }
    public List<Animal> getPatients() {
        return patients;
    }
    public void checkup(Doctor doctor, Animal patient, List<String> appointments){
        doctor.doCheckup(patient);
        doctor.giveAppointments(patient, appointments);
        doctor.prescribeMedication(patient);
    }
    public void procedures(Nurse nurse, Animal patient, List<String> appointments){
        nurse.makeAppointments(patient, appointments);
    }
}

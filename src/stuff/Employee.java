package stuff;

import java.time.LocalDate;

public abstract class Employee {
    protected String name;
    protected LocalDate birthDate;
    protected String gender;
    protected String department;
    protected String position;
    protected double salary;

    public Employee(String name, LocalDate birthDate, String gender, String department, String position, double salary) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    private void startWorking(){
        System.out.println("I'm working");
    }
    private void stopWorking(){
        System.out.println("I'm going home");
    }
    private void doBreak(){
        System.out.println("Time to break! Maybe eat something...");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}


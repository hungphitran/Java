package manager_employee;

public abstract class person {
    private String name;
    private int age;
    private double workingHour;
    private double salaryPerHour;

    person(){
        this.name="";
        this.age=0;
        this.salaryPerHour=0.0;
        this.workingHour=0.0;
    }
    person(String name,int age,double workingHour,double salaryPerHour){
        this.name=name;
        this.age = age;
        this.workingHour = workingHour;
        this.salaryPerHour=salaryPerHour;
    }

    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }

    double getWorking_hour(){
        return this.workingHour;
    }
    double getSalary_per_hour(){
        return this.salaryPerHour;
    }

    void setName(String name){
        this.name=name;
    }
    void setAge(int age){
        this.age=age;
    }
    void setWorking_hour(double workingHour){
        this.workingHour=workingHour;
    }

    void setSalary_per_hour(double salaryPerHour){
        this.salaryPerHour=salaryPerHour;
    }

    double getTotalSalary(){
        return workingHour*salaryPerHour;
    }

};

package manager_employee;

public class Employee extends person{
    private double reward;

    Employee(String name,int age, double salaryPerhour, double workingHour){
        super();
    }
    double getReward(){
        return this.reward;
    }
    void setReward(double reward){
        this.reward=reward;
    }
};

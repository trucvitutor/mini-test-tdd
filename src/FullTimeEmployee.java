public class FullTimeEmployee extends Employee {
    private double bonus;
    private double penalty;
    private double salary;

    public FullTimeEmployee() {
    }

    @Override
    public double getNetSalary() {
        return this.salary + (this.bonus - this.penalty);
    }

    public FullTimeEmployee(double bonus, double penalty, double salary) {
        this.bonus = bonus;
        this.penalty = penalty;
        this.salary = salary;
    }

    public FullTimeEmployee(String code, String name, int age, String numberPhone, String email, double bonus, double penalty, double salary) {
        super(code, name, age, numberPhone, email);
        this.bonus = bonus;
        this.penalty = penalty;
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "bonus=" + bonus +
                ", penalty=" + penalty +
                ", salary=" + salary +
                '}';
    }
}

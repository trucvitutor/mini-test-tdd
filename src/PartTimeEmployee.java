public class PartTimeEmployee extends Employee {
    private int time;

    public PartTimeEmployee() {
    }

    @Override
    public double getNetSalary() {
        return this.time * 100000;
    }

    public PartTimeEmployee(int time) {
        this.time = time;
    }

    public PartTimeEmployee(String code, String name, int age, String numberPhone, String email, int time) {
        super(code, name, age, numberPhone, email);
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "time=" + time +
                '}';
    }
}

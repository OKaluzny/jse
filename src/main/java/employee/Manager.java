package employee;

public class Manager extends Employee {

    private double bonus;

    /**
     * @param name   Имя сотрудника
     * @param salary Зарплата
     * @param ///
     */

    public Manager(String name, double salary, int year, int month, int day) {

        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getSalary() {
        return super.getSalary() + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

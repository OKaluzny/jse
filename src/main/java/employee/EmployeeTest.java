package employee;

public class EmployeeTest {

    public static void main(String[] args) {

        Manager boss = new Manager("Karl Craker", 80000, 1987, 12, 15);
        boss.setBonus(500);

        System.out.println("Salary is " + boss.getSalary());

        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[1] = boss;
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        for (Employee e : staff) {
            System.out.println("Name = " + e.getName() + ", salary = "
                    + e.getSalary() + " usd");
        }
    }
}

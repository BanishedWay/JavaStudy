package testStatic;

/**
 * ���Լ̳�
 *
 * @author ���
 * @date 2022/01/13 08:58
 **/


public class ManagerTest {
    public static void main(String[] args) {
        var boss = new Manager("Karl", 8000, 1987, 12, 15);
        boss.setBonus(1000);

        var staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Harry", 5000, 1989, 10, 1);
        staff[2] = new Employee("Tommy", 4000, 1990, 3, 15);
//        staff[0].setBonus(1500);
//        staff[0]�ڱ������б�����Employee���󣬲��ܵ������෽��

//        Manager manager = (Manager) staff[1];


        for (Employee employee : staff) {
            System.out.println("name = " + employee.getName() + ", salary = " + employee.getSalary());
        }
    }
}

package testArrayList;

/**
 * @author Ðí ¾¢ä¿
 * @date 2022/01/13 10:54
 **/

import testAbstract.Employee;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(new Employee("Harry", 10000, 1989, 10, 1));
        staff.add(new Employee("Maria", 20000, 2000, 1, 1));
        System.out.println(staff.size());

        for (Employee employee : staff) {
            employee.raiseSalary(5);
        }

        for (Employee employee : staff) {
            System.out.println(employee);
        }
    }
}

package testPackage;

/**
 * @author ���
 * @date 2022/01/08 23:11
 * @see testStatic.Employee#raiseSalary(double) 
 **/

import testStatic.Employee;

import static java.lang.System.out;

public class TestPackage {
    public static void main(String[] args) {
        //��Ȼ���ǣ���̫���ۣ����Ƽ�
        out.println("Test static import");

        var harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);

        harry.raiseSalary(5);

        out.println("name = " + harry.getName() + ", salary = " + harry.getSalary());

    }
}

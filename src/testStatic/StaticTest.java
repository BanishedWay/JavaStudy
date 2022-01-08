package testStatic;

/**
 * @author ���
 * @date 2022/1/7 19:13
 */

public class StaticTest {
    public static void main(String[] args) {
        var staffs = new Employee[3];
        staffs[0] = new Employee("Tom", 4000);
        staffs[1] = new Employee("Mike", 3000);
        staffs[2] = new Employee("Jack", 2000);

        for (Employee e : staffs) {
            e.setId();
            System.out.println(e.getName() + " " + e.getSalary() + " " + e.getId());
        }

        //�����ǰ�ܱ��
        System.out.println("NextID is " + Employee.getNextID());
    }
}
package testArrayList;

/**
 * @author 许 劲淇
 * @date 2022/01/13 14:19
 **/

import testAbstract.Employee;

public class testReflect {
    //反射机制指在程序运行过程中，可以获取其自身的信息
    public static void main(String[] args) throws ClassNotFoundException {
        Employee employee = new Employee("Harry", 10000, 1989, 10, 1);
//        Class<?> cl = Class.forName("Employee");
        System.out.println(employee.getClass() + " " + employee.getName());

       /* //使用反射机制，可以获取类名，判断对象的类别
        if (employee.getClass() == Person.class) {
        }//判断是否是本类
        if (employee instanceof Employee) {

        }//判断是否是本类或者子类*/
        /*System.out.println(employee instanceof Person);
        Person p = new Student("Mike", "Science");
        System.out.println(p instanceof Employee);*/
    }
}

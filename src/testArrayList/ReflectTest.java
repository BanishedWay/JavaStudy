package testArrayList;

/**
 * 本项目用于测试反射机制，输出一个类的全部信息
 *
 * @author 许 劲淇
 * @date 2022/01/13 14:42
 **/

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectTest {
    public static void main(String[] args) throws ReflectiveOperationException {
        //从控制台输入读取类名
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入类名：");
        name = scanner.next();

        //打印类名和超类名
        Class<?> cl = Class.forName(name);
        Class<?> supercl = cl.getSuperclass();

        //打印访问类型
        String modifiers = Modifier.toString(cl.getModifiers());
        if (modifiers.length() > 0) {
            System.out.println(modifiers + " ");
        }
        System.out.println("class " + name);
        if (supercl != null && supercl != Object.class) {
            System.out.println(" extends " + supercl.getName());
        }

        System.out.println("{");
        printConstructors(cl);
        System.out.println();
        printMethods(cl);
        System.out.println();
        printFields(cl);
        System.out.println("}");
    }

    /**
     * 输出类的所有构造器
     *
     * @param cl a class
     */
    public static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getDeclaredConstructors();

        System.out.println("    //构造方法");

        for (Constructor c : constructors) {
            //输出访问类型和方法名
            String name = c.getName();
            System.out.print("    ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(name + "(");

            //输出参数
            Class[] parameterTypes = c.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(parameterTypes[i].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * 输出方法名
     *
     * @param cl
     */
    public static void printMethods(Class cl) {
        Method[] methods = cl.getDeclaredMethods();
        System.out.println("    //成员方法");

        for (Method m : methods) {
            Class returnType = m.getReturnType();
            String name = m.getName();

            System.out.print("    ");
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(returnType.getName() + " " + name + "(");

            //打印输出参数
            Class[] parameterTypes = m.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                if (i > 1) {
                    System.out.print(", ");
                }
                System.out.print(parameterTypes[i].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * 输出声明参数
     *
     * @param cl
     */
    public static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();
        System.out.println("    //变量和常量");

        for (Field field : fields) {
            Class type = field.getType();
            String name = field.getName();
            System.out.print("    ");
            String modifiers = Modifier.toString(field.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.println(type.getName() + " " + name + ";");
        }
    }
}


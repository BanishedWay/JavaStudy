package testArrayList;

/**
 * ����Ŀ���ڲ��Է�����ƣ����һ�����ȫ����Ϣ
 *
 * @author �� ���
 * @date 2022/01/13 14:42
 **/

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectTest {
    public static void main(String[] args) throws ReflectiveOperationException {
        //�ӿ���̨�����ȡ����
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("����������");
        name = scanner.next();

        //��ӡ�����ͳ�����
        Class<?> cl = Class.forName(name);
        Class<?> supercl = cl.getSuperclass();

        //��ӡ��������
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
     * ���������й�����
     *
     * @param cl a class
     */
    public static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getDeclaredConstructors();

        System.out.println("    //���췽��");

        for (Constructor c : constructors) {
            //����������ͺͷ�����
            String name = c.getName();
            System.out.print("    ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(name + "(");

            //�������
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
     * ���������
     *
     * @param cl
     */
    public static void printMethods(Class cl) {
        Method[] methods = cl.getDeclaredMethods();
        System.out.println("    //��Ա����");

        for (Method m : methods) {
            Class returnType = m.getReturnType();
            String name = m.getName();

            System.out.print("    ");
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(returnType.getName() + " " + name + "(");

            //��ӡ�������
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
     * �����������
     *
     * @param cl
     */
    public static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();
        System.out.println("    //�����ͳ���");

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


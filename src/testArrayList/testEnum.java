package testArrayList;

/**
 * @author Ðí ¾¢ä¿
 * @date 2022/1/13 14:02
 */

import java.util.Scanner;

enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private String abbreviation;

    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}

public class testEnum {
    /**
     * mainº¯Êý£¬²âÊÔEnum
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size: (SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
        while (scanner.hasNext()) {
            String input = scanner.next().toUpperCase();
            if (input.equals("-1")) {
                System.exit(-1);
            }
            Size size = Enum.valueOf(Size.class, input);
            System.out.println("size = " + size);
            System.out.println("abbreviation = " + size.getAbbreviation());
            if (size == Size.EXTRA_LARGE) {
                System.out.println("Good Job!");
            }
        }

    }
}
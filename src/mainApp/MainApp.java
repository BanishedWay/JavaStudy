package mainApp;

/**
 * @author Xu Jinqi
 *
 *         2022��1��7��
 */
public class MainApp {
	public static void main(String[] args) {
		/*
		 * ����StringBuilder
		 * TestStringBuilder testStringBuilder = new TestStringBuilder("Hello");
		testStringBuilder.addString(" world!");
		System.out.println(testStringBuilder.toString());
		System.out.println(testStringBuilder.getLength());
		*/

		/*
		 * ����
		 */
		/*var strings = new String[10];
		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		for (int i : a) {
			System.out.println(i);
		}
		Arrays.fill(strings, "hello");*/

		/*
		 * ʹ��Ԥ������
		 */
		// Date
		/*System.out.println(new Date());
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.now().getDayOfWeek());
		System.out.println(LocalDate.now().getDayOfWeek().getValue());*/

		// LocalDate�������������
		/*
		 * ��õ����·�
		 */
		/*LocalDate date = LocalDate.now();
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();
		
		date = date.minusDays(today - 1);// ����������Ϊ���µ�һ�죬minusDays()���õ�ǰ����֮ǰ��֮�������
		DayOfWeek weekDay = date.getDayOfWeek();
		int value = weekDay.getValue();// ��ȡ��һ������ֵ
		
		System.out.println("Mon  Tue  Wed  Thu  Fri  Sat  Sun");
		for (int i = 1; i < value; i++) {
			System.out.print("     ");
		}
		while (date.getMonthValue() == month) {
			System.out.printf("%2d", date.getDayOfMonth());
			if (date.getDayOfMonth() == today) {
				System.out.print("*  ");
			} else {
				System.out.print("   ");
			}
			date = date.plusDays(1);// ��������ʱ������
			if (date.getDayOfWeek().getValue() == 1) {
				System.out.println();
			}
		}
		System.out.println();*/

	}
}

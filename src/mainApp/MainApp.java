package mainApp;

/**
 * @author Xu Jinqi
 *
 *         2022年1月7日
 */
public class MainApp {
	public static void main(String[] args) {
		/*
		 * 测试StringBuilder
		 * TestStringBuilder testStringBuilder = new TestStringBuilder("Hello");
		testStringBuilder.addString(" world!");
		System.out.println(testStringBuilder.toString());
		System.out.println(testStringBuilder.getLength());
		*/

		/*
		 * 数组
		 */
		/*var strings = new String[10];
		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		for (int i : a) {
			System.out.println(i);
		}
		Arrays.fill(strings, "hello");*/

		/*
		 * 使用预定义类
		 */
		// Date
		/*System.out.println(new Date());
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.now().getDayOfWeek());
		System.out.println(LocalDate.now().getDayOfWeek().getValue());*/

		// LocalDate，输出当月日历
		/*
		 * 获得当月月份
		 */
		/*LocalDate date = LocalDate.now();
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();
		
		date = date.minusDays(today - 1);// 将日期设置为本月第一天，minusDays()设置当前日期之前或之后的日期
		DayOfWeek weekDay = date.getDayOfWeek();
		int value = weekDay.getValue();// 获取第一天日期值
		
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
			date = date.plusDays(1);// 当星期天时，换行
			if (date.getDayOfWeek().getValue() == 1) {
				System.out.println();
			}
		}
		System.out.println();*/

	}
}

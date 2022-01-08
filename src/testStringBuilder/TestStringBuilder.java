package testStringBuilder;

public class TestStringBuilder {
	StringBuilder stringBuilder;

	public TestStringBuilder() {
		// 新建一个StringBuilder对象
		stringBuilder = new StringBuilder();
	}

	public TestStringBuilder(String str) {
		// 从字符串str创建StringBuilder对象
		stringBuilder = new StringBuilder(str);
	}

	public void addString(String str) {
		// 在末尾添加字符串
		stringBuilder.append(str);
	}

	public int getLength() {
		// 获取长度
		return stringBuilder.length();
	}

	public String toString() {
		// 将StringBuilder对象转化为String
		return stringBuilder.toString();
	}

	public void insertString(int offset, String str) {
		// 在字符串offset位置插入str
		stringBuilder.insert(offset, str);
	}

	public void Delete(int startIndex, int endIndex) {
		// 删除特定区间内字符
		stringBuilder.delete(startIndex, endIndex);
	}
}

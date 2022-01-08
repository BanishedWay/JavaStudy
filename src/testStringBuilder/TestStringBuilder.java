package testStringBuilder;

public class TestStringBuilder {
	StringBuilder stringBuilder;

	public TestStringBuilder() {
		// �½�һ��StringBuilder����
		stringBuilder = new StringBuilder();
	}

	public TestStringBuilder(String str) {
		// ���ַ���str����StringBuilder����
		stringBuilder = new StringBuilder(str);
	}

	public void addString(String str) {
		// ��ĩβ����ַ���
		stringBuilder.append(str);
	}

	public int getLength() {
		// ��ȡ����
		return stringBuilder.length();
	}

	public String toString() {
		// ��StringBuilder����ת��ΪString
		return stringBuilder.toString();
	}

	public void insertString(int offset, String str) {
		// ���ַ���offsetλ�ò���str
		stringBuilder.insert(offset, str);
	}

	public void Delete(int startIndex, int endIndex) {
		// ɾ���ض��������ַ�
		stringBuilder.delete(startIndex, endIndex);
	}
}

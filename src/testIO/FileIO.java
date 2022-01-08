package testIO;

import java.io.File;

public class FileIO {
	private String fileName;
	private String directoryPath;
	private String fileString;
	private File file;

	public FileIO() {
		// TODO Auto-generated constructor stub
		fileString = null;
	}

	public FileIO(String fileName) {
		// 根据文件名创建文件对象
		this.fileName = fileName;
		this.file = new File(fileName);
		this.fileString = fileName;
	}

	public FileIO(String directoryPath, String fileName) {
		// 根据目录名和文件名创建文件对象
		this.fileName = fileName;
		this.directoryPath = directoryPath;
		this.file = new File(directoryPath, fileName);
		this.fileString = directoryPath + "\\" + fileName;
	}

	public FileIO(File f, String fileName) {
		// 根据父抽象路径名和子文件名创建文件对象
		this.fileName = fileName;
		this.file = new File(f, fileName);
		if (f.isDirectory()) {
			this.fileString = f.getAbsolutePath() + "\\" + fileName;
		} else {
			this.fileString = f.getParentFile().getAbsolutePath() + "\\"
					+ fileName;
		}
	}

	public String getName() {
		return this.fileName;
	}

	public String getAbsolutePath() {
		return this.fileString;
	}

	public String getPath() {
		return this.directoryPath;
	}

	public boolean isFile() {
		return this.file.isFile();
	}

	public long getLength() {
		return this.file.length();
	}

	public long lastModified() {
		return this.file.lastModified();
	}
}

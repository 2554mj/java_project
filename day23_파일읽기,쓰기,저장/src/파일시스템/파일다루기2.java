package 파일시스템;

import java.io.File;

public class 파일다루기2 {

	public static void main(String[] args) {
		File file = new File("C:\\Program Files\\Java\\jdk1.8.0_291");
		//jdk폴더 아래 몇 개가 있는지 프린트
		//무엇이 있는지 프린트, 폴더인지 파일인지 프린트.
		File[] list = file.listFiles();
		System.out.println(list.length);
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
			if (file.isDirectory()) {
				System.out.println("폴더입니다");
			}else {
				System.out.println("파일입니다");
			}
		}
		
	}

}

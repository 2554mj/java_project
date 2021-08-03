package 파일시스템;

import java.io.File;

public class 파일다루기 {

	public static void main(String[] args) {
		// 이미지나 파일은 프로젝트 파일 바로 밑에 넣기
		//File file = new File("test.txt");
		//File file = new File("C:\\data");//역슬러시는 2번 슬러시는 1번
		File file = new File("C:/data");//역슬러시는 2번 슬러시는 1번
		//file.delete();//파일삭제
		boolean result = file.exists();
		if (result) {
			System.out.println("파일이나 폴더가 존재");
			//System.out.println(file.getPath());//경로가 나옴
			System.out.println(file.getAbsolutePath());//전체경로가 다나옴
			if (file.isDirectory()){
				System.out.println("폴더");
			}else {
				System.out.println("파일");
			}
				
		}
		else {
			System.out.println("파일이나 폴더가 없네요");
		}
		File[] list = file.listFiles();
		System.out.println(list.length);
		for (File file2 : list) {
			System.out.println(file2);
			
		}

	}

}

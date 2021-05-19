package com.imooc.demo.resource;

import org.springframework.core.io.FileSystemResource;

import java.io.*;

public class ResourceDemo {
	public static void main(String[] args) throws IOException {
		FileSystemResource fileSystemResource = new FileSystemResource("D:\\dev\\spring-framework\\springdemo\\src\\main\\java\\com\\imooc\\demo\\resource\\text.txt");
		File file = fileSystemResource.getFile();
		System.out.println(file.length());
		OutputStream outputStream = fileSystemResource.getOutputStream();
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
		bufferedWriter.write("HELLO WORLD");
		bufferedWriter.flush();
		outputStream.close();
		bufferedWriter.close();
	}
}

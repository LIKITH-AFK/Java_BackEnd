package com.File_I_O_Stream;

import java.io.FileInputStream;
import java.io.IOException;

public class File_Input_stream {

	public static void main(String[] args) throws IOException {
		String location="C:\\Users\\likit\\OneDrive\\Desktop\\abc.txt";
		FileInputStream fis=new FileInputStream(location);
//		System.out.println(fis.read());
		int i;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}

	}

}

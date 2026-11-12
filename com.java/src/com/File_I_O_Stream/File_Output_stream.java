package com.File_I_O_Stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Output_stream {
	
	public static void insertData(String location,String data) throws IOException {
		FileOutputStream fos=new FileOutputStream(location,true);
		fos.write(data.getBytes());
		fos.close();
		System.out.println("Data inserted");
	}

	public static void main(String[] args) throws IOException{
		String location="C:\\Users\\likit\\OneDrive\\Desktop\\abc.txt";
		File file=new File(location);
		String data="Hi rohit ...";
		if(file.exists()) {
			System.out.println("File exist");
			insertData(location,data);
		}else {
			System.out.println("File Not exist");
			file.createNewFile();
			insertData(location, data);
		}
	}

}

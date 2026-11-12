package com.File_I_O_Stream;
import java.io.*;


public class Example1 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\likit\\OneDrive\\Desktop\\demo.txt");
		
		if(!file.exists()) file.createNewFile();
		String data = "Likith is a genius\n";
		
		byte[] Bytedata = data.getBytes();
		
		FileOutputStream fos = new FileOutputStream(file,true);
		
		fos.write(Bytedata);
		
		fos.close();
		
		System.out.println("Data is Inserted Successfully.");
		
		FileInputStream fis = new FileInputStream(file);
		
		int i;
		
		while((i = fis.read()) != -1) {
			System.out.print((char)i);
		}
		
		
		
		fis.close();
	}
}

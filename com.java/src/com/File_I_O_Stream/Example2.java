package com.File_I_O_Stream;
import java.io.*;

public class Example2 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:/Users/likit/OneDrive/Desktop/sample.txt");
		
		if(!file.exists()) file.createNewFile();
		
		FileWriter fw = new FileWriter(file,true);
		
		String data = "Rohith is topper\n";
		
		fw.write(data);
		
		fw.close();
		
		System.out.println("Data is inserted.");
		
		FileReader fr = new FileReader(file);
		
		int i;
		
		while((i = fr.read()) != -1) {
			System.out.print((char)i);
		}
		
		fr.close();

	}

}

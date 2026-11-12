package com.File_I_O_Stream;
import java.io.*;

public class Example3 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/likit/OneDrive/Desktop/Andhagadu.png");
		
		if(!file.exists()) {
			System.out.println("Image not Found to Copy");
		}
		else {
			FileInputStream fis = new FileInputStream(file);
			FileOutputStream fos = new FileOutputStream("Topper.png",true);
			
			int i;
			
			while((i = fis.read()) != -1) {
				fos.write(i);
			}
			
			fos.close();
			fis.close();
			
			System.out.println("Andhagadu became Topper");
		}

	}

}

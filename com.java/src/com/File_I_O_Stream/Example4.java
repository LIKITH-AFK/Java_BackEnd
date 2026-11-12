package com.File_I_O_Stream;
import java.io.*;

public class Example4 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/likit/OneDrive/Desktop/Andhagadu.png");
		
		if(!file.exists()) {
			System.out.println("Andhagadu not Found");
		}else {
			FileReader fr = new FileReader(file);
			FileWriter fw = new FileWriter("Genius.png");
			
			
			int i;
			
			while((i = fr.read()) != - 1) {
				fw.write(i);
			}
			
			fr.close();
			fw.close();
			
			System.out.println("Andhagadu became Genius");
		}
	}

}

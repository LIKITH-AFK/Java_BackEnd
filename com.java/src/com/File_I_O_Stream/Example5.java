package com.File_I_O_Stream;

import java.io.*;

class Demo implements AutoCloseable{
	
	
	public void printData() throws IOException {
		File file = new File("C:/Users/likit/OneDrive/Desktop/sample.txt");
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		try(FileReader fr = new FileReader(file)){
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
		}
	}

	@Override
	public void close() throws Exception {
		System.out.println("Andhagadi laptop lo resource close chesam");
		
	}
	
}

public class Example5 {

	public static void main(String[] args) throws Exception {
		
		try (Demo demo = new Demo()) {
			demo.printData();
		}

	}

}

package com.File_I_O_Stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {

	public static void main(String[] args) throws IOException{
		FileReader fr=new FileReader("C:\\Users\\likit\\Downloads\\one piece.jpg");
		
		FileWriter fw=new FileWriter("One_piece.jpg");
		int i;
		while((i=fr.read())!=-1) {
			fw.write((char)i);
		}
		fw.close();
		fr.close();
		System.out.println("Image copied in new location");

	}

}

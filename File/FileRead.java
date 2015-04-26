package File;

import java.io.*;

public class FileRead {

	public static void main(String[] args) {
		try{
			FileReader a = new FileReader("D:/TeamViewer/tvinfo.ini");
			BufferedReader b = new BufferedReader(a);
			String line;
			while((line=b.readLine())!= null){
				System.out.println(line);
			}
			b.close();
		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}
	}

}

package sec01.exam12;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Reader reader = new FileReader("C:/Temp/test8.txt");
		
		char[] buffer = new char[100];
		System.out.println(buffer[0]);
		while(true) {
			int readCharNum = reader.read(buffer);
			System.out.println(readCharNum);
			if(readCharNum == -1)break;
			
			for(int i =0; i <readCharNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		reader.close();
	}

}

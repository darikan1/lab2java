
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class Program {

	public static void main(String[] args) {
		
		BufferedReader reader;
		try {
			
			reader = new BufferedReader(new FileReader("input.txt"));
			
			String [] strings = reader.readLine().split(" ");
			
			int [] numbers = new int [strings.length];
			
			
			for (int i = 0; i < strings.length; i++) {
				
				numbers[i] =Integer.parseInt(strings[i]);
			} 
			
			
			FileWriter writer = new FileWriter("output.txt");
			for (int i = 0; i < numbers.length; i++) {
				
				if(numbers[i] % 2==0) {
					writer.write(numbers[i]+" ");;
				}
			}
			
			writer.close();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}

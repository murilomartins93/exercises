package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) throws ParseException {
	
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		Map<String, Integer> votes = new LinkedHashMap<>();
				
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int vote = Integer.parseInt(fields[1]);

				if (votes.containsKey(name)) {
					int votesSoFar = votes.get(name);
					votes.put(name,(votesSoFar + vote));
				}
				else {
					votes.put(name, vote);
				}
				line = br.readLine();				
			}	
		
			for(String n : votes.keySet()) {
				System.out.println(n + ": " + votes.get(n));
			}
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}

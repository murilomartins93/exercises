package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	
	public static void main (String[] args) {
		
		fileReader();
		fileBuffer();
		tryWithResources();
		fileWritter();
		fileFolder();				
	}

// Reading a file with File Reader
	public static void fileReader() {
		
		File file = new File("C:\\Projects\\Exercises\\Java\\exercise28_fileScanner\\text.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally{
			if (sc != null) {
				sc.close();
			}
		}
	}
	
// Reading a file with Buffered Reader
	public static void fileBuffer() {
		
		String path = "C:\\Projects\\Exercises\\Java\\exercise28_fileScanner\\text.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				if (br != null ) {
					br.close();
				}
				if (fr != null ) {
					fr.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();;
			}
		}
	}

// Reading a file with Try With Resources
	private static void tryWithResources() {
		
		String path = "c:\\temp\\out.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

// Writing a file with File and Buffered Writer
	private static void fileWritter() {
		
		String[] lines = new String[] { "Good Morning", "Good Afternoon", "Good Night"};
		
		String path = "c:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
// Manipulating Folders
	private static void fileFolder() {
		
		Scanner sc = new Scanner(System.in);
		
		//Listing folders
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
	
		//Listing files
		File[] files = path.listFiles(File::isFile);
		
		System.out.println();
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		
		//Creating Sub Folder
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		
		sc.close();
		
		System.out.println();
		//Path Information
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		System.out.println("getFreeSpace: " + path.getFreeSpace());
	}	
}
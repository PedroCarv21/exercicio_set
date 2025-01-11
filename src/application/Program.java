package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogRecord;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String filePath = sc.nextLine();
		
		Set<LogRecord> totalUsers = new HashSet<>();
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
			
			String newLine = br.readLine();
			
			while (newLine != null) {
				
				String[] data = newLine.split(" ");
				
				totalUsers.add(new LogRecord(data[0], Instant.parse(data[1])));
				
				newLine = br.readLine();
			}
		}
		catch (IOException ioe) {
			System.out.println(ioe.getMessage());
			//new comment
		}
		
		
		System.out.printf("Total de usuarios: %d", totalUsers.size());
		sc.close();
		
		
	}

}

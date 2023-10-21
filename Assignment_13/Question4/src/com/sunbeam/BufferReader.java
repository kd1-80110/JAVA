package com.sunbeam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BufferReader {
	public static void main(String[] args) {

		try (FileReader fr = new FileReader("/home/sunbeam/java/Assignment_13/Question3/buffer.txt")) {
			try (BufferedReader br = new BufferedReader(fr)) {

				String line;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("File Readed Successfully");

	}

}

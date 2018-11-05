package com.handsoncoder.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesExample {

	public static void main(String[] args) throws IOException {
		Files.lines(Paths.get("pom.xml")).filter(line -> line.contains("group")).forEach(System.out::println);
	}
}

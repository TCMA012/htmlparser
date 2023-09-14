package com.htmlparser.maven.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JUnit
{
    public static void main( String[] args )
    {
    	final String DIR = "/media/tcma/SeagateBackupPlusDrive/JUnit/";
    	//https://junit.org/junit5/docs/current/user-guide/
    	final String FILENAME = "JUnit 5 User Guide";
		Path path = Paths.get(DIR + FILENAME + ".txt");
   		try {
   			File input = new File(DIR + FILENAME + ".html");
   			Document doc = Jsoup.parse(input, "UTF-8", "");
   			String content = doc.text(); 
   			System.out.println(content);
			// Java 11 Append mode
			Files.writeString(path, content, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
	   	} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
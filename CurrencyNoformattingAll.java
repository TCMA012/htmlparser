package com.htmlparser.maven.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class CurrencyNoformattingAll
{
    public static void main( String[] args )
    {
    	final String DIR = "/media/tcma/SeagateBackupPlusDrive/TypeScript/programming-typescript/wand-ta.hatenablog/";
		Path path = Paths.get(DIR + "Out.txt");
    
   		try {
   	   		//File input = new File("/media/tcma/SeagateBackupPlusDrive/TypeScript/programming-typescript/wand-ta.hatenablog/Currency.html");
   	   		File input = new File(DIR + "Programming TypeScript ch6 (2_3) Advanced Function Types.html");
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
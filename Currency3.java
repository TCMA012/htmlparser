package com.htmlparser.maven.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Currency3
{
    public static void main( String[] args )
    {
    	/*
   		 */
   		try {
   	   		File input = new File("/media/tcma/SeagateBackupPlusDrive/TypeScript/programming-typescript/wand-ta.hatenablog/Currency.html");
   			Document doc = Jsoup.parse(input, "UTF-8", "");
   			List<String> typescriptCode = new ArrayList<String>();
   			String strs[] = {
   					"synStatement",
   					"synIdentifier",
   					"synConstant",
   					"synType",
   			};
   			for (String str : strs) {
   				Elements spansWithsynStatementElements = doc.select("span." + str);
   				if (spansWithsynStatementElements != null) {
   					for (Element e : spansWithsynStatementElements) {
   						String text = "";
   						text += e.ownText();
   						typescriptCode.add(text);
   					}
   				}
   			}
   			
   			int size = typescriptCode.size();
   			for (int i = 0; i < size; i++) {
  				System.out.println(typescriptCode.get(i));
   				System.out.println("");
   			}
	   	} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
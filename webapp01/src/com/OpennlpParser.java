package com;

import opennlp.tools.cmdline.PerformanceMonitor;
import opennlp.tools.cmdline.postag.POSModelLoader;
import opennlp.tools.namefind.NameFinderME;
import opennlp.tools.namefind.TokenNameFinderModel;
import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSSample;
import opennlp.tools.postag.POSTaggerME;
import opennlp.tools.tokenize.WhitespaceTokenizer;
import opennlp.tools.util.InvalidFormatException;
import opennlp.tools.util.ObjectStream;
import opennlp.tools.util.PlainTextByLineStream;
import opennlp.tools.util.Span;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;

public class OpennlpParser {
	public String _sentence;
	POSTaggerME tagger;
	NameFinderME locFinder;


	String username;
	String email;
	int age;
	String myCommand;
	
	public void setMyCommand( String command )
	{
		myCommand = command;
	}	
	
	
	public void setUsername( String value )
	{
		username = value;
	}

	public void setEmail( String value )
	{
		email = value;
	}

	public void setAge( int value )
	{
		age = value;
	}

	public String getMyCommand() { return myCommand; }
	
	public String getUsername() { return username; }

	public String getEmail() { return email; }

	public int getAge() { return age; }



	public String doNlp(String sentence) throws IOException {
		InputStream is_location = new FileInputStream("retrieveDatabase.bin");
		TokenNameFinderModel model_location = new TokenNameFinderModel(is_location);
		is_location.close();
		locFinder = new NameFinderME(model_location);
		POSModel model = new POSModelLoader().load(new File("en-pos-maxent.bin"));
		PerformanceMonitor perfMon = new PerformanceMonitor(System.err, "sent");
		tagger = new POSTaggerME(model);


		String whitespaceTokenizerLine[] = WhitespaceTokenizer.INSTANCE.tokenize(sentence);
		System.out.println(Arrays.toString(whitespaceTokenizerLine));


		String[] tags = tagger.tag(whitespaceTokenizerLine);
		POSSample sample = new POSSample(whitespaceTokenizerLine, tags);
		System.out.println(sample.toString());

		Span locSpans[] = locFinder.find(whitespaceTokenizerLine);
		for(Span s: locSpans) {
			StringBuilder sb = new StringBuilder();
			for (int i=s.getStart(); i < s.getEnd(); i++)
				sb.append(whitespaceTokenizerLine[i] + " ");
			System.out.print(s.getType() + " -> ");
			System.out.println(sb);
		}
		
		System.out.println();
		String greet = "helloo from opennlp";
		return greet;
	}
}

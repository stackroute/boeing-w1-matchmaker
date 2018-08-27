package com.stackroute.matchmaker.nlpservice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.stackroute.matchmaker.nlpservice.nlpprocess.Tokenization;

@SpringBootApplication
public class NlpServiceApplication {

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(NlpServiceApplication.class, args);
//		Scanner s;
//		s = new Scanner(new File("stopword.txt"));
//		ArrayList<String> stopword = new ArrayList<String>();
//		while (s.hasNext()) {
//			stopword.add(s.next());
//		}
//		System.out.println(stopword);
//		Tokenization tokenization = new Tokenization();
//		List<String> token = tokenization.token("Hi, my name is ansh i like java",stopword);
//		System.out.println(token);
//		s.close();
	}

}

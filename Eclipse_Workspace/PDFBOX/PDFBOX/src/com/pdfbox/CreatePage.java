package com.pdfbox;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class CreatePage {

	public static void main(String[] args) {

		System.out.println("Creating a PDF Document.!");
		
		String fileName = "Sample.pdf";
		
		PDDocument pdfDocument = new PDDocument();
		
		pdfDocument.addPage(new PDPage());
		
		try {
			pdfDocument.save(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			pdfDocument.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("PDF DOCUMENT CREATED IN: "+System.getProperty("user.dir"));
	}

}

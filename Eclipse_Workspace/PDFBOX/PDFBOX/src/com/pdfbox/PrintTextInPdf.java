package com.pdfbox;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class PrintTextInPdf {

	public static void main(String[] args) {

		PDDocument document = new PDDocument();
		PDPage page = new PDPage();
		
		String fileName = "HelloWorld.pdf";
		
		document.addPage(page);
		
		try{
			PDPageContentStream stream = new PDPageContentStream(document, page);
			stream.beginText();
			stream.setFont(PDType1Font.HELVETICA, 26);
			stream.moveTextPositionByAmount(250, 750);
			stream.drawString("Registration Form");
			stream.endText();
			
			stream.close();
			document.save(fileName);
			document.close();
			
			System.out.println("Your file is created in the path: "+System.getProperty("user.dir"));
		}catch(IOException ex){
			System.out.println(ex);
		}
	}

}

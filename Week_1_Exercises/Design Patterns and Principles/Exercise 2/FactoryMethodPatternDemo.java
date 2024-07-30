package com.factorymethodpatternexample;

public class FactoryMethodPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentFactory wordFactory = new WordDocumentFactory();
		Document wordDoc = wordFactory.createDocument();
		wordDoc.open();
		wordDoc.close();
		
		DocumentFactory pdfFactory = new PdfDocumentFactory();
		Document pdfDoc = pdfFactory.createDocument();
		pdfDoc.open();
		pdfDoc.close();
		
		DocumentFactory excelFactory = new ExcelDocumentFactory();
		Document excelDoc = excelFactory.createDocument();
		excelDoc.open();
		excelDoc.close();

	}

}

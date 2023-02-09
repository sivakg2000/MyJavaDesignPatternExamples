package com.sivakg.examples.dp.structural.facade.impl;

import java.sql.Connection;

import com.sivakg.examples.dp.structural.facade.ExcelReport;
import com.sivakg.examples.dp.structural.facade.HTMLReport;
import com.sivakg.examples.dp.structural.facade.PDFReport;

public class ReportFacade {

	private PDFReport pdfReport;
	private HTMLReport htmlReport;
	private ExcelReport excelReport;
	
	
	public ReportFacade() {
		 pdfReport=new PDFReportImpl();
		 htmlReport=new HTMLReportImpl();
		 excelReport=new ExcelReportImpl();
	}

	
	public void generatePDFReport(Connection con,String tableName) {
		pdfReport.generatePDFReport(con, tableName);
	}
	
	public void generateHTMLReport(Connection con,String tableName) {
		htmlReport.generateHTMLReport(con, tableName);
	}
	
	public void generateExcelReport(Connection con,String tableName) {
		excelReport.generateExcelReport(con, tableName);
	}
	
	
	
}

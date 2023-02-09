package com.sivakg.examples.dp.structural.facade;

import java.sql.Connection;

import com.sivakg.examples.dp.structural.facade.impl.ExcelReportImpl;
import com.sivakg.examples.dp.structural.facade.impl.HTMLReportImpl;
import com.sivakg.examples.dp.structural.facade.impl.PDFReportImpl;
import com.sivakg.examples.dp.structural.facade.impl.ReportFacade;

public class MainFacade {

	public static void main(String[] args) {
		
		Connection con=null;
		String tableName="employee";
		PDFReport pdfReport=new PDFReportImpl();
		pdfReport.generatePDFReport(con, tableName);
		
		HTMLReport htmlReport=new HTMLReportImpl();
		htmlReport.generateHTMLReport(con, tableName);
		
		
		ExcelReport excelReport=new ExcelReportImpl();
		excelReport.generateExcelReport(con, tableName);
		
		
		ReportFacade reportFacade=new ReportFacade();
		reportFacade.generatePDFReport(con, tableName);
		reportFacade.generateHTMLReport(con, tableName);
		reportFacade.generateExcelReport(con, tableName);
		
	}

}

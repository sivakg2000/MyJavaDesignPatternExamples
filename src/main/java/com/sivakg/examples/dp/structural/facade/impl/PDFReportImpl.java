package com.sivakg.examples.dp.structural.facade.impl;

import java.sql.Connection;
 
import com.sivakg.examples.dp.structural.facade.PDFReport; 
public class PDFReportImpl implements PDFReport {

	@Override
	public void generatePDFReport(Connection con, String tableName) {
		System.out.println("Generate PDF Report");

	}

}

package com.sivakg.examples.dp.structural.facade.impl;

import java.sql.Connection;

import com.sivakg.examples.dp.structural.facade.ExcelReport; 
public class ExcelReportImpl implements ExcelReport {

	@Override
	public void generateExcelReport(Connection con, String tableName) {
		System.out.println("Generate PDF Report");

	}

}

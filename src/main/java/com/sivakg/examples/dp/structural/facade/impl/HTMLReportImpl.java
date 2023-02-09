package com.sivakg.examples.dp.structural.facade.impl;

import java.sql.Connection;

import com.sivakg.examples.dp.structural.facade.HTMLReport; 

public class HTMLReportImpl implements HTMLReport {

	@Override
	public void generateHTMLReport(Connection con, String tableName) {
		System.out.println("Generate HTML Report");

	}

}

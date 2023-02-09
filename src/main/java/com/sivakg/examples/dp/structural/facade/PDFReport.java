package com.sivakg.examples.dp.structural.facade;

import java.sql.Connection;

public interface PDFReport {

	public abstract void generatePDFReport(Connection con,String tableName);
}

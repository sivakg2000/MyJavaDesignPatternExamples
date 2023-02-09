package com.sivakg.examples.dp.structural.facade;

import java.sql.Connection;

public interface ExcelReport {

	public abstract void generateExcelReport(Connection con,String tableName);
}

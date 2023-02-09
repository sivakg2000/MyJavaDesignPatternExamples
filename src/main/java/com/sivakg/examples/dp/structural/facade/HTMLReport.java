package com.sivakg.examples.dp.structural.facade;

import java.sql.Connection;

public interface HTMLReport {

	public abstract void generateHTMLReport(Connection con,String tableName);
}

package org.shenjia.ocq;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import oracle.jdbc.OracleDriver;

public class OcqOracleDriver extends OracleDriver {
	

	@Override
	public Connection connect(String jdbcUrl, Properties info) throws SQLException {
		info.setProperty("fixedString", "true");
		return new ConnectionProxy(super.connect(jdbcUrl, info));
	}
	
}

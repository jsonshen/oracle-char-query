package org.shenjia.ocq;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Map;

class CallableStatementProxy extends PreparedStatementProxy<CallableStatement> implements CallableStatement {

	CallableStatementProxy(CallableStatement source) {
		super(source);
	}

	@Override
	public void registerOutParameter(int parameterIndex, int sqlType) throws SQLException {
		source.registerOutParameter(parameterIndex, sqlType);
	}

	@Override
	public void registerOutParameter(int parameterIndex, int sqlType, int scale) throws SQLException {
		source.registerOutParameter(parameterIndex, sqlType, scale);
	}

	@Override
	public boolean wasNull() throws SQLException {
		return source.wasNull();
	}

	@Override
	public String getString(int parameterIndex) throws SQLException {
		return source.getString(parameterIndex);
	}

	@Override
	public boolean getBoolean(int parameterIndex) throws SQLException {
		return source.getBoolean(parameterIndex);
	}

	@Override
	public byte getByte(int parameterIndex) throws SQLException {
		return source.getByte(parameterIndex);
	}

	@Override
	public short getShort(int parameterIndex) throws SQLException {
		return source.getShort(parameterIndex);
	}

	@Override
	public int getInt(int parameterIndex) throws SQLException {
		return source.getInt(parameterIndex);
	}

	@Override
	public long getLong(int parameterIndex) throws SQLException {
		return source.getLong(parameterIndex);
	}

	@Override
	public float getFloat(int parameterIndex) throws SQLException {
		return source.getFloat(parameterIndex);
	}

	@Override
	public double getDouble(int parameterIndex) throws SQLException {
		return source.getDouble(parameterIndex);
	}

	@Override
	@Deprecated
	public BigDecimal getBigDecimal(int parameterIndex, int scale) throws SQLException {
		return source.getBigDecimal(parameterIndex, scale);
	}

	@Override
	public byte[] getBytes(int parameterIndex) throws SQLException {
		return source.getBytes(parameterIndex);
	}

	@Override
	public Date getDate(int parameterIndex) throws SQLException {
		return source.getDate(parameterIndex);
	}

	@Override
	public Time getTime(int parameterIndex) throws SQLException {
		return source.getTime(parameterIndex);
	}

	@Override
	public Timestamp getTimestamp(int parameterIndex) throws SQLException {
		return source.getTimestamp(parameterIndex);
	}

	@Override
	public Object getObject(int parameterIndex) throws SQLException {
		return source.getObject(parameterIndex);
	}

	@Override
	public BigDecimal getBigDecimal(int parameterIndex) throws SQLException {
		return source.getBigDecimal(parameterIndex);
	}

	@Override
	public Object getObject(int parameterIndex, Map<String, Class<?>> map) throws SQLException {
		return source.getObject(parameterIndex, map);
	}

	@Override
	public Ref getRef(int parameterIndex) throws SQLException {
		return source.getRef(parameterIndex);
	}

	@Override
	public Blob getBlob(int parameterIndex) throws SQLException {
		return source.getBlob(parameterIndex);
	}

	@Override
	public Clob getClob(int parameterIndex) throws SQLException {
		return source.getClob(parameterIndex);
	}

	@Override
	public Array getArray(int parameterIndex) throws SQLException {
		return source.getArray(parameterIndex);
	}

	@Override
	public Date getDate(int parameterIndex, Calendar cal) throws SQLException {
		return source.getDate(parameterIndex, cal);
	}

	@Override
	public Time getTime(int parameterIndex, Calendar cal) throws SQLException {
		return source.getTime(parameterIndex, cal);
	}

	@Override
	public Timestamp getTimestamp(int parameterIndex, Calendar cal) throws SQLException {
		return source.getTimestamp(parameterIndex, cal);
	}

	@Override
	public void registerOutParameter(int parameterIndex, int sqlType, String typeName) throws SQLException {
		source.registerOutParameter(parameterIndex, sqlType, typeName);
	}

	@Override
	public void registerOutParameter(String parameterName, int sqlType) throws SQLException {
		source.registerOutParameter(parameterName, sqlType);
	}

	@Override
	public void registerOutParameter(String parameterName, int sqlType, int scale) throws SQLException {
		source.registerOutParameter(parameterName, sqlType, scale);
	}

	@Override
	public void registerOutParameter(String parameterName, int sqlType, String typeName) throws SQLException {
		source.registerOutParameter(parameterName, sqlType, typeName);
	}

	@Override
	public URL getURL(int parameterIndex) throws SQLException {
		return source.getURL(parameterIndex);
	}

	@Override
	public void setURL(String parameterName, URL val) throws SQLException {
		source.setURL(parameterName, val);
	}

	@Override
	public void setNull(String parameterName, int sqlType) throws SQLException {
		source.setNull(parameterName, sqlType);
	}

	@Override
	public void setBoolean(String parameterName, boolean x) throws SQLException {
		source.setBoolean(parameterName, x);
	}

	@Override
	public void setByte(String parameterName, byte x) throws SQLException {
		source.setByte(parameterName, x);
	}

	@Override
	public void setShort(String parameterName, short x) throws SQLException {
		source.setShort(parameterName, x);
	}

	@Override
	public void setInt(String parameterName, int x) throws SQLException {
		source.setInt(parameterName, x);
	}

	@Override
	public void setLong(String parameterName, long x) throws SQLException {
		source.setLong(parameterName, x);
	}

	@Override
	public void setFloat(String parameterName, float x) throws SQLException {
		source.setFloat(parameterName, x);
	}

	@Override
	public void setDouble(String parameterName, double x) throws SQLException {
		source.setDouble(parameterName, x);
	}

	@Override
	public void setBigDecimal(String parameterName, BigDecimal x) throws SQLException {
		source.setBigDecimal(parameterName, x);
	}

	@Override
	public void setString(String parameterName, String x) throws SQLException {
		source.setString(parameterName, x);
	}

	@Override
	public void setBytes(String parameterName, byte[] x) throws SQLException {
		source.setBytes(parameterName, x);
	}

	@Override
	public void setDate(String parameterName, Date x) throws SQLException {
		source.setDate(parameterName, x);
	}

	@Override
	public void setTime(String parameterName, Time x) throws SQLException {
		source.setTime(parameterName, x);
	}

	@Override
	public void setTimestamp(String parameterName, Timestamp x) throws SQLException {
		source.setTimestamp(parameterName, x);
	}

	@Override
	public void setAsciiStream(String parameterName, InputStream x, int length) throws SQLException {
		source.setAsciiStream(parameterName, x, length);
	}

	@Override
	public void setBinaryStream(String parameterName, InputStream x, int length) throws SQLException {
		source.setBinaryStream(parameterName, x, length);
	}

	@Override
	public void setObject(String parameterName, Object x, int targetSqlType, int scale) throws SQLException {
		source.setObject(parameterName, x, targetSqlType, scale);
	}

	@Override
	public void setObject(String parameterName, Object x, int targetSqlType) throws SQLException {
		source.setObject(parameterName, x, targetSqlType);
	}

	@Override
	public void setObject(String parameterName, Object x) throws SQLException {
		source.setObject(parameterName, x);
	}

	@Override
	public void setCharacterStream(String parameterName, Reader reader, int length) throws SQLException {
		source.setCharacterStream(parameterName, reader, length);
	}

	@Override
	public void setDate(String parameterName, Date x, Calendar cal) throws SQLException {
		source.setDate(parameterName, x, cal);
	}

	@Override
	public void setTime(String parameterName, Time x, Calendar cal) throws SQLException {
		source.setTime(parameterName, x, cal);
	}

	@Override
	public void setTimestamp(String parameterName, Timestamp x, Calendar cal) throws SQLException {
		source.setTimestamp(parameterName, x, cal);
	}

	@Override
	public void setNull(String parameterName, int sqlType, String typeName) throws SQLException {
		source.setNull(parameterName, sqlType, typeName);
	}

	@Override
	public String getString(String parameterName) throws SQLException {
		return source.getString(parameterName);
	}

	@Override
	public boolean getBoolean(String parameterName) throws SQLException {
		return source.getBoolean(parameterName);
	}

	@Override
	public byte getByte(String parameterName) throws SQLException {
		return source.getByte(parameterName);
	}

	@Override
	public short getShort(String parameterName) throws SQLException {
		return source.getShort(parameterName);
	}

	@Override
	public int getInt(String parameterName) throws SQLException {
		return source.getInt(parameterName);
	}

	@Override
	public long getLong(String parameterName) throws SQLException {
		return source.getLong(parameterName);
	}

	@Override
	public float getFloat(String parameterName) throws SQLException {
		return source.getFloat(parameterName);
	}

	@Override
	public double getDouble(String parameterName) throws SQLException {
		return source.getDouble(parameterName);
	}

	@Override
	public byte[] getBytes(String parameterName) throws SQLException {
		return source.getBytes(parameterName);
	}

	@Override
	public Date getDate(String parameterName) throws SQLException {
		return source.getDate(parameterName);
	}

	@Override
	public Time getTime(String parameterName) throws SQLException {
		return source.getTime(parameterName);
	}

	@Override
	public Timestamp getTimestamp(String parameterName) throws SQLException {
		return source.getTimestamp(parameterName);
	}

	@Override
	public Object getObject(String parameterName) throws SQLException {
		return source.getObject(parameterName);
	}

	@Override
	public BigDecimal getBigDecimal(String parameterName) throws SQLException {
		return source.getBigDecimal(parameterName);
	}

	@Override
	public Object getObject(String parameterName, Map<String, Class<?>> map) throws SQLException {
		return source.getObject(parameterName, map);
	}

	@Override
	public Ref getRef(String parameterName) throws SQLException {
		return source.getRef(parameterName);
	}

	@Override
	public Blob getBlob(String parameterName) throws SQLException {
		return source.getBlob(parameterName);
	}

	@Override
	public Clob getClob(String parameterName) throws SQLException {
		return source.getClob(parameterName);
	}

	@Override
	public Array getArray(String parameterName) throws SQLException {
		return source.getArray(parameterName);
	}

	@Override
	public Date getDate(String parameterName, Calendar cal) throws SQLException {
		return source.getDate(parameterName, cal);
	}

	@Override
	public Time getTime(String parameterName, Calendar cal) throws SQLException {
		return source.getTime(parameterName, cal);
	}

	@Override
	public Timestamp getTimestamp(String parameterName, Calendar cal) throws SQLException {
		return source.getTimestamp(parameterName, cal);
	}

	@Override
	public URL getURL(String parameterName) throws SQLException {
		return source.getURL(parameterName);
	}

	@Override
	public RowId getRowId(int parameterIndex) throws SQLException {
		return source.getRowId(parameterIndex);
	}

	@Override
	public RowId getRowId(String parameterName) throws SQLException {
		return source.getRowId(parameterName);
	}

	@Override
	public void setRowId(String parameterName, RowId x) throws SQLException {
		source.setRowId(parameterName, x);
	}

	@Override
	public void setNString(String parameterName, String value) throws SQLException {
		source.setNString(parameterName, value);
	}

	@Override
	public void setNCharacterStream(String parameterName, Reader value, long length) throws SQLException {
		source.setNCharacterStream(parameterName, value, length);
	}

	@Override
	public void setNClob(String parameterName, NClob value) throws SQLException {
		source.setNClob(parameterName, value);
	}

	@Override
	public void setClob(String parameterName, Reader reader, long length) throws SQLException {
		source.setClob(parameterName, reader, length);
	}

	@Override
	public void setBlob(String parameterName, InputStream inputStream, long length) throws SQLException {
		source.setBlob(parameterName, inputStream, length);
	}

	@Override
	public void setNClob(String parameterName, Reader reader, long length) throws SQLException {
		source.setNClob(parameterName, reader, length);
	}

	@Override
	public NClob getNClob(int parameterIndex) throws SQLException {
		return source.getNClob(parameterIndex);
	}

	@Override
	public NClob getNClob(String parameterName) throws SQLException {
		return source.getNClob(parameterName);
	}

	@Override
	public void setSQLXML(String parameterName, SQLXML xmlObject) throws SQLException {
		source.setSQLXML(parameterName, xmlObject);
	}

	@Override
	public SQLXML getSQLXML(int parameterIndex) throws SQLException {
		return source.getSQLXML(parameterIndex);
	}

	@Override
	public SQLXML getSQLXML(String parameterName) throws SQLException {
		return source.getSQLXML(parameterName);
	}

	@Override
	public String getNString(int parameterIndex) throws SQLException {
		return source.getNString(parameterIndex);
	}

	@Override
	public String getNString(String parameterName) throws SQLException {
		return source.getNString(parameterName);
	}

	@Override
	public Reader getNCharacterStream(int parameterIndex) throws SQLException {
		return source.getNCharacterStream(parameterIndex);
	}

	@Override
	public Reader getNCharacterStream(String parameterName) throws SQLException {
		return source.getNCharacterStream(parameterName);
	}

	@Override
	public Reader getCharacterStream(int parameterIndex) throws SQLException {
		return source.getCharacterStream(parameterIndex);
	}

	@Override
	public Reader getCharacterStream(String parameterName) throws SQLException {
		return source.getCharacterStream(parameterName);
	}

	@Override
	public void setBlob(String parameterName, Blob x) throws SQLException {
		source.setBlob(parameterName, x);
	}

	@Override
	public void setClob(String parameterName, Clob x) throws SQLException {
		source.setClob(parameterName, x);
	}

	@Override
	public void setAsciiStream(String parameterName, InputStream x, long length) throws SQLException {
		source.setAsciiStream(parameterName, x, length);
	}

	@Override
	public void setBinaryStream(String parameterName, InputStream x, long length) throws SQLException {
		source.setBinaryStream(parameterName, x, length);
	}

	@Override
	public void setCharacterStream(String parameterName, Reader reader, long length) throws SQLException {
		source.setCharacterStream(parameterName, reader, length);
	}

	@Override
	public void setAsciiStream(String parameterName, InputStream x) throws SQLException {
		source.setAsciiStream(parameterName, x);
	}

	@Override
	public void setBinaryStream(String parameterName, InputStream x) throws SQLException {
		source.setBinaryStream(parameterName, x);
	}

	@Override
	public void setCharacterStream(String parameterName, Reader reader) throws SQLException {
		source.setCharacterStream(parameterName, reader);
	}

	@Override
	public void setNCharacterStream(String parameterName, Reader value) throws SQLException {
		source.setNCharacterStream(parameterName, value);
	}

	@Override
	public void setClob(String parameterName, Reader reader) throws SQLException {
		source.setClob(parameterName, reader);
	}

	@Override
	public void setBlob(String parameterName, InputStream inputStream) throws SQLException {
		source.setBlob(parameterName, inputStream);
	}

	@Override
	public void setNClob(String parameterName, Reader reader) throws SQLException {
		source.setNClob(parameterName, reader);
	}

	@Override
	public <T> T getObject(int parameterIndex, Class<T> type) throws SQLException {
		return source.getObject(parameterIndex, type);
	}

	@Override
	public <T> T getObject(String parameterName, Class<T> type) throws SQLException {
		return source.getObject(parameterName, type);
	}

}

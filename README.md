# ORACLE CHAR QUERY

[How to use Oracle jdbc driver fixedString property?] (https://stackoverflow.com/questions/687018/how-to-use-oracle-jdbc-driver-fixedstring-property)

If the value of this property is "true", JDBC will use FIXED CHAR semantic when setObject is called with a String argument. By default JDBC uses VARCHAR semantics. The difference is in blank padding. With the default there is no blank padding so, for example, 'a' does not equal 'a ' in a CHAR(4). If true these two will be equal. 
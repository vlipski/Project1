package Task17_JDBC;

import java.io.PrintStream;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.sql.DatabaseMetaData;

import static Task17_JDBC.ConnectionUtils.getConnection;


public class SelectDataTable {

    public static int countColumn = 0;



    public static  void showSelectDataTable(String sql, String nameTable) {
        ResultSet rsLines = null;
        ResultSet rsColumn = null;
        String format = new String();
        String[] rowTable = new String[10];
        Pattern pattern = Pattern.compile("(?<=SELECT\\s)[\\*](?=.+FROM.*)");
        Matcher matcher = pattern.matcher(sql);
        if (matcher.find()) {
            try (Connection connection = getConnection();
                 Statement st = connection.createStatement()) {
                DatabaseMetaData metadata = connection.getMetaData();
                rsColumn = metadata.getColumns(null, null, nameTable, null);
//                int i = 0;
                while (rsColumn.next()) {
                    rowTable[countColumn] = rsColumn.getString("COLUMN_NAME").toUpperCase();
                    format += "%-20s";
                    countColumn++;
                }
                rsLines = st.executeQuery(sql);
            System.out.println(nameTable);
                System.out.printf(format + "%n", rowTable);
                ResultSetMetaData md = rsLines.getMetaData();
                while (rsLines.next()) {
                    System.out.printf(format + "%n",(md.getColumnCount() >= 1 ? rsLines.getObject(1) : ""),
                            (md.getColumnCount() >= 2 ? rsLines.getObject(2) : ""),
                            (md.getColumnCount() >= 3 ? rsLines.getObject(3) : ""),
                            (md.getColumnCount() >= 4 ? rsLines.getObject(4) : ""),
                            (md.getColumnCount() >= 5 ? rsLines.getObject(5) : ""),
                            (md.getColumnCount() >= 6 ? rsLines.getObject(6) : ""),
                            (md.getColumnCount() >= 7 ? rsLines.getObject(7) : ""),
                            (md.getColumnCount() >= 8 ? rsLines.getObject(8) : ""),
                            (md.getColumnCount() >= 9 ? rsLines.getObject(9) : ""),
                            (md.getColumnCount() >= 10 ? rsLines.getObject(10) : ""));
                }

                System.out.println("Total row count: " + md.getColumnCount());
            } catch (SQLException e) {
                System.out.println("Проблемы с получением данных");
                e.printStackTrace();
            } catch (DataBasaException e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    if (rsLines != null) {
                        rsLines.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } else {
            Pattern patternElse = Pattern.compile("(?<=\\.|\\s)[A-Z][A-Za-z_]*(?=,|\\s+FROM)");
            Matcher matcherElse = patternElse.matcher(sql);
            int i = 0;
            while (matcherElse.find()) {
//            System.out.println(matcher.group());
                rowTable[i] = matcherElse.group().toUpperCase();
                format += "%-20s";
                i++;
            }
            try (Connection connection = getConnection();
                 Statement st = connection.createStatement()) {
                rsLines = st.executeQuery(sql);
                System.out.println(nameTable);
                System.out.printf(format + "%n", rowTable);
                ResultSetMetaData md = rsLines.getMetaData();
                while (rsLines.next()) {
                    System.out.printf(format + "%n", (md.getColumnCount() >= 1 ? rsLines.getObject(1) : ""),
                            (md.getColumnCount() >= 2 ? rsLines.getObject(2) : ""),
                            (md.getColumnCount() >= 3 ? rsLines.getObject(3) : ""),
                            (md.getColumnCount() >= 4 ? rsLines.getObject(4) : ""),
                            (md.getColumnCount() >= 5 ? rsLines.getObject(5) : ""),
                            (md.getColumnCount() >= 6 ? rsLines.getObject(6) : ""),
                            (md.getColumnCount() >= 7 ? rsLines.getObject(7) : ""),
                            (md.getColumnCount() >= 8 ? rsLines.getObject(8) : ""),
                            (md.getColumnCount() >= 9 ? rsLines.getObject(9) : ""),
                            (md.getColumnCount() >= 10 ? rsLines.getObject(10) : ""));
                }
                System.out.println("Total row count: " + md.getColumnCount());
            } catch (SQLException e) {
                System.out.println("Проблемы с получением данных");
                e.printStackTrace();
            } catch (DataBasaException e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    if (rsLines != null) {
                        rsLines.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

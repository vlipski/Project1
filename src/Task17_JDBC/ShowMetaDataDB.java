package Task17_JDBC;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static Task17_JDBC.ConnectionUtils.getConnection;


public class ShowMetaDataDB {

    static DatabaseMetaData metadata;


    public static  void showMetaDataDbComplet(){
        try (Connection conn = getConnection()) {
            metadata = conn.getMetaData();
            List database = getTablesMetadata();
            System.out.println("Tables:");
            database.forEach(System.out::println);
            getColumnsMetadata(database);
    } catch (SQLException e) {
            System.out.println("Проблемы с получением данных");
        } catch (DataBasaException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void showNameTablesDb(){
        try (  Connection conn = getConnection()) {
            metadata = conn.getMetaData();
            List database = getTablesMetadata();
            System.out.println("Tables:");
            database.forEach(System.out::println);
    } catch (SQLException e) {
            System.out.println("Проблемы с получением данных");
        } catch (DataBasaException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void showMetaDataColumnTables(String nameTable) {
        ResultSet rs = null;
        try (Connection conn = getConnection()) {
            metadata = conn.getMetaData();
            rs = metadata.getColumns(null, null, nameTable, null);
            System.out.println("Table detail info:");
            System.out.println(nameTable.toUpperCase());
            System.out.printf("%20s\t%s\t%s\t%n", "Column Name", "Type Name", "Column size");
            int i = 0;
            while (rs.next()) {
                System.out.printf("%20s\t%9s\t%5s\t%n",
                        rs.getString("COLUMN_NAME"),
                        rs.getString("TYPE_NAME"),
                        rs.getString("COLUMN_SIZE"));
                i++;
            }
            System.out.println("Total columns count: " + i);
        } catch (SQLException e) {
            System.out.println("Проблемы с получением данных");
        } catch (DataBasaException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (rs != null)
                    rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static List getTablesMetadata() throws SQLException {
        String table[] = {"TABLE"};
        ResultSet rs = null;
        rs = metadata.getTables(null, null, null, table);
        List tables = new ArrayList();
        while (rs.next()) {
            tables.add(rs.getString("TABLE_NAME"));
        }

        return tables;
    }

    public static void getColumnsMetadata(List<String> tables) throws SQLException {
        ResultSet rs = null;
        System.out.println("Table detail info:");
        for (String actualTable : tables) {
            rs = metadata.getColumns(null, null, actualTable, null);
            System.out.println(actualTable.toUpperCase());
            System.out.printf("%20s\t%s\t%s\t%n", "Column Name", "Type Name", "Column size");
            while (rs.next()) {
                System.out.printf("%20s\t%9s\t%5s\t%n",
                        rs.getString("COLUMN_NAME"),
                        rs.getString("TYPE_NAME"),
                        rs.getString("COLUMN_SIZE"));
            }
        }
    }

}

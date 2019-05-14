package Task17_JDBC;

import java.sql.*;


public class CreatDataBaseTable {

    static Statement st;
    static PreparedStatement prst;
    private static final String patternDevelop = "INSERT INTO developers ( NAME, SPECIALTY,SALARY) VALUES (?, ?, ?)";


    public static void creatUpdateTable(String sql) {
        try (Connection connect = ConnectionUtils.getConnection()) {
            st = connect.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Проблемы с вносимыми данными");
        } catch (DataBasaException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int insertDataTable( Developers develop) throws SQLException {
        try (Connection connect = ConnectionUtils.getConnection()){
            prst = connect.prepareStatement(patternDevelop);
            prst.setString(1, develop.name);
            prst.setString(2, develop.specialty);
            prst.setInt(3, develop.salary);
            return prst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Проблемы с вносимыми данными");
            return 0;
        } catch (DataBasaException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}

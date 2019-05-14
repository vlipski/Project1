package Task17_JDBC;


import java.sql.SQLException;

import static Task17_JDBC.CreatDataBaseTable.creatUpdateTable;
import static Task17_JDBC.CreatDataBaseTable.insertDataTable;
import static Task17_JDBC.SelectDataTable.showSelectDataTable;
import static Task17_JDBC.ShowMetaDataDB.*;


public class DemoDataBase {
    public static void main(String[] args) {

        showSelectDataTable("SELECT author.FamilyName, author.Country, AVG (books.NumberPages) AS AVG_Pages,(" +
                "   SELECT AVG(books.NumberPages) \n" +
                "\t FROM book.books                " +
                "\t JOIN book.author \n" +
                "\t\t ON books.ID_author = author.ID_author OR books.Soauthor = author.ID_author\n" +
                ") AS General_AVG_Pages \n" +
                "\tFROM book.books \n" +
                "\tJOIN book.author \n" +
                "\t\tON books.ID_author = author.ID_author OR books.Soauthor = author.ID_author\n" +
                "        GROUP BY author.FamilyName \n" +
                "        HAVING AVG (books.NumberPages) > General_AVG_Pages \n" +
                "        ORDER BY author.DateBirth;", "book");
//        showMetaDataDbComplet();
//        showNameTablesDb();
//        showMetaDataColumnTables("developers");
//        creatUpdateTable("DELETE FROM developers WHERE Name = 'petya' LIMIT 1 ");

       /* try {
            int i =  insertDataTable(new Developers("vitya", "driver", 1200));
            System.out.println(i);
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    }
}

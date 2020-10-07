import java.sql.Connection;
import java.sql.DriverManager;

public class IOManager {
    Connection connection;

    public IOManager() {
    }

    static long isbn;
    static String titel;
    static String vornameAutor;
    static String nachnameAutor;
    static String standort;

    public boolean connectToMysql(String host, String database, String user, String passwd) {
        try {
            java.sql.Statement stmt;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String connectionCommand = "jdbc:mysql://"+host+"/"+database+"&user="+user+"&password="+passwd;
            connection = DriverManager.getConnection(connectionCommand);

            stmt = connection.createStatement();
            stmt.executeUpdate("INSERT INTO buecher (ISBN, Titel, VornameAutor, NachnameAutor, Standort)" + "VALUES('"+isbn+"', '"+titel+"', '"+vornameAutor+"', '"+nachnameAutor+"', '"+standort+"')"); {

            }

            return true;
        }catch (Exception ex) {
            System.out.println(ex);
            System.out.println("false");
            return false;
        }
    }


}


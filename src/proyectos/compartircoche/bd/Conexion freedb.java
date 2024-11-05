package proyectos.compartircoche.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class Conexion {
    static final String HOST = "sql.freedb.tech";
    static final String DATABASE = "freedb_dam12425";
    static final String USER = "freedb_dam12425";
    static final String PASSWORD = "N6ynS8#UsHUKRpG";
    static final String PORT = "3306";

    /**
     * Conecta con la base de datos
     *
     * @return Conexión con la base de datos
     */
    public static Connection conectar() {
        Connection con = null;

        String url = "jdbc:mysql://" + Conexion.HOST + ":" + Conexion.PORT + "/" + Conexion.DATABASE;

        try {
            con = DriverManager.getConnection(url, Conexion.USER, Conexion.PASSWORD);
        } catch (SQLException e) {
            System.out.println("Error al conectar con la BD.");
        }

        return con;
    }
}

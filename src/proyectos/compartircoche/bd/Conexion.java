package proyectos.compartircoche.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class Conexion {
    static final String HOST = "7qq-d.h.filess.io";
    static final String DATABASE = "dam1_notecornam";
    static final String USER = "dam1_notecornam";
    static final String PASSWORD = "5d909372ed1f2f177f80c7ddae92ba8981f43fff";
    static final String PORT = "3305";

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
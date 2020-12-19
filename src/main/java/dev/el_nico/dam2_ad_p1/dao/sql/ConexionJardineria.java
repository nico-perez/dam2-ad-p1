package dev.el_nico.dam2_ad_p1.dao.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionJardineria implements AutoCloseable {

    private Connection conn;

    private PedidosSqlDao pedidosDao;
    private ClientesSqlDao clientesDao;
    private ProductosSqlDao productosDao;

    private void initDaos() {
        clientesDao = new ClientesSqlDao(conn);
        pedidosDao = new PedidosSqlDao(conn);
        productosDao = new ProductosSqlDao(conn);
    }

    public boolean login(String user, String pass) {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jardineria?serverTimezone=UTC", user, pass);
            initDaos();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al loginear.");
            return false;
        }
    }

    public PedidosSqlDao pedidos() {
        return pedidosDao;
    }

    public ClientesSqlDao clientes() {
        return clientesDao;
    }

    public ProductosSqlDao productos() {
        return productosDao;
    }

    @Override
    public void close() throws SQLException {
        if (conn != null) {
            if (!conn.getAutoCommit()) conn.commit();
            conn.close();
        }
    }
}

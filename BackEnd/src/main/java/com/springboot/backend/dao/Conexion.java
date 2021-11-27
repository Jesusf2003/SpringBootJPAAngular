package com.springboot.backend.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	
	public static Connection cnx = null;
	public static Connection conectar() throws Exception {
		try {
			Class.forName("org.postgresql.Driver");
			cnx = DriverManager.getConnection("jdbc:postgresql://localhost/SpringBootDB", "postgres", "pgsql1234");
		} catch (Exception e) {
			System.out.println("Hay problemas con la conexión: "+ e.getMessage());
		}
		return cnx;
	}
	
	public static void cerrarCnx() throws Exception {
		if (Conexion.cnx != null) {
			cnx.close();
		}
	}

	public static Connection getCnx() {
		return cnx;
	}

	public static void setCnx(Connection cnx) {
		Conexion.cnx = cnx;
	}

	public static void main(String[] args) throws Exception{
		conectar();
		if (cnx != null) {
			System.out.println("Conectado");
		} else {
			System.out.println("Sin conexión");
		}
	}
}

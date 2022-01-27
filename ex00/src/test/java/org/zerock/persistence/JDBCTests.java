package org.zerock.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	static {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (Exception e) {
			e.fillInStackTrace();
		}
	}
	
	@Test
	public void testConnection() {

		try (Connection con = 
				DriverManager.getConnection(
						"jdbc:mariadb://localhost:3306/gwebfax",
						"book_ex",
						"gmsadmin12#")) {
			log.info(con);
		} catch (Exception e) {
		}
	}
}

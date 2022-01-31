package org.zerock.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

@Log4j2
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
						"jdbc:mariadb://localhost:3306/cswebproject",
						"book_ex",
						"gmsadmin12#")) {
			log.info(con);
		} catch (Exception e) {
		}
	}
}

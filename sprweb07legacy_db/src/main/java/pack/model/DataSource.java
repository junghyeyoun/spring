package pack.model;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component
// @Repository
public class DataSource extends DriverManagerDataSource {
	public DataSource() {
		// 연결정보 바깥으로 뺌
		setDriverClassName("org.mariadb.jdbc.Driver");
		setUrl("jdbc:mariadb://localhost:3306/test");
		setUsername("root");
		setPassword("seoho123");
	}
}

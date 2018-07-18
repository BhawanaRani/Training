package com.training.profile;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
//prod-Mysql
@Configuration
@Profile("production")
public class ProdDatabaseConfig implements DataBaseConfig{
	@Bean
	public DataSource createDataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		System.out.println("creating production dataSource");
		return dataSource;
	}

}

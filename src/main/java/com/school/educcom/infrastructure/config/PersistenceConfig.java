package com.school.educcom.infrastructure.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author globalomnium
 */
@EnableTransactionManagement
@EnableJpaRepositories(
    basePackages = { "com.school.educcom.infrastructure.persistence" }
)
@EntityScan(
    basePackages = "com.school.educcom.infrastructure.persistence.entity"
)
@Configuration
public class PersistenceConfig {
}
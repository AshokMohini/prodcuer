package com.debezium.application.config;

import io.debezium.connector.mysql.MySqlConnector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DebeziumConnectorConfig {

    @Bean
    public io.debezium.config.Configuration customerConnector() {
        return io.debezium.config.Configuration.create()
                .with("connector.class", MySqlConnector.class)
                .with("offset.storage",  "org.apache.kafka.connect.storage.FileOffsetBackingStore")
                .with("offset.storage.file.filename", "employee-offset.dat")
                .with("offset.flush.interval.ms", 60000)
                .with("topic.prefix","customerdb")
                .with("name", "mysql-connector-1")
                .with("database.server.id", "185747")
                .with("database.server.name", "mysqlServer")
                .with("debezium.source.database.history", "io.debezium.relational.history.MemoryDatabaseHistory")
                .with("database.hostname", "192.168.0.104")
                .with("database.port", "3306")
                .with("database.user", "root")
                .with("database.password", "root")
                .with("database.dbname", "customerdb")
                .with("include.schema.changes","false")
                .with("schema.history.internal","io.debezium.storage.file.history.FileSchemaHistory")
                .with("schema.history.internal.file.filename","schistory.dat")
                .build();
    }
}

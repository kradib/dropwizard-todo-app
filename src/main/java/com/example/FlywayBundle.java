package com.example;

import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.lifecycle.Managed;
import org.flywaydb.core.Flyway;

public class FlywayBundle implements Managed {

    private final DataSourceFactory dataSourceFactory;

    public FlywayBundle(DataSourceFactory dataSourceFactory) {
        this.dataSourceFactory = dataSourceFactory;
    }

    @Override
    public void start() throws Exception {

        Flyway.configure()
                .dataSource(
                        dataSourceFactory.getUrl(),
                        dataSourceFactory.getUser(),
                        dataSourceFactory.getPassword()
                )
                .load()
                .migrate();

    }

    @Override
    public void stop() throws Exception {

    }
}

package com.xxt.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MyMultiDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return null;
    }
}

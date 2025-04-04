package com.consistency.config;

import com.consistency.localstorage.RocksLocalStorage;
import org.rocksdb.RocksDBException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * RocksDB的配置
 *
 * @author xiayang
 **/
@Component
public class RocksDBConfig {

    @Autowired
    private TendConsistencyConfiguration tendConsistencyConfiguration;

    @Bean
    public RocksLocalStorage rocksStore() throws RocksDBException {
        return new RocksLocalStorage(tendConsistencyConfiguration.getRocksPath());
    }

}

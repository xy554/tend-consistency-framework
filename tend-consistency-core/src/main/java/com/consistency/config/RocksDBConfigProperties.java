package com.consistency.config;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 任务分库相关的配置
 *
 * @author xiayang
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "tend.consistency.rocksdb")
public class RocksDBConfigProperties {

    /**
     * RocksDB的存储文件夹目录
     */
    public String rocksPath;

}

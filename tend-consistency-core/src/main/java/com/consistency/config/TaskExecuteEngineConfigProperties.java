package com.consistency.config;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 任务分片相关的配置
 *
 * @author xiayang
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "tend.consistency.task.sharding")
public class TaskExecuteEngineConfigProperties {

    /**
     * 任务分片数
     */
    public Long taskShardingCount;

}

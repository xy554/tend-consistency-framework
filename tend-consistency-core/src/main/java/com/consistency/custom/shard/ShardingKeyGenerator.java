package com.consistency.custom.shard;

/**
 * 任务分片键生成器接口
 * 如业务服务需要定制，实现该接口即可
 *
 * @author xiayang
 **/
public interface ShardingKeyGenerator {

    /**
     * 生产一致性任务分片键
     *
     * @return 一致性任务分片键
     */
    long generateShardKey();

}
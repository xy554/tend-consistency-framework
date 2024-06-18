package com.consistency.annotation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 组件扫描配置
 *
 * @author xiayang
 */
@Configuration
@ComponentScan(value = {"com.consistency"}) // 作用是让spring去扫描框架各个包下的bean
@MapperScan(basePackages = {"com..consistency.mapper"})
public class ComponentScanConfig {


}

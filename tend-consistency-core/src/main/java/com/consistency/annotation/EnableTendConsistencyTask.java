package com.consistency.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 启用一致性框架的注解
 *
 * @author xiayang
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.TYPE)
@Import({ConsistencyTaskSelector.class})
public @interface EnableTendConsistencyTask { // 对于这个注解来说，唯一的作用就是触发其他的class运行
}

package com.example.demo1.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration                        // ① Spring 配置类
public class MybatisPlusConfig {

    @Bean                             // ② 注册为 Bean
    public MybatisPlusInterceptor
    mybatisPlusInterceptor() {

        // ③ 创建总拦截器（插件容器）
        MybatisPlusInterceptor interceptor =
                new MybatisPlusInterceptor();

        // ④ 添加分页内部拦截器
        PaginationInnerInterceptor pi =
                new PaginationInnerInterceptor(DbType.MYSQL);
        pi.setMaxLimit(500L);         // 防全表，单页最多 500
        pi.setOverflow(false);        // 越界页不归零
        interceptor.addInnerInterceptor(pi);

        // ⑤ 可继续叠加其它插件
        // interceptor.addInnerInterceptor(
        //     new OptimisticLockerInnerInterceptor());
        return interceptor;
    }
}

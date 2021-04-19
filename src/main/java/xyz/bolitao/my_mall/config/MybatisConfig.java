package xyz.bolitao.my_mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("xyz.bolitao.my_mall.mapper")
public class MybatisConfig {
}

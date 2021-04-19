package xyz.bolitao.my_mall.config;

import org.mybatis.spring.annotation.MapperScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScans({"xyz.bolitao.my_mall.mapper"})
public class MybatisConfig {
}

package sb.project.example.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("sb.project.example.mapper*")
public class MyBatisConfig {
}

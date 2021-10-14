package dell.funlearning.funlearning.Configurations;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DBConfig {

    @Value("${db.username}")
    private String user;

    @Value("${db.password}")
    private String password;

    @Value("${db.url}")
    private String url;

    @Bean
    public DataSource dataSource() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setUsername(user);
        hikariDataSource.setPassword(password);
        hikariDataSource.setJdbcUrl(url);

        return hikariDataSource;
    }
}

package rs.inforce.dataapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import rs.inforce.dataapp.beans.ExampleBean;
import rs.inforce.dataapp.beans.TestDatasource;

@Configuration
@PropertySource("classpath:testdatasource.properties")
public class BeanConfig {

    @Value("${qh.username}")
    private String username;
    @Value("${qh.password}")
    private String password;
    @Value("${qh.url}")
    private String url;

    @Bean
    public TestDatasource testDatasource() {
        TestDatasource testDatasource = new TestDatasource();
        testDatasource.setUsername(this.username);
        testDatasource.setPassword(this.password);
        testDatasource.setUrl(this.url);
        return testDatasource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
        return pspc;
    }

    @Bean
    @Scope("prototype")
    public ExampleBean exampleBeanPrototype() {
        return new ExampleBean();
    }
}

package springmvc.config;

import java.rmi.registry.RegistryHandler;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jndi.JndiTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import springmvc.dao.kullaniciDao;
import springmvc.dao.kullaniciDaoArayuz;
@Configuration
@EnableWebMvc
@ComponentScan(basePackages="springmvc")

public class WebConfig extends WebMvcConfigurerAdapter{
	DataSource dataSource;
	
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate(){
		return new NamedParameterJdbcTemplate(dataSource);
	}
	//@Bean
	/*public DataSource getDataSource() throws NamingException{
		JndiTemplate jndiTemplate =new JndiTemplate();
		DataSource dataSource =(DataSource) jndiTemplate.lookup("java:comp/env/jdbc/projemysql");
		return dataSource;
		
	}*/
	
	
	
	@Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/projemysql");
        dataSource.setUsername("root");
        dataSource.setPassword("Gencayse10.");
         
        return dataSource;
    }
     
    @Bean
    public kullaniciDao getContactDao() {
        return new kullaniciDaoArayuz();
    }
	
	
	
	@Override
	public void addResourceHandlers (ResourceHandlerRegistry registry){
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
		
		
	}
	
	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
		
	}
	
}

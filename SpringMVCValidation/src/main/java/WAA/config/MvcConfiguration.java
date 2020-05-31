package WAA.config;

import javax.validation.Validator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="WAA")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter{

	ReloadableResourceBundleMessageSource source;
	
	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/jsp/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@Bean
    public ReloadableResourceBundleMessageSource messageSource() {

		source = new ReloadableResourceBundleMessageSource();
        source.setBasenames("classpath:errorMessages");
        return source;
    }
    @Bean
    public Validator validatorFactory () {
    	LocalValidatorFactoryBean validator =new LocalValidatorFactoryBean();
    	validator.setValidationMessageSource(source);
        return validator;
    }
}

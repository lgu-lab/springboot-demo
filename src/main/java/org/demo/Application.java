package org.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
	
	/**
	 * The main() method uses Spring Boot’s SpringApplication.run() method to launch an application. 
	 * Did you notice that there wasn’t a single line of XML? No web.xml file either. 
	 * This web application is 100% pure Java and you didn’t have to deal with configuring any plumbing or infrastructure.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
    /**
     * There is also a CommandLineRunner method marked as a @Bean and this runs on start up. 
     * It retrieves all the beans that were created either by your app or were automatically added thanks to Spring Boot. 
     * It sorts them and prints them out.
     * 
     * @param ctx
     * @return
     */
    @Bean
    public CommandLineRunner commandLineRunner(final ApplicationContext ctx) {
    	
    	return new CommandLineRunner() {
    		public void run(String... args) {
    	        // Do something...
    			System.out.println("Let's inspect the beans provided by Spring Boot:");
				String[] beanNames = ctx.getBeanDefinitionNames();
				Arrays.sort(beanNames);
				for (String beanName : beanNames) {
					System.out.println(beanName);
				}
    	    }
    	};
    	
// Java 8    	
//        return args -> {
//
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//
//        };
    }
	

}

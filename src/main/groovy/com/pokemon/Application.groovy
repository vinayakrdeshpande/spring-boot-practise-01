package com.pokemon

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 */

/**
 * @author vishr
 * In groovy every class is public by default
* so you don't need to write "public class" anymore
 */
@SpringBootApplication
 class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        // You can omit the last method call parenthesis
        // This is the same as .run(Application, args)
        // also you can omit ;
        SpringApplication.run Application, args
	}

}

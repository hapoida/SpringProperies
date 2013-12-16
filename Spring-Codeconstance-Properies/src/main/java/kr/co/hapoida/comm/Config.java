package kr.co.hapoida.comm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class Config {
	
	@Value("BONG") private String name;
	@Value("${hapoida.age}") private String age;
	
	@Bean
	public CodeContance codeConstance(){
		CodeContance codeContance = new CodeContance();
		codeContance.setName(name);
		codeContance.setAge(age);
		
		return codeContance;
	}
}

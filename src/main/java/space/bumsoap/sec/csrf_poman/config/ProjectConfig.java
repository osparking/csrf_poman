package space.bumsoap.sec.csrf_poman.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CsrfFilter;

import space.bumsoap.sec.csrf_poman.filter.CsrfLoggerFilter;

@Configuration
public class ProjectConfig {

	@Bean
	protected SecurityFilterChain filterChain(HttpSecurity http)
			throws Exception {
		http.httpBasic(Customizer.withDefaults());
		http.addFilterAfter(
				new CsrfLoggerFilter(), CsrfFilter.class);
		return http.build();
	}
}

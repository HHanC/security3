package web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import web.service.MemberService;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
                                    // 웹 시큐리티 설정 관련 상속 클래스

    @Autowired
    private MemberService memberService;

    // 암호화 제공 [특정 필드 암호화]
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests()
                .antMatchers("/**").permitAll()
                .and()
                .csrf()
                .ignoringAntMatchers("/member/signup")
                .and()
                .exceptionHandling()
                .accessDeniedPage("/error");
    }

}

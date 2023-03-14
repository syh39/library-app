package com.group.libraryapp.config;

import org.springframework.context.annotation.Configuration;

// @Component는 CSR이 모두 아니고 개발자가 직접 작성한 클래스를 등록할 때!
@Configuration // 외부 라이브러리나 프레임워크에서 만든 클래스를 등록할 때!
public class UserConfiguration {

//    @Bean
//    public UserRepository userRepository(JdbcTemplate jdbcTemplate) {
//        return new UserRepository(jdbcTemplate);
//    }
}

// 스프링 빈 주입 방법
// 1. 생성자를 통해 주입(가장 추천) / 스프링 버전 업데이트 되면서 @Autowired 없어도 가능
// 2. setter와  @Autowired 사용
// 3. 필드에 직접 @Autowired 사용

//package hello.hellospring;
//
//import hello.hellospring.repository.MemberRepository;
//import hello.hellospring.repository.MemoryMemberRepository;
//import hello.hellospring.service.MemberService;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SpringConfig {
//
//    @Bean
//    public MemberService memberService() {
//        return new MemberService(memberRepository());
//    }
//
//    @Bean
//    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
//}

/*
    컴포넌트 스캔, 자동 의존관계 설정(@Service, @Repository, @Autowired)을 사용하지 않고
    자바 코드로 직접 스프링 빈 등록
*/

[![JIHO's GitHub stats](https://github-readme-stats.vercel.app/api?username=namepgb&include_all_commits=true&theme=nord&hide_border=true&count_private=true)](https://github.com/namepgb/github-readme-stats)

## Preview
`초보 웹 개발자를 위한 스프링 5 프로그래밍 입문` 서적에서 안내된 예제 프로젝트를 생성하고 `Spring`을 학습합니다.
> 
> 이 프로젝트의 개발 환경
>
> <img src="https://img.shields.io/badge/IntelliJ IDEA:2020.3 Ultimate Edition-000000?style=for-the-badge&logo=intellijidea&logoColor=white">
> <img src="https://img.shields.io/badge/OpenJDK:12-437291?style=for-the-badge&logo=openjdk&logoColor=white">
> <img src="https://img.shields.io/badge/Spring:5.0.2.RELEASE-6DB33F?style=for-the-badge&logo=spring&logoColor=white">
> <img src="https://img.shields.io/badge/Gradle:7.3-02303A?style=for-the-badge&logo=gradle&logoColor=white">

> 이 프로젝트에서는 다음 내용을 포함합니다.
> * Chapter 6 빈 라이프사이클과 범위
>   * 컨테이너 초기화와 종료
>   * 스프링 Bean 객체의 라이프사이클
>     * Bean 객체의 초기화와 소멸: 스프링 인터페이스
>     * Bean 객체의 초기화와 소멸: 커스텀 메소드
>   * Bean 객체의 생성과 관리 범위

## sp5-chap06/src/main/java/chap06_a
> * `org.springframework.beans.factory.InitializingBean`을 상속합니다. Bean 객체가 초기화 직후 호출되는 함수를 구현합니다.
> * `org.springframework.beans.factory.DisposableBean`을 상속합니다. Bean 객체가 소멸 직전 호출되는 함수를 구현합니다.
> * `@Bean`의 `initMethod` 옵션으로 초기화 직후 호출되는 함수를 직접 지정합니다.
> * `@Bean`의 `destroyMethod` 옵션으로 소멸 직전 호출되는 함수를 직접 지정합니다.
> 
> 블로그 참고 문서
> * [Spring 5 입문: Chapter 06. Bean 라이프사이클과 범위](https://namepgb.tistory.com/247)

## sp5-chap06/src/main/java/chap06_b
> * 설정 클래스에서 `@Scope("prototype")`으로 프로토타입 범위의 Bean을 등록합니다.
> * `프로토타입 범위의 Bean`의 라이프사이클을 테스트합니다.
> 
> 블로그 참고 문서
> * [Spring 5 입문: Chapter 06. Bean 라이프사이클과 범위](https://namepgb.tistory.com/247)

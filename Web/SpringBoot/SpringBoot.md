# SpringBoot  
스프링 부트는 스프링 프레임워크에 톰캣 서버를 내장하고 여러 편의 기능들을 추가한 것임.  
기본적으로 웹 보안 기능들도 같이 들어있어 공격을 막아줌.  

레거시 프로젝트는 기본적으로 WAR 파일로 만들어짐.  
이를 서버에 올려서 구동하는 방식으로 사용함.  

반면에 JAR 파일은 server, spring, db 등을 담아서  
실행하면 java를 통해 서버를 구동시킬 수 있음.

SpringBoot가 제공하는 WelcomePage 기능 :  
resource/static/index.html 을 올려두면 Welcome Page 기능을 제공함.  

## application.properties  
Spring과 관련된 모든 설정을 관리하는 파일.  
`logging.level.root=WARN` : 로깅이나 에러에 관련된 내용만 출력하도록 설정.  
`spring.main.banner-mode=off` : spring 로고를 출력하지 않도록 설정.  
`server.port=포트번호` : 서버 포트를 지정.  


## template와 static  
template : 동적 뷰 파일이 들어감. 보통 동적 html 파일(타임리프같은 템플릿 엔진을 통해 처리되는 파일)들이 들어간다.   
static : 변하지 않는 고정 파일이 들어감. 보통 정적 html, image, css, js 같은 파일들을 넣어둠.  

## Test  
테스트 코드. 실제 코드에는 반영되지 않음.  
`given`, `when`, `then` 문법으로 나누어 작성하면 가독성이 올라감.  
given : 선언부  
when : 실행부  
then : 검증부  

## Dependencies  
gradle 기준 dependency 앞에 붙는 옵션에 따라 어떻게 사용할지 (테스트할 때만 사용할지, 빌드할 때도 사용할 지) 지정할 수 있음.  
`implementation`  
`developmentOnly`  
`testImplementation`  
`testRuntimeOnly`  
`annotationProcessor`  
`complieOnly`  

https://twinparadox.tistory.com/630  

### spring-boot-devtools  
프로젝트 코드 수정 후, 수정사항을 서버에 자동으로 적용시켜주는 의존성  

### ThymeLeaf  

#### ThymeLeaf fragment
jsp에서 <jsp:include page="파일" />과 같은 효과를 내는 기능.
미리 작성해둔 외부 html 파일을 가져와서 사용할 수 있다.
보통 Navbar, 푸터 등으로 사용함.

외부 html의 요소 중 가져올 요소에, th:fragment="이름" 속성을 추가해주면 됨.
가져올 때는, 내용을 적용할 (같은 종류의) 요소에 th:replace="~{파일명 :: 이름}" 속성을 추가해주면 됨.

th:replace는 요소의 본래 내용물을 없애고 가져온 내용으로 갈아치움.
th:insert는 요소의 본래 내용물에 이어 붙임.

예시
```html
(nav.html)

<div class="nav" th:fragment="navbar">
	...
</div>
<!-- ---------------------------- -->
(asdf.html)

<div th:replace="~{nav.html :: navbar}"></div>
```

### Lombok  
간편한 어노테이션들을 추가해줌.  

`Getter`, `Setter` : Getter Setter 메서드를 추가해줌.  
`RequiredArgeContructor` : 클래스의 필드를 보고, 매개변수가 있는 생성자를 자동으로 만들어줌.  

### JPA  

Java Persistence API  

JPA로 데이터베이스를 매핑하는 방법은 두 가지가 있음.  

1. EntityManager  
    
    
2. JpaRepository  
    
    interface JpaRepository를 상속받아 클래스를 구현하면 간단하게 사용할 수 있음.  
    

JpaRepository는 어떤 DBMS를 사용하든 알아서 감지해줌.  

그래서 유지보수할 때 java 코드만 수정하면 됨.  

[application.properties](http://application.properties) 내에 h2 database 정보를 아래와 같이 적어 사용할 수 있음.

```
#Database
spring.h2.console.enabled=true // h2 console 허용
spring.h2.console.path=/h2-console  // h2 console 접속 경로 설정
spring.datasource.url=jdbc:h2:~/local // h2 데이터베이스 경로 설정
spring.datasource.driverClassName=org.h2.Driver // h2 db 드라이버 설정
spring.datasource.username=sa // db 접속 id,pw 지정
spring.datasource.password=

#JPA
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.H2Dialect  // springboot와 hibernate를 같이 사용할 때 필요한 설정
spring.jpa.properties.hibernate.show_sql=true // sql 요청이 일어날 때 콘솔에 출력하도록 설정
spring.jpa.hibername.ddl-auto=update // db 테이블과 java Entity가 다를 때, 자동으로 업데이트하도록 설정 
```

**spring.jpa.hibername.ddl-auto=update** 

 db 테이블과 java Entity가 다를 때, 자동으로 업데이트하도록 설정 

 보통 운영중일 때는 none으로 설정해둠.
 none, update, validate, create, create-drop이 있음.

`none`: 엔티티가 변경되어도 DB를 그대로 둠.

`validate`: 엔티티가 변경되었는지 ‘검사’만 함.

`updata` : 엔티티 변경이 감지되면 변경된 부분만 DB에 반영.

`create` : 서버를 시작할 때, 테이블을 전부 삭제한 뒤 다시 생성.

`create-drop`: create와 동일하지만, 서버를 종료할 때도 테이블을 삭제함.

주로 **개발**시에는 `update`. **운영**할 땐 `none` 또는 `validate`를 사용함.

~/local은 “C:Users/사용자명” 경로임.

이곳에 아무런 내용이 없는 **local.mv.db** 파일을 만들어 놓아보자.

이렇게 하고 서버를 실행한 뒤, “http://localhost:8080/h2-console” 경로로 요청하면

h2 console창이 뜬다.

JDBC URL에 “jdbc:h2:~/local”을 입력하고 `Connect` 버튼을 누르면

아까 만든 db(local.mv.db)에 연결된 것임.
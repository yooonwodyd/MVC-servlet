## 스프링의 MVC 구현

스프링 MVC 구조를 이해하기 위해 직접 MVC를 만들어보는 테스트 프로젝트입니다.


## 개발 환경

* Intellij IDEA Ultimate
* Java 11
* Spring Boot 2.x.x

##  v0

다음과 같은 기능을 구현했습니다.

1. webservlet 에서 ObjectMapper를 이용해 messageBody의 json 데이터를 처리하기 + response로 처리한 데이터 전송하기

2. 1번의 기능을 발전시켜 PrintWriter을 이용해 클래스 내부에서 html 처리하기

3. RequestDistpatcher를 이용해서 원하는 viewPath로 이동하기 이때 viewPathsms jsp로 구현

## v1

1. 단일 webservlet에서 여러 url을 알맞은 controller로 전송하기

## v2

1. v1을 발전시켜, dispatcher로 view 주소를 넣는 과정을 webservlet에서 처리하도록 만들기.

## v3
1. 서블릿 종속성 제거 -> model 사용
2. 뷰 이름 중복 제거
3. viewResolver를 통한 view 반환

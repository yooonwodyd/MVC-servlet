## 스프링의 MVC 구현

스프링 MVC 구조를 이해하기 위해 직접 MVC를 만들어보는 테스트 프로젝트입니다.


## 개발 환경

* Intellij IDEA Ultimate
* Java 11
* Spring Boot 2.x.x

##  v0

1. webservlet 에서 ObjectMapper를 이용해 messageBody의 json 데이터를 처리하기 + response로 처리한 데이터 전송하기

2. 1번의 기능을 발전시켜 PrintWriter을 이용해 클래스 내부에서 html 처리하기

3. RequestDistpatcher를 이용해서 원하는 viewPath로 이동하기 이때 viewPathsms jsp로 구현

## v1

1. 단일 webservlet에서 여러 url을 알맞은 controller로 전송하기

## v2

1. v1을 발전시켜, dispatcher로 view 주소를 넣는 과정을 webservlet에서 처리하도록 만들기.

## v3
1. 서블릿 종속성 제거
FrontController가 가지고 있는 request의 데이터를 Map에 저장하고 해당 map을 controller로 전달했음.
 
2. 뷰 이름 중복 제거
controller는 ModelView라는 클래스 타입으로 객체를 반환, 해당 객체를 통해 데이터를 전달하고 뷰 이름 중복을 제거한다.
3. viewResolver를 통한 view 반환


## v4
컨트롤러 구현시에 ModelView를 사용하지 않고 view의 이름만 반환하도록 하는 것이 목표.
이를 위해 controller에게 model 객체를 파라미터로 전달해서 사용하고, return 할때는 view의 이름만 반환하도록 함.


## v5
핸들러 어댑터 추가.

FrontController에서 핸들러와 이에 맞는 핸들러어댑터를 찾은 다음, 핸들러 어댑터에게 핸들러를 처리해서 ModelView라는 객체로 반환하도록 함.

v5에서는 v4와 v3의 컨트롤러(핸들러)를 모두 사용 가능함.
 

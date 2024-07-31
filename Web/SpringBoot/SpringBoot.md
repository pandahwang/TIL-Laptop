# SpringBoot  
SpringBoot가 제공하는 WelcomePage 기능 :  
resource/static/index.html 을 올려두면 Welcome Page 기능을 제공함.  

## Test  
테스트 코드. 실제 코드에는 반영되지 않음.  
`given`, `when`, `then` 문법으로 나누어 작성하면 가독성이 올라감.  
given : 선언부  
when : 실행부  
then : 검증부  

## ThymeLeaf fragment
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
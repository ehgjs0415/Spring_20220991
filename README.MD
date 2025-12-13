<div align="center">

# 🧪 Spring Boot (자바웹프로그래밍2) 학습 로그
자바웹프로그래밍(2) 수업/스프링 부트 실습 진행 내역을 주차별로 정리한 리포지토리입니다. 이 주소는 일부러 코드 정리하지 않았고, 공부한 내용과 흔적을 보여드리기 위해 주석 정리 또한 하지 않았습니다.
(깃허브 주소 : https://github.com/ehgjs0415/Spring_20220991)
(포트폴리오 깃허브 주소 : https://github.com/ehgjs0415/portfolio_web_20220991)

![Status](https://img.shields.io/badge/Progress-Week%2015-blue)
![Build](https://img.shields.io/badge/Spring%20Boot-practice-green)
![Last%20Update](https://img.shields.io/badge/Updated-2025.12.13-success)

</div>

---

## 📅 진행 요약

| 주차  | 상태              | 주요 주제 / 키워드                              | 비고 |
|-------|-------------------|-----------------------------------------------|------|
| 1주차 | ✅ 완료           | 스프링 부트 개발환경 세팅, `index.html` 실행/수정 | 테스트 환경 구축 완료 |
| 2주차 | ✅ 완료 (09/14)          | URL 매핑, 컨트롤러 추가, 5개 속성변수 출력        | 매핑 & 컨트롤러 동작 확인 |
| 3주차 | ✅ 완료 (09/22)         | 상세 페이지 수정, 되돌아가기 버튼 동작 수정        | JS(`main.js`)로 창 문제 해결 |
| 4주차 | ✅ 완료 (09/28)   | DB `INSERT` 동작 확인                           | 초기엔 INSERT 미동작 → 해결 |
| 5주차 | ✅ 완료 (10/21)   | 실습 과제 마무리                                | 진행 중이던 문제 해결 |
| 6주차 | ✅ 해결 (10/21)   | 난이도 높은 실습 → 도움 받아 해결               | 더 복습 필요하다고 느낌 |
| 10주차 | ✅ 해결 (11/09)   | 난이도가 꽤 있었음, 그래도 해결함            | 글 목록까지 구현 완료, 수정, 삭제까지 구현 |
| 11주차 | ✅ 해결 (11/18)   | 1번째 글 번호는 어려웠음(도움을 받음), 2번째는 전주차(10주차실습문제)에서 해결           | 글 번호 구현, 삭제 구현 |
| 12주차 | ✅ 해결 (11/24)   | 힌트가 많아서 실습문제 해결함(입력값 필터링)         | 중복된 비밀번호 및 나이 제한 구현 완료 |
| 13주차 | ✅ 해결 (12/02)   | 로그인한 사용자로부터 게시판 수정 및 삭제 가능, 어려운 실습문제         | 로그인 후 글을 작성 완료 이후 수정 및 삭제 구현 |
| 14주차 | ✅ 해결 (12/13)   | 너무 어려운 실습 문제, 해결이 된 건지는 의문임. 자세한건 14주차 상세 로그에서 확인 가능       | 2명 이상 로그인 되도록 수정, 동일 파일 업로드시 오류 및 다른 이름으로 업로드 |

---
## 업로드 스크린샷
![업로드 스크린샷 - 12/13일 기준](src/main/resources/Static/homework/15week-1.png)

---

## 🎥 시연 영상
- Google Drive: https://drive.google.com/file/d/140ndaeF-yC1QMnDrnRxSdm3RVtwUNR8p/view?usp=sharing
- 시연 영상을 준비 한 이유 : Spring Boot 기반 웹 애플리케이션으로, 로컬/서버 환경에서 실행될 때 Controller, Session, DB, Validation 등이 동작하는 동적(Dynamic) 웹입니다. 하지만 GitHub Pages는 정적(Static) 사이트 호스팅만 지원하므로, 서버가 필요한 기능은 GitHub Pages에서 동작하지 않습니다. 깃허브 페이지에서는 기존 소스코드를 올리면 무시하거나, 404에러페이지를 보내 원할하게 페이지를 구성할 수 없습니다. 그러므로 동영상 시연 영상을 준비하였고, 깃허브 페이지는 최대한 구현을 해보도록 노력하였으나 한계점이 있기에 페이지 이동만 구현을 하게되었습니다. 2배속해서 보시는 것을 추천드립니다. 교수님의 시간은 소중하니까요...

---

# 📘 주차별 상세 로그

### 1주차
**상태:** 완료  
**내용:**  
- 스프링 부트 개발환경 세팅 및 테스트 완료  
- `index.html` 실행 / 수정까지 완료  
- 관련 저장소: https://github.com/ehgjs0415/Spring_20220991

---
### 2주차
**상태:** 완료  (09/14)
**내용:**  
- 09/14 실습 과제 완료
- URL 매핑과 컨트롤러 추가 실습 완료
- 맵핑 추가 / 5개 속성변수 추가 및 출력 확인

### 1. 기존 hello.html 링크 수정

- 링크 : 두번째 헬로 페이지
- url 맵핑 : /hello2

        <!DOCTYPE html>
        <html xmlns:th="http://www.thymeleaf.org">
        <head>
                <meta charset="UTF-8">
                <title>Hello 페이지</title>
        </head>
        <body>
                <h1>안녕하세요!</h1>
                <p th:text="${data}"></p>
                <a href="/hello2">두번째 헬로 페이지</a>
        </body>
        </html>
- 과제 해결 스크린 샷

![2주차-헬로 페이지 수정](src/main/resources/Static/homework/2week-1.png)

### 2. 컨트롤러에 맵핑 추가

- hello2 메서드를 작성한다.
- 5개의 속성을 각자 추가한다.

        @GetMapping("/hello2") // 전송 방식 GET + 새로운 매핑 추가
        public String hello2(Model model) {
                model.addAttribute("data1", " 송도헌님."); // model 설정
                model.addAttribute("data2", " 반갑습니다."); // model 설정
                model.addAttribute("data3", " 오늘."); // model 설정
                model.addAttribute("data5", " 날씨는."); // model 설정
                model.addAttribute("data6", " 매우 좋습니다."); // model 설정
                return "hello2"; // hello2.html 연결
        }
### 3. hello2.html 작성

- 5개 속성 변수를 출력한다.

![2주차-헬로2 페이지 작성](src/main/resources/Static/homework/2week-2.png)


---

### 3주차
**상태:** 완료  (09/22)
**내용:**  
- 09/22 실습 과제 완료
- 상세 페이지 수정 실습 완료  
- "되돌아가기" 버튼을 눌렀을 때 창이 안 닫히던 문제 발생  
- `resources/js/main.js` 에서 JS 수정으로 문제 해결 (되돌아가기 정상 작동)

### 1. about_detailed.html을 수정한다.
- 수정 및 Font Awesome 아이콘도 수정하였음.

![3주차-상세 페이지 작성](src/main/resources/Static/homework/3week-1.png)

### 2. 되돌아가기 버튼 수정 (창을 닫을 예정인지)

- 버튼을 클릭하면 현재 창을 닫는다.
- 창을 닫을지 물어본다.
- main.js 파일에 confirmClose() 함수를 추가

        // 3주차 실습과제(창을 닫기)
        function confirmClose(){
                if (window.confirm('정말 창을 닫으시겠습니까?')) {
                        window.close(); // 확인 누르면 창을 닫음
                }
        }

        document.getElementById("return_btn").addEventListener('click', confirmClose);
- 아래는 과제 해결 스크린 샷
![3주차-상세 페이지 작성](src/main/resources/Static/homework/3week-2.png)
---
### 4주차
**상태:** 완료  (09/28)
**내용:**  
- 9/28 실습 과제 완료  
- DB에 `INSERT`가 되어야 하는데 실제로 값이 안 들어가는 문제 확인  
- DB에 값 삽입 후 애플리케이션 다시 실행(run) → INSERT 정상 동작 확인

### 1. VS CODE의 MYSQL 확장 활용 : 2명의 사용자를 db에서 직접 추가한다.
- INSERT 문을 활용 : 스크린샷은 확장에서 SELECT 한 결과
![4주차-데이터베이스 값 넣기](src/main/resources/Static/homework/4week-1.png)

### 2. 컨트롤러를 부분 수정한다 -> 사용자2, 3을 모델에 추가한다.
- DemoController.java 中 

        @GetMapping("/testdb")  // 4주차 실습문제 해결
        public String getAllTestDBs(Model model) {
                TestDB test = testService.findByName("홍길동");
                TestDB test1 = testService.findByName("아저씨");
                TestDB test2 = testService.findByName("꾸러기");
                model.addAttribute("data4", test);
                model.addAttribute("data5", test1);
                model.addAttribute("data6", test2);
                System.out.println("데이터 출력 디버그 : " + test);
                System.out.println("데이터 출력 디버그 : " + test1);
                System.out.println("데이터 출력 디버그 : " + test2);
                return "testdb";
        }

### 3. 뷰를 수정 : testdb.html에서 직접 출력한다.
![4주차-testdb 출력](src/main/resources/Static/homework/4week-2.png)

---
### 5주차
**상태:** 해결 (10/21)  
**내용:**  
- 실습 과제 진행 중이던 부분 처리  
- 10/21 기준으로 문제 해결 완료

### 문제 요구 사항
- 현재 게시판 글쓰기를 수정한다.
- 글쓰기 이후 전체 목록 화면으로 자동 전환한다.
- 글쓰기는 반드시 RestController 방식인가? no
- 기존 @RestController 방식을 @Controller 방식으로 수정
- 기존 소스코드를 전체를 재활용한다.
- 기존 RestController는 주석처리
- BlogController.java에 맵핑을 추가한다.
- 기본 구조는 동일
- 참고 (리턴 타입은 String)
- 리턴 : return "redirect:/article_list";

- BlogController.java 中

        @PostMapping("/api/articles") // post 요청 --> 5주차 실습과제 해결(주석처리하겠습니다.)
        public String addArticle(@ModelAttribute AddArticleRequest request) {
                blogService.save(request); // 게시글 저장
                return "redirect:/article_list"; 
        }


---
### 6주차
**상태:** 해결 (10/21)
**내용:**  
- 난이도 높은 실습 과제
- 10/21 실습 과제 해결
- 혼자서는 이해가 어려워 ChatGPT 도움 받아 해결 (10/21)  
- 현재 동작은 가능하지만 로직은 더 공부 예정

### 수정 페이지 – 에러 페이지 확인

- 새로운 GlobalControllerAdvice.java 생성

        //화면용(@Controller) 컨트롤러에서 발생하는 공통 예외 처리
        //기존 BlogController 코드는 수정하지 않음.
        //6주차 실습과제 해결
        @ControllerAdvice(annotations = Controller.class)
        public class GlobalControllerAdvice {

                /article_edit/6444fff 처럼 Long 변환 실패 → 400으로 보고 에러 페이지 렌더
                @ResponseStatus(HttpStatus.BAD_REQUEST)
                @ExceptionHandler(MethodArgumentTypeMismatchException.class)
                public String handleTypeMismatch(MethodArgumentTypeMismatchException ex, Model model) {
                        // 필요시 화면 메시지 추가 가능
                        // model.addAttribute("title", "블로그 게시판 - 잘못된 접근(문자열 변환 에러)");
                        return "/error_page/article_error";   // 프로젝트의 에러 뷰 이름 그대로
                }
        }

- 아래는 에러페이지 스크린샷
![6주차-에러페이지 출력](src/main/resources/Static/homework/6week-1.png)

---

### 10주차
**상태:** 해결 (11/09)
**내용:**  
- 난이도 높은 실습 과제
- 11월 9일 해결
- Article과 Board의 곂침으로 인해서 처음부터 수정 및 추가를 진행하였음
- 수정, 삭제, 글 목록까지 모두 해결 완료
- Board_list -> Board_view -> Board_edit 순서로 행해지고, Board_edit에서 수정 후 Board_list로 이동까지 구현 완료

### 1.  게시판 글 수정하기 구현하기 (board_list.html 연결)
- 아래는 board_list.html 연결한 스크린샷이다.
![10주차-Board_list 뷰 연결](src/main/resources/Static/homework/10week-1.png)

### 2. 글 수정 화면 만들기 (board_view.html 연결)
- 아래는 board_view.html 연결한 스크린샷이다.
![10주차-Board_view 뷰 연결](src/main/resources/Static/homework/10week-2.png)

### 3. 글 수정을 위해 서비스 로직을 수정한다.

- AddBoardRequest.java 생성 및 BlogService.java를 수정
- BlogService.java 中

        public void update(Long id, AddBoardRequest request) {
                Optional<Board> optionalBoard = blogRepository2.findById(id); // 단일 글 조회
                optionalBoard.ifPresent(Board -> { // 값이 있으면
                        Board.update(request.getTitle(), request.getContent(), Board.getUser(), Board.getNewdate(), Board.getCount(), Board.getLikec()); // 값을 수정
                        blogRepository2.save(Board);
                });
        }

- 그 이후 board_edit.html 연결
- 아래는 board_edit.html 연결한 스크린샷이다.
![10주차-Board_edit 뷰 연결](src/main/resources/Static/homework/10week-3.png)

### 4. 글 수정 확인 (board_list.html로 연결)
- 글 수정이후 board_list.html로 연결한 스크린샷이다.
![10주차-Board_list 뷰 연결](src/main/resources/Static/homework/10week-4.png)

### 자세한 사항은 소스코드를 확인하시면 보실 수 있습니다. (글쓰기/수정/삭제)

---

### 11주차
**상태:** 해결 (11/18)
**내용:**  
- 난이도 높은 실습 과제 (1번째 글 목록), 2번째 실습문제(삭제)는 전주차 10주차에서 해결
- 11월 18일 해결
- 글 번호와 글 삭제를 수행하였고, 특히 글 번호는 도움을 받아 해결함


### 1. 게시글 순차 번호 출력을 위한 시작 번호 계산 및 Model에 추가 (추가/수정 부분) -> 11주차 과제
- BlogController.java 소스 코드 中

        int pageSize = 5; // 한 페이지당 게시글 수
        int startNum = (page * pageSize) + 1; 
        model.addAttribute("startNum", startNum); // startNum을 모델에 추가


### 2. 게시글 번호를 구현 하기 위해서 상태 변수 stat 추가 후 글 번호 계산해서 출력
- 글 목록 번호 중 Board_list.html 소스 코드 中

        <tr th:each="board, stat : ${boards}">
        <td th:text="${startNum + stat.index}"></td>

### 3. 글 번호 출력 확인
- 글 번호 확인 스크린샷이다.
![11주차-Board_list 번호 확인](src/main/resources/Static/homework/11week-1.png)

### 4. 글 삭제 확인
- 글 삭제 확인 스크린샷이다.
![11주차-Board_edit 삭제 확인](src/main/resources/Static/homework/11week-2.png)


---

### 12주차
**상태:** 해결 (11/24)
**내용:**  
- 실습 과제(입력 필터링) 해결, 비밀번호 중복(123123123)과 나이 제한(100이상) 해결 완료, 정상적으로 회원가입(대문자,소문자 비밀번호 + 나이 100세 미만 일때 -> join_end 화면 정상출력)
- 11월 24일 해결
- Whitelabel이 떠서 ai에게 물어보았는데 잘 작동하고 있다고 전달 받음

### Validation 모듈을 추가하여 검증
- Porn.xml 소스 코드 中

        <dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>


### 입력값 필터링을 위해서 Validation 모듈 추가 및 @어노테이션 추가 (추가/수정 부분) -> 12주차 과제
- AddMemberRequest.java 소스 코드 中

        // 이름: 공백 x, 특수문자 x
        @NotBlank(message = "이름은 필수 입력 값입니다.")
        @Pattern(
                regexp = "^[가-힣a-zA-Z0-9]+$",
                message = "이름에는 공백이나 특수문자를 포함할 수 없습니다."
        )
        private String name;

        // 이메일: 공백 x, 이메일 형식
        @NotBlank(message = "이메일은 필수 입력 값입니다.")
        @Email(message = "이메일 형식이 올바르지 않습니다.")
        private String email;

        // 패스워드: 패턴 ○ (8글자 이상, 대소문자 포함)
        @NotBlank(message = "패스워드는 필수 입력 값입니다.")
        @Pattern(
                regexp = "^(?=.*[a-z])(?=.*[A-Z]).{8,}$",
                message = "패스워드는 8자 이상이며 대문자와 소문자를 모두 포함해야 합니다."
        )
        private String password;

        // 나이: 패턴 ○, 19이상 ~ 90세 이하 (문자열로 받으니 정규식으로 체크)
        @NotBlank(message = "나이는 필수 입력 값입니다.")
        @Pattern(
                regexp = "^(1[9]|[2-8][0-9]|90)$",
                message = "나이는 19세 이상 90세 이하의 숫자만 입력할 수 있습니다."
        )
        private String age;

### 서비스에 @Valid 붙여서 내부 검증 동작하게 만들기
- MemberService.html 소스 코드 中

        public Member saveMember(@Valid AddMemberRequest request){
                validateDuplicateMember(request); // 이메일 체크

                String encodedPassword = passwordEncoder.encode(request.getPassword());
                request.setPassword(encodedPassword); // 암호화된 비밀번호 설정
                return memberRepository.save(request.toEntity());
        }

### 컨트롤러에 @Valid 붙여서 내부 검증 동작하게 만들기
- MemberController.html 소스 코드 中

        @PostMapping("/api/members") // 12주차 실습 문제 회원 가입 저장
        public String addmembers(@Valid @ModelAttribute AddMemberRequest request) {
                memberService.saveMember(request);
                return "join_end"; // .HTML 연결
        }
### 실습 이후 스크린샷 (whitelabel 화면)
- 회원가입 검증 오류 스크린샷이다. 정상적으로 검증하고 있다는 것을 볼 수 있다.(따로 에러페이지는 만들지 않았음. whitelabel이 나오는게 정상)
![12주차-회원가입 오류 확인](src/main/resources/Static/homework/12week-1.png)

---

### 13주차
**상태:** 해결 (12/02)
**내용:**  
- 실습 과제 : 로그인한 사용자로 글의 작성자를 저장한다 / 글의 작성자만 수정/삭제 버튼을 보여준다 -> 해결
- 12월 2일 해결
- 나에게는 난이도가 요구되는 문제였음. user값을 받아오는 건 되었는데 예외처리가 어려웠음(if구문 등) -> 도움을 받아서 해결

### 1. 글 작성 시 “작성자 = 로그인 사용자” 로 저장하기
- BlogController.addboards() 수정

- 현재 코드 (마지막 부분):
        
        // 글쓰기 게시판
        @GetMapping("/board_write")
                public String board_write() {
                return "board_write";
        }

        @PostMapping("/api/boards") // 글쓰기 게시판 저장
                public String addboards(@ModelAttribute AddBoardRequest request) {
                blogService.save(request);
                return "redirect:/board_list"; // .HTML 연결
        }

- 아래 수정 코드 (로그인한 사용자의 email을 작성자로 저장)

        // 글쓰기 게시판
        @GetMapping("/board_write")
                public String board_write() {
                return "board_write";
        }

        @PostMapping("/api/boards") // 글쓰기 게시판 저장
                public String addboards(@ModelAttribute AddBoardRequest request, HttpSession session) {

                // 세션에서 로그인한 사용자의 이메일 꺼내기
                String email = (String) session.getAttribute("email");

                // 로그인 정보가 없으면 로그인 페이지로 보냄
                if (email == null) {
                        return "redirect:/member_login";
                }

                // 현재 로그인한 사용자로 작성자를 덮어쓰기
                request.setUser(email);

                blogService.save(request);
                return "redirect:/board_list"; // .HTML 연결
        }

### 2. 작성자에게만 수정/삭제 버튼 보이게 하기
- BlogController.board_view() 에 로그인 사용자 전달

- 현재 코드:
        
        @GetMapping("/board_view/{id}") // 게시판 링크 지정
        public String board_view(Model model, @PathVariable Long id) {
                Optional<Board> list = blogService.findById(id); // 선택한 게시판 글

                if (list.isPresent()) {
                        model.addAttribute("boards", list.get()); // 존재할 경우 실제 Board 객체를 모델에 추가
                } else {
                        // 처리할 로직 추가 (예: 오류 페이지로 리다이렉트, 예외 처리 등)
                        return "/error_page/article_error"; // 오류 처리 페이지로 연결
                }
                return "board_view"; // .HTML 연결
        }
- 수정 코드:

        @GetMapping("/board_view/{id}") // 게시판 링크 지정
        public String board_view(Model model, @PathVariable Long id, HttpSession session) {
                Optional<Board> list = blogService.findById(id); // 선택한 게시판 글

                if (list.isPresent()) {
                        Board board = list.get();
                        model.addAttribute("boards", board); // 선택한 게시글

                        // 로그인한 사용자의 이메일을 모델에 추가
                        String email = (String) session.getAttribute("email");
                        model.addAttribute("email", email);
                } else {
                        return "/error_page/article_error"; // 오류 처리 페이지로 연결
                }
                return "board_view"; // .HTML 연결
        }

### 3. board_view.html 에 조건 걸어서 버튼 숨기기
- board_view.html 아래쪽 부분

        <tr th:each="board : ${boards}">
                <td>
                        <!-- 수정 버튼 -->
                        <a class="btn btn-warning" th:href="@{/board_edit/{id}(id=${board.id})}">수정</a>
                        <!-- 삭제 버튼 -->
                        <form th:action="@{/api/board_delete/{id}(id=${board.id})}" method="post" style="display:inline;">
                                <input type="hidden" name="_method" value="delete">
                                <button type="submit" class="btn btn-danger">삭제</button>
                        </form>
                </td>
        </tr>

- 수정 코드(작성자와 로그인 이메일이 같을 때만 버튼 노출):

        <tr th:each="board : ${boards}">
                <td>
                    <div th:if="${board.user == email}"> <!--13주차 연습문제 : 로그인한 사용자로 글의 작성자 수정 권한 부여-->
                        <!-- 수정 버튼 -->
                        <a class="btn btn-warning" th:href="@{/board_edit/{id}(id=${board.id})}">수정</a>
                        <!-- 삭제 버튼 -->
                        <form th:action="@{/api/board_delete/{id}(id=${board.id})}" method="post" style="display:inline;">
                            <input type="hidden" name="_method" value="delete">
                            <button type="submit" class="btn btn-danger">삭제</button>
                        </form>
                    </div>
                </td>
        </tr>

### 4. 실습 성공 스크린샷
- 로그인 이후 글 수정 및 삭제 페이지 스크린샷 (작성자는 로그인된 계정으로 등록이 되어있음)
![13주차-글 작성자 확인](src/main/resources/Static/homework/13week-1.png)

- 다른 사용자가 다른 계정이 작성한 글을 볼 때 수정 / 삭제 버튼이 보이지 않음
![13주차-다른 사용자 글 게시물 확인](src/main/resources/Static/homework/13week-2.png)


-------

### 14주차
**상태:** 해결 (12/13)
**내용:**  
- 실습 과제 : 단일 사용자만 처리 가능했음 -> 다중 사용자로 변경하기 / 파일 업로드 문제 : 동일 파일 업로드 하면 다른 파일 이름으로 업로드
- 12월 13일 해결
- 너무 어려운 실습과제였고, 정확히 요구하는 사항을 이해하지 못했음. 인공지능의 도움을 받았음.(너무 어려워요...)
- 이해하지 못한 부분 : 같은 브라우저 내에서 사용자 2명(즉 계정이 두개가 로그인 되어야하는지) , 아니면 다른 브라우저 내에서 사용자 1명이 다중 로그인 되어야하는지(예시를 들면 크롬 일반 창과 시크릿 창 : 세션이 따로 생성됨 -> 한쪽이 로그아웃해도 다른 브라우저 내에선 로그아웃 되지 않게끔 형성) 이해가 되질 않았음.
- 그래서 인공지능을 사용하여 해결을 하였고, 인공지능에서 물어본 결과 같은 브라우저 내 로그인은 쿠키 값이 1개 생성되어있기에 할 수 없다는 결론을 들었음. 하지만 이게 맞는 건지 잘 모르겠음. 추가적으로 공부를 해야할 것 같음.



### 1.  세션 처리(다중 사용자 로그인/로그아웃)

목표
- 사용자마다 다른 세션으로 로그인 유지  
- 로그아웃 시 **현재 사용자 세션/쿠키만 삭제**

MemberController.java 中 -> 로그인 체크 로직 수정 전
        
        @PostMapping("/api/login_check") // 로그인(아이디, 패스워드) 체크
        public String checkMembers(@ModelAttribute AddMemberRequest request, Model model, HttpServletRequest request2, HttpServletResponse response) {
                try {
                HttpSession session = request2.getSession(false); // 기존 세션 가져오기(존재하지 않으면 null 반환)
                if (session != null) {
                        session.invalidate(); // 기존 세션 무효화
                        Cookie cookie = new Cookie("JSESSIONID", null); // JSESSIONID 초기화
                        cookie.setPath("/"); // 쿠키 경로
                        cookie.setMaxAge(0); // 쿠키 삭제(0으로 설정)
                        response.addCookie(cookie); // 응답으로 쿠키 전달
                }
                session = request2.getSession(true); // 새로운 세션 생성

                Member member = memberService.loginCheck(request.getEmail(), request.getPassword()); // 패스워드 반환
                String sessionId = UUID.randomUUID().toString(); // 임의의 고유 ID로 세션 생성
                String email = request.getEmail(); // 이메일 얻기

                session.setAttribute("userId", sessionId); // 아이디 이름 설정
                session.setAttribute("email", email); // 이메일 설정

                model.addAttribute("member", member); // 로그인 성공 시 회원 정보 전달
                return "redirect:/board_list"; // 로그인 성공 후 이동할 페이지
                } catch (IllegalArgumentException e) {
                model.addAttribute("error", e.getMessage()); // 에러 메시지 전달
                return "login"; // 로그인 실패 시 로그인 페이지로 리다이렉트
                }
        }

MemberController.java 中 -> 로그인 체크 로직 수정 후

        @PostMapping("/api/login_check")
        public String checkMembers(@ModelAttribute AddMemberRequest request,
                Model model,
                HttpServletRequest request2,
                HttpServletResponse response) {
        try {
            // 1) 아이디/비번 검증
            Member member = memberService.loginCheck(request.getEmail(), request.getPassword());

            // 2) 세션 생성(없으면 생성)
            HttpSession session = request2.getSession(true);

            // 3) 사용자별 세션 값 저장
            String sessionId = UUID.randomUUID().toString();
            String email = request.getEmail();

            session.setAttribute("userId", sessionId);
            session.setAttribute("email", email);

            model.addAttribute("member", member);
            return "redirect:/board_list";

        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
            return "login";
        }
    }

SecurityConfig.java 中 -> 동시 세션 수 증가

        .maximumSessions(2) // 사용자 별 세션 최대 수 : 14주차 실습과제 세션 최대 수 1 -> 2 로 수정


### 확인 방법(테스트)
1) 크롬 일반 창 계정 A 로그인  
2) 크롬 시크릿 창 계정 B 로그인  
3) DevTools → Application → Cookies에서 각 창의 `JSESSIONID` 값 비교  
   - 일반창과 시크릿창의 `JSESSIONID`가 서로 다름
4) 일반창에서 로그아웃해도 시크릿창은 로그인 유지 확인  
   - 로그아웃이 **현재 사용자에게만 적용**됨을 확인

> 참고: 같은 “일반 크롬 프로필”의 탭/창은 쿠키를 공유하므로 JSESSIONID도 동일해질 수 있음.


### 2. 동일 파일 업로드 시 다른 이름으로 파일 업로드

FileController.java 中 ->  동일 파일 명 있으면 +i 해서 새로 생성

        // 14주차 실습 과제 동일 파일명 있으면 다른 이름으로 새로 생성
            int i = 1;
            while (Files.exists(filePath)) {
                filePath = uploadPath.resolve(sanitizedEmail + "_" + i + ".txt");
                i++;
            }

예외 발생 시 에러 페이지로 이동

        catch (IOException e) {
            return "/error_page/article_error";
        }

### 3. 실습 결과 화면
- 다중 사용자 화면 (JSESSIONID 값이 서로 다름을 확인)
![14주차-JSESSIONID 값이 다름을 확인](src/main/resources/Static/homework/14week-1.png)

- 파일 업로드 시 파일 제목이 같을 경우 다르게 업로드

![14주차-동일 제목의 파일 업로드시 파일 제목 다르게 하기 확인](src/main/resources/Static/homework/14week-2.png)

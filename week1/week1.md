## 1주차
자바프로그래밍 기초
- 기초 문법에 대해 공부 : Hello world출력, 개발환경 구축
- 변수, 연산자, 수식을 다루는 간단한 예제 풀기

### 개념정리
**1) 자바 개발 환경**
- JRE(Java Runtime Environment) : 자바 실행 환경, JVM
- JDK(Java Development Kit) : 자바 언어를 이용하여 프로그램을 개발하기 위한 최소한의 환경
- Java IDE(integrated development environment) : 프로그램 개발에 필요한 컴파일러, 디버거, 링커, 에디터 등을 통합적으로 제공하는 개발 환경

**2) 기초 문법 - Hello world 출력**
- Class <br>
 -> 자바 프로그램은 적어도 하나의 클래스를 포함 <br>
 -> 자바 프로그램의 기본 단위 <br>
 -> 필드와 메소드로 구성 <br>
 -> 관례상 클래스명의 첫 글자는 대문자 <br>
- main method <br>
 -> CPU 는 main()메소드 내부의 코드를 실행 <br>
- Statement : 프로그램 명령의 기본 단위, 모든 문장은 ;로 끝남 
- Blocks{} : 명령어들을 그룹화시켜줌 
- "" : 문자열을 의미 
- 주석 : 컴파일러가 무시하는 문장 , //, /* */ 
- 들여쓰기 : 클래스 정의에서 필드나 메소드의 첫 글자는 탭만큼 들여 쓰는 방식

**3) 변수, 자료형, 식별자**
- 변수 : 데이터값들이 저장되는 메모리 공간 <br>
 -> 프로그램 실행 도중 저장된 값의 변경 가능<br>
- 자료형 : 자료의 타입 <br>
 -> 기초형 : 변수의 저장 공간에 값 자체가 저장 <br>
 -> 참조형 : 변수의 저장 공간에 참조 값이 저장 <br>
 - 변수의 선언과 초기화 <br>
   예) int index, total = 0 <br>
        |    |        | <br>
     자료형  이름     초기화 <br>
- 식별자 : Class, Variable, Method 등의 이름 <br>
 -> 대소문자 알파벳, 숫자, 밑줄_, $ 로 구성 <br>
 -> 키워드 X (키워드 : 프로그래밍 언어에서 문법적으로 의미 있는 단어로 사용하기 위해 미리 정의해 놓은 단어) <br>
 -> 첫 문자 숫자 X <br>
 -> 대소문자 구별 <br>
 -> 한글 O <br>
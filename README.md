# JavaProject
자바프로그래밍을 이용하여 CRUD 기능을 구현한 영단어 마스터 프로그램

Word class (데이터 클래스)
- 영어단어 데이터를 다루는 위함
  
CRUD interface (CRUD를 위한 interface)
- CRUD의 기본적인 함수의 이름을 템플릿으로 정하기 위함

WordCRUD class (ICRUD interface 구현체)
- ICRUD를 구현한 단어를 다루는 CRUD 구현체

WordManager class (wordCRUD를 사용한 실제 관리)
- wordCRUD룰 이용해서 전체 프로그램을 관리하기 위함
  
Main class (static main 함수, starter class) 
  자바프로젝트를 살행하기 위하여 wordManager를 호출함
  
-----------------------------------
<영단어 마스터 프로그램 기능 소개> 
1. [단어 추가] - 새로운 단어를 가하는 기능
   
실행 예) 

=> 난이도(1,2,3) & 새 단어 입력 : 1 tree 

뜻 입력 : 나무 

새단어가 단어장에 추가되었습니다.

-----------------------------------
3. [단어 목록] - 등록된 단어를 보여주는 기능'
실행 예)

1 *** superintendent  관리자, 감독관
   
2 *         electric  전기의, 전기를 생산하는 

3 **       equipment  장비, 용품

4 *             pole  기둥, 장대 

5 *         formerly  이전에, 예전에 
 
6 *            apple  사과 

7 **            kiwi  키위 

 -----------------------------------

4. [나가기] - 영단어 마스터 프로그램을 종료하는 기능 
실행 예) 
프로그램 종료! 다음에 또 만나요~ 
----------------------------------- 
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
 

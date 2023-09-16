# JavaProject
자바프로그래밍을 이용하여 CRUD 기능을 구현한 영단어 마스터 프로그램


<영단어 마스터 프로그램 구성>

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
1. [모든 단어 보기] - Dictionary.txt 파일에 저장되어 있는 단어를 화면에 출력하는 기능
   
<img width="552" alt="no1" src="https://github.com/DDaengoo/JavaProject/assets/143365358/2a328b52-775e-4435-a7d8-a3a8b4ccb6a9">


-----------------------------------
2. [수준별 단어 보기] - 사용자가 원하는 수준(1~3)의 단어 목록을 출력하는 기능  
   
<img width="469" alt="no2" src="https://github.com/DDaengoo/JavaProject/assets/143365358/a95b4963-ffb4-4078-add4-5e3d59a1d50d">


-----------------------------------
3. [단어 목록] - 등록된 단어를 보여주는 기능

실행 예)

영단어 "2 |  property |  재산, 부동산" 추가 전

<img width="325" alt="스크린샷 2023-09-08 10 58 33" src="https://github.com/DDaengoo/JavaProject/assets/143365358/1348c8dc-5d74-4fb5-907a-0cd1fe56e2cd">

영단어 "2 |  property | 재산, 부동산" 추가 후

<img width="336" alt="스크린샷 2023-09-08 10 58 02" src="https://github.com/DDaengoo/JavaProject/assets/143365358/49399216-edcf-4f47-a3a2-69842c9527e6">

 -----------------------------------
4. [단어 추가] - 새로운 단어를 추가하는 기능

단어 1|juice|음료 추가 전
   
<img width="430" alt="no4" src="https://github.com/DDaengoo/JavaProject/assets/143365358/8a696857-4ad7-406a-b04e-44fb5eaab7de">

단어 1|juice|음료 추가 후

<img width="384" alt="no4-2" src="https://github.com/DDaengoo/JavaProject/assets/143365358/59944274-20d6-4db1-871e-316bab36b296">


------------------------------------
5. [단어 수정] - 현재 저장되어 있는 단어의 뜻을 수정하는 기능
   
<img width="551" alt="no5" src="https://github.com/DDaengoo/JavaProject/assets/143365358/901b2c92-0b81-49fc-bee6-645bf7de66e8">



------------------------------------
6. [단어 삭제] - 현재 저장되어 있는 단어를 Dictionaty.txt파일에서 삭제하는 기능

단어 3|family|가족 삭제 전
   
<img width="446" alt="no6" src="https://github.com/DDaengoo/JavaProject/assets/143365358/270f8ca5-1201-4afe-95d3-0015ab46dee9">

단어 3|family|가족 삭제 후

<img width="488" alt="no6-2" src="https://github.com/DDaengoo/JavaProject/assets/143365358/d2d694b6-c5e5-4354-a623-4674609f2866">


------------------------------------
7. [단어 저장] - 사용자가 사용하여 변경된 사항을 Dictionaty.txt파일에 저장하는 기능
   
<img width="383" alt="no7" src="https://github.com/DDaengoo/JavaProject/assets/143365358/9b5dce50-b374-4929-9d94-ce68958e60d5">

프로그램 재실행 후

<img width="474" alt="no7-2" src="https://github.com/DDaengoo/JavaProject/assets/143365358/8e067328-2d5e-4041-b259-e7a255e49f33">


------------------------------------
0. [나가기] - 영단어 마스터 프로그램을 종료하는 기능
    
실행 예) 

<img width="304" alt="스크린샷 2023-09-08 10 55 53" src="https://github.com/DDaengoo/JavaProject/assets/143365358/49d4b3ee-4659-4d64-8bfc-20b591c59451">

----------------------------------- 
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
 

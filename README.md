![메인](https://github.com/user-attachments/assets/bb7d375b-15dc-418f-84c9-6f08f46aacfc)

# JSP&SERVLET 개인 프로젝트 모던하우스(Modern House)
***
## 목차
+ [개요](#chapter1)
+ [기술 스택](#chapter2)
+ [프로젝트 설계](#chapter3)
+ [핵심 기능](#chapter4)
+ [주요기능 실행 화면](#chapter5)
+ [개선사항](#chapter6)
***
## 1. 개요 <a id="chapter1"></a>
+ 프로젝트 목표: JSP&SERVLET 기반 간단한 회원관리, 게시판 기능이 있는 쇼핑몰 웹사이트 제작
+ 개발 기간 : 24/09/27 - 24/10/18
***
## 2. 기술 스택 <a id="chapter2"></a>
+ Language : Java(11), JavaScript(1.5)
+ Library & Framework : Servlet(4.0)
+ Database : MySql
+ Target: Web browser
+ Tool : Eclipse IDE(4.29.0)
+ ETC : Git
***
## 3. 프로젝트 설계 <a id="chapter3"></a>
+ Entity Relationship Diagram
  ![erd](https://github.com/user-attachments/assets/ad7e8ea4-596b-4bac-9cc7-9109df63cbaf)
---
+ Usecase Diagram
  ![usecase](https://github.com/user-attachments/assets/0761c35c-ea9e-482c-938a-36f6e5cc2f4c)
---
+ Class Diagram
  ![class](https://github.com/user-attachments/assets/5eaa5e10-5206-465a-bd8e-e32141f803c0)
***
## 4. 핵심 기능 <a id="chapter4"></a>
+ 회원가입
+ 로그인
+ 아이디 중복확인
+ 마이페이지(회원정보 수정)
+ 리뷰관리(등록, 수정, 삭제)
+ 상품관리(등록, 수정, 삭제)
***
## 5. 주요 기능 실행 화면 <a id="chapter5"></a>
#### 메인 페이지
+ 회원가입
  + 필수 정보를 입력하지 않고 회원가입 버튼을 클릭하면 미입력된 정보를 입력하라는 메세지가 출력됩니다.
  + 비밀번호와 비밀번호 확인란에 입력된 값이 다를 경우 비밀번호 미일치 경고창이 출력됩니다.
  + 아이디 중복체크를 미실시한 경우 중복체크 미실시 경고창이 출력됩니다.
 
    ![회원가입](https://github.com/user-attachments/assets/9a07236e-8dc2-44e0-af78-153b1b37cb45)
    
  + 아이디 중복체크 버튼 클릭 시 아이디 중복체크 팝업창이 노출됩니다.
  
  ![중복체크](https://github.com/user-attachments/assets/ee2001e2-398d-41dc-b7a6-6bd6f9cd98d8)

+ 로그인
  + 아이디 또는 비밀번호를 입력하지 않고 로그인 버튼을 클릭하면 미입력된 정보를 입력하라는 메세지가 출력됩니다.

  ![로그인](https://media.githubusercontent.com/media/InhoKang92/modern_jsp_01/refs/heads/main/src/main/webapp/gifs/login.gif)
  
+ 마이페이지
  + 회원정보 페이지에서는 정보를 수정할 수 있습니다.

  ![회원정보 수정](https://github.com/user-attachments/assets/a585cdc5-2cc9-4bd5-9f1f-600b42c69697)

#### 리뷰 페이지
+ 작성된 리뷰를 모두 확인할 수 있습니다.

![리뷰](https://media.githubusercontent.com/media/InhoKang92/modern_jsp_01/refs/heads/main/src/main/webapp/gifs/review.gif)

+ 리뷰를 등록할 수 있고, 수정 또는 삭제를 하려면 등록시 입력했던 비밀번호가 필요합니다.

![리뷰수정비밀번호](https://github.com/user-attachments/assets/585b7783-bb62-4593-86a9-085fadfc9096)
![리뷰삭제비밀번호](https://github.com/user-attachments/assets/0d55479a-e623-4bfd-94eb-7ec566ef5d29)

#### 상품관리 페이지
+ 상품관리 페이지로 이동하려면 관리자 비밀번호가 필요합니다.
+ 상품을 등록/수정할 수 있고, 삭제하려면 다시 관리자 비밀번호가 필요합니다.

![상품관리](https://github.com/user-attachments/assets/37745f0a-ad45-44cf-9a8e-a49f377d9b90)

***
## 6. 개선사항 <a id="chapter6"></a>
+ 온라인 쇼핑몰 기본 구조 확립
+ 데이터베이스 구조 확립

# Override_Test_200218_maria5845

[문제26]오버라이드(override)를 이용하여 다음 프로그램을 작성하시오

(1)클래스명: BaseTest
   필드명 : name:String ==> 초기값 : 민들래  salary:int ==> 초기값 : 12000000
   
   메소드 : getDisplay():void   ==> 이름과 연봉출력

(2)클래스명: DerivedTest
   필드명 : department:String ==> 초기값 : "홍보부";
   
   메소드 : getDisplay():void   ==> 부서출력

(3)처리조건
    BaseTest  bt = new DerivedTest();  
   (BaseTest(선조)클래스로 DerivedTest(후손) 객체생성할것)

(4)출력 결과 
이름 : 민들래
연봉 : 12000000 
부서 : 홍보부

-올린이 이찬용(maria5845) 본인저장소에서 fork함  -

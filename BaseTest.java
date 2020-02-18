package test0205;
// 상속하는 클래스 
public class BaseTest {
	
	private String name = "민들레";
	// 필드명 : name:String         ==> 초기값 : 민들래
	private int salary = 12000000;
	// 필드명 : salary:int          ==> 초기값 : 12000000

	public void getDisplay() {
	//	메소드 : getDisplay():void   ==> 이름과 연봉출력
		System.out.println("이름 :" + name);
		System.out.println("연봉 :" + salary);
	}

}

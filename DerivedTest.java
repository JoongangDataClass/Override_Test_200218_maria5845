package test0205;

//이 코드에서는 Default 생성자와 매개변수 생성자가 없어도 오류가 없다
//그러나 관행적인 의미 및 추가적인 코드를 위해 만드는 것이 좋다.

public class DerivedTest extends BaseTest {
    //상속받는 클래스 
	
	private String deparment = "홍보부";
	// 필드명 : department:String ==> 초기값 : "홍보부";

	public DerivedTest() {
		super();
		// 상속받는 클래스의 private 변수에 접근하기 위해 설정

		new BaseTest().getDisplay();

		/*
		 * BaseTest() 부모 클래스를 호출하고 부모클래스에 getDisplay()메서드를 호출하기 위해서 작성 getDisplay()메서드
		 * System.out.println("이름 :" + name); System.out.println("연봉 :" + salary);
		 */

	}
	public DerivedTest(String deparment) {
		super();
		this.deparment = deparment;

	}
	public void getDisplay() {
		System.out.println("부서 :" + deparment);
		// getDisplay():void ==> 부서출력
	};

	public static void main(String[] args) {

		BaseTest bt = new DerivedTest();
		// 부모 클래스에서 자식 클래스로 상속 받기 위해서는
		// extends "부모클래스_이름"이 필요함

		bt.getDisplay();
		/*
		 * 
		 * bt.getDisplay()메서드 System.out.println("이름 :" + name);
		 * System.out.println("연봉 :" + salary); System.out.println("부서 :"+ deparment );
		 * -> 이 출력문이 추가되서 출력됨
		 */
	}

}

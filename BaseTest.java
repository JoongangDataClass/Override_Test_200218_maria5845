package test0205;
// ����ϴ� Ŭ���� 
public class BaseTest {
	
	private String name = "�ε鷹";
	// �ʵ�� : name:String         ==> �ʱⰪ : �ε鷡
	private int salary = 12000000;
	// �ʵ�� : salary:int          ==> �ʱⰪ : 12000000

	public void getDisplay() {
	//	�޼ҵ� : getDisplay():void   ==> �̸��� �������
		System.out.println("�̸� :" + name);
		System.out.println("���� :" + salary);
	}

}

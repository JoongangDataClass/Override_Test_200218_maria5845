package test0205;

//�� �ڵ忡���� Default �����ڿ� �Ű����� �����ڰ� ��� ������ ����
//�׷��� �������� �ǹ� �� �߰����� �ڵ带 ���� ����� ���� ����.

public class DerivedTest extends BaseTest {
    //��ӹ޴� Ŭ���� 
	
	private String deparment = "ȫ����";
	// �ʵ�� : department:String ==> �ʱⰪ : "ȫ����";

	public DerivedTest() {
		super();
		// ��ӹ޴� Ŭ������ private ������ �����ϱ� ���� ����

		new BaseTest().getDisplay();

		/*
		 * BaseTest() �θ� Ŭ������ ȣ���ϰ� �θ�Ŭ������ getDisplay()�޼��带 ȣ���ϱ� ���ؼ� �ۼ� getDisplay()�޼���
		 * System.out.println("�̸� :" + name); System.out.println("���� :" + salary);
		 */

	}
	public DerivedTest(String deparment) {
		super();
		this.deparment = deparment;

	}
	public void getDisplay() {
		System.out.println("�μ� :" + deparment);
		// getDisplay():void ==> �μ����
	};

	public static void main(String[] args) {

		BaseTest bt = new DerivedTest();
		// �θ� Ŭ�������� �ڽ� Ŭ������ ��� �ޱ� ���ؼ���
		// extends "�θ�Ŭ����_�̸�"�� �ʿ���

		bt.getDisplay();
		/*
		 * 
		 * bt.getDisplay()�޼��� System.out.println("�̸� :" + name);
		 * System.out.println("���� :" + salary); System.out.println("�μ� :"+ deparment );
		 * -> �� ��¹��� �߰��Ǽ� ��µ�
		 */
	}

}

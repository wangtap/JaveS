package homework;

public class Cooker extends Person  implements UserInter{

	public Cooker( String job) {
		super( job);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void onLine() {
		System.out.println("��ʦ��ʼ������");
		����();
	}
@Override
	public void offLine() {
		System.out.println("��ʦ������");
	}
	public void ����(){
		System.out.println("����");
	}
	
	
	

}
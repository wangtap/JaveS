package homework;

public class Worker   extends Person implements UserInter {

	public Worker( String job) {
		super( job);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onLine() {
		System.out.println("���˿�ʼ�ɻ���");
		�չ�();
		
	}

	@Override
	public void offLine() {
		System.out.println("���˸����˻ؼ���");
		
	}
	public void �չ�(){
		System.out.println("�չ�");
		
	}

}

package homework;



public class Boss extends Person implements UserInter {
	public Boss( String job) {
		super( job);
	}
	@Override
	public void onLine() {
		System.out.println("�ϰ���Ա��");
		������();
	}
	@Override
	public void offLine() {
		System.out.println("�ϰ�ؼ�");
	}
	public void ������(){
		System.out.println("������");
	}

}
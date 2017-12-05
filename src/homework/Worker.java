package homework;

public class Worker   extends Person implements UserInter {

	public Worker( String job) {
		super( job);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onLine() {
		System.out.println("工人开始干活了");
		罢工();
		
	}

	@Override
	public void offLine() {
		System.out.println("工人干完了回家了");
		
	}
	public void 罢工(){
		System.out.println("罢工");
		
	}

}

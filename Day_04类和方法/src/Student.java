
public class Student {
	/*
	 * ������������������
	 * �������������Ի�û��ֵ��
	 */
	String name,school;
	int id;
	
	public void play(){
		System.out.println(name+"����Ϸȥ��");
		
	}
	public void gotoschool(){
		System.out.println(name+"ȥ��ѧ");
	}
	/*
	 * public  Ȩ�����η�
	 * void   ����ֵ����
	 * void��ʾ��û�з���ֵ
	 * show   ������
	 * (String str)   �����б��ǿ����ж��������
	 * String�ǲ���������
	 * ���÷���ʱ����Ҫ�����Ӧ���͵�����
	 * str �ǲ���������
	 * �����������ôд����ôд����Ҫ����֮��
	 *    {}    �����壺�������������ʱ��Ҫִ�еĴ���
	 *    
	 */
	public void show(String str){
		
	}
	public  void ������(int money){
		System.out.println("������ʦ��Ǯ"+money+"����Ϸȥ��");
	}
//	�����ѧ���߱�һ���ӷ����������
	public void  add (int a,int b ){
		int sum=a+b;
		System.out.println("��Ϊ��"+sum);
		//return 1223;
	}
	public String hot (String food ){
		return "�����˵�"+food;
	}

}

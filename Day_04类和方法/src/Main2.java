

public class Main2 {
	/*
	 * main��������������
	 * ��JAVA����ʱ
	 * �ͻ�����￪ʼ����
	 */
	public static void main(String [] args){
		/*
		 * ���㴴������֮��
		 * ��Ҫ�����������ʹ��
		 */
		//Father ff=new Father();
		//ʹ�ö��󣬵������ķ�����һЩ����
		//������.������();
		//ff.showInfo();
		//������.����
		//System.out.println(ff.name);
		Student zhangsan =new Student();
		//������.������=����ֵ��
//		����һ����ֵ����   System.out.println();public static void main(String[] args)
		
		zhangsan.name="������";
		zhangsan .school ="��ŷ�Ƽ���ӭ��";
		System.out.println(zhangsan.name);
//		���������÷���
//		ʹ��zhangsan�������
//		����play�������
		
		zhangsan.play();
		zhangsan.������(100);
        zhangsan.add(-100,- 0);
        
        String q=zhangsan.hot("����");
		System.out.println(q);
	}
}

package com.lanou3g.studay;

public class Company2 {
	/*
	 * ��������һ�����������ʱ��
	 * �������һ������Ķ���
	 * ��������Ķ��󶼿���
	 * 
	 */
	
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	public void work (){
		if(person instanceof Teather){
			/*
			 * ���person�������ָ��Ķ���
			 * ��Teacher���͵ģ���ô���ʽ���Ϊtrue
			 */System.out.println("��һ����ʦ");
			 if(person   instanceof Student){
				 System.out.println("��һ��ѧ��");
			 }
			
		}
		
		
		person.work();
	}
	
	
	
	
	
	
	
	
	

}

package com.lanou3g.extend;

/**
 * @author lanou3g
 *
 */
public class BigCar extends Car {
	// ���� �����{}�е�����
	// ������Ա�������Ի��Ա����
	// show���������w�����ֲ�����
	// �ֲ�������ֻ�ڶ�������{}����Ч
	// ���������Ч��Χ��������������������
	private String name = "�󿨳�";

	public void pullGoods() {
		System.out.println("����");
	}

	public void show() {
		// ��Ϊ������ ˽�е����������޷�����,Ҳ���޷���ֵwheel=4;
		int w = getWheels();
		System.out.println(getWheels());

	}

	@Override
	public int getWheels() {
		// TODO Auto-generated method stub
		return super.getWheels();
	}

	@Override
	public void setWheels(int wheels) {
		// TODO Auto-generated method stub
		super.setWheels(wheels);
	}

	@Override
	public String getColor() {
		System.out.println("����������getCar����");
		return super.getColor();
	}

	@Override
	public void setColor(String color) {
		System.out.println("����������setCar����"+color);
		 super.setColor(color);
	}
	public void showThis(){
		/*
		 * this���ڵ��ñ����Լ��ķ���
		 * super���ڵ��ø���ķ���
		 * this�����������
		 * ����һ��û��˵����super������������
		 * 
		 * this���Ե��ñ�������Է���
		 * 
		 */
		this.setColor("   ��������1ɫ");
//		super.setColor("  ����������ɫ");
		
		
		
	}
	public void speed(){
			//super.speed();
			//System.err.print("���ٶ�Ϊ80");
			
		}

}
package com.lanou3g.realtoday.exception;

public class Main {

        public static void main(String[] args) {
//            WWWW();
//            no();
            ChunLai chunLai=null;

            try {
                chunLai = new ChunLai();
                chunLai.eat(300);

            } catch (EatException e) {
                System.out.println(e.getMessage());
            }
            try {
                chunLai.eat(230);
            } catch (EatException e) {
                e.printStackTrace();
            }


//            show2();


//    private static void no() {
            //            try {
//                new ChunLai().eat(100);
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//    }

//    private static void show2() {
//
//        try {
//            new ChunLai().eat(230);
//        } catch (NotEnoughException e) {
//            e.printStackTrace();
//        } catch (ToomuchException e) {
//            e.printStackTrace();
//        }
//
//    }

//    private static void WWWW() {
//        int n =10;
//        try{
//            /*
//            ��try�У�д���ܻ���ֵ��쳣�Ĵ���
//            ���ִ�иô���ʱ�������쳣
//            ��������ת����catch���ܿ�
//             */
//
//    int resule=n/0;
//    }catch(ArithmeticException e){
//            System.out.println(e.getClass().getName());
//            System.out.println(e.getClass().getSimpleName());
//            /*
//            ����ִ�е�return��ʱ��
//            �ͻ᷵��һ��ֵ
//            ����ķ���ֵ����Ϊvoid
//            ��ʾû�з���ֵ������ֱ��д��һ��return��
//             */
//            return;
//    }finally {
//            System.out.println("����������������");
////            ��finally�У���һ����ִ�еĴ���
////                ���ǲ��ܲ�������ִ��
//}
//    }
        }}
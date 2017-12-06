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
//            在try中，写可能会出现的异常的代码
//            如果执行该代码时，出现异常
//            则程序会跳转到，catch功能块
//             */
//
//    int resule=n/0;
//    }catch(ArithmeticException e){
//            System.out.println(e.getClass().getName());
//            System.out.println(e.getClass().getSimpleName());
//            /*
//            方法执行到return的时候
//            就会返回一个值
//            这里的返回值类型为void
//            表示没有返回值，所以直接写了一个return了
//             */
//            return;
//    }finally {
//            System.out.println("哈哈哈哈哈哈哈哈");
////            在finally中，是一定会执行的代码
////                就是不管不报错都会执行
//}
//    }
        }}
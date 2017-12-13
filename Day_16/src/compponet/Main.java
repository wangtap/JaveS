package compponet;

import decorator.加水Decorator;
import decorator.加醋Decorator;

public class Main {
    public static void main(String[] args) {
        //可以看到,我们操作的引用一直是这个yp
        //但是这个引用指向的对象已经换了好几次了
        //这就是为什么装饰类也要是饮品类的子类,因为只有这样,装饰类与被装饰类才能被当做同一个类型使用(通过接口或继承实现)
        饮品 yp = new 啤酒Component();
        yp = new 加水Decorator(yp);
        yp = new 加醋Decorator(yp);
//  上面与下面这一行是一样的,是不是和IO流很像?
//  yp = new 加醋Decorator(new 兑水Decorator(new 可乐Component()));

        System.out.println("饮品名:" + yp.getName() + "---价格:" + yp.price());
    }
}

package decorator;

import compponet.饮品;

public class 加醋Decorator extends  Decorator {

    public 加醋Decorator(饮品 yp) {
        super(yp);
    }

    @Override
    public int price() {
        return 10+yp.price();
    }

    @Override
    public String getName() {
        return "加醋的"+yp.getName();
    }
}

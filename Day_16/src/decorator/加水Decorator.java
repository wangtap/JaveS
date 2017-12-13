package decorator;

import compponet.饮品;

public class 加水Decorator extends  Decorator {
    public 加水Decorator(饮品 yp) {
        super(yp);
    }

    @Override
    public int price() {
        return yp.price()-5;
    }

    @Override
    public String getName() {
        return "兑水的"+yp.getName();
    }
}

public class Button implements IFunction {
    private String btnName;

    public Button(String btnName) {
        this.btnName = btnName;
    }

    public Button() {
    }

    @Override
    public void click() {
        System.out.println(this.btnName+"按钮被点击");
    }

    @Override
    public void getFunction() {

    }


}

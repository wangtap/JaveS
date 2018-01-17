public class Main {

    public static void main(String[] args) {
        Enum.t.ccc();
        Enum.t t = T.t(10, 0);
        if (t== Enum.t.SUCCESS){
            System.out.println("成功");
        }else if (t== Enum.t.FAIL){
            System.out.println("失败");
        }
    }
}

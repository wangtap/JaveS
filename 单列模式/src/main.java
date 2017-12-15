public class main {
    public static void main(String[] args) {
        Test test = Test.getTest();
        Test test3 = Test.getTest();
//         Test test2= new Test();
        System.out.println(test == test3);
    }
}



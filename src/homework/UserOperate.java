package homework;

import java.util.ArrayList;

public class UserOperate {
    public UserInter login(ArrayList<String> arr, String str1, String str2) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).length(); j++) {
                if (str1.equals(arr.get(i).get(1)) && str2.equals(arr.get(i).get(2))) {
                    switch (str1) {
                        case "Boss":
                            return new Boss(arr.get(i).get(3));
                        case "Cooker":
                            return new Cooker(arr.get(i).get(3));
                        case "Doctor":
                            return new Doctor(arr.get(i).get(3));
                        case "Worker":
                            return new Worker(arr.get(i).get(3));
                        default:
                            break;
                    }
                }
            }
        }
        return null;

    }

    public  void register(Person n    ){

        ArrayList<String>  A =new ArrayList<String>();
        A.add(n.getName());
        A.add(n.getUsename());
        A.add(n.getPassword());
        A.add(n.getJob());
        UserData.list.add(A);
   }








}

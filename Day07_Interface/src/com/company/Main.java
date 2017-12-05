package com.company;

public class Main {

    private static int index;

    public static void main(String[] args) {
	// write your code here


        // 2、在main中定义数组(容量为10个元素)，管理所有联系人。
        // 添加新联系人对象，如果姓名或电话号码为空，打印添加失败。
        Contact contact[] = new Contact[10];
        addContact(contact, new Contact("一", "1","男","武汉","青年"));
        addContact(contact, new Contact("二 ", "2","女","武汉","儿童"));
        addContact(contact, new Contact("三 ", "3","男","北京","青年"));
        addContact(contact, new Contact("四", "4","女","武汉","青年"));
        addContact(contact, new Contact("五", "5","男","江西","老人"));
        

        // 3、获取某个分组下的所有联系人。
        contact[0].setGroup("青年");
        printContactsByGroup(contact, "青年");

        // 4、根据电话号码搜索联系人。
        printContactsByPhone(contact, "4");

        // 5、获取所有女性联系人
        contact[0].setSex("女");
        printFemaleontacts(contact);

        // 6、展示通讯录中所有联系人
        printContact(contact);

    }

    // 2, 添加新联系人对象，如果姓名或电话号码为空，打印添加失败。
    public static void addContact(Contact contact[], Contact newContact) {
        if (null == newContact.getName() || null == newContact.getPhone()) {
            System.out.println("Insufficient parameters!");
            return;
        }
        contact[index++] = newContact;
    }

    // 3、获取某个分组下的所有联系人。
    public static void printContactsByGroup(Contact contact[], String group) {
        if (null == group) {
            System.out.println("Parameter error!");
            return;
        }
        System.out.println(group+"下的名单为：");
        for (int i = 0; i < index; i++) {
            if (group.equalsIgnoreCase(contact[i].getGroup())) {
                contact[i].info();
            }
        }

    }

    // 4、根据电话号码搜索联系人。
    public static void printContactsByPhone(Contact contact[], String phone) {
        if (null == phone) {
            System.out.println("Parameter error!");
            return;
        }
        System.out.println("电话为"+phone+"的名单为：");
        for (int i = 0; i < index; i++) {
            if (phone.equalsIgnoreCase(contact[i].getPhone())) {
                contact[i].info();
            }
        }

    }

    // 5、获取所有女性联系人
    public static void printFemaleontacts(Contact contact[]) {
    	System.out.println("性别为女的名单为：");
        for (int i = 0; i < index; i++) {
            if ("女".equalsIgnoreCase(contact[i].getSex())) {
                contact[i].info();
            }
        }

    }
    // 6、展示通讯录中所有联系人
    public static void printContact(Contact contact[]) {
    	System.out.println("所有联系人为：");
        for (int i = 0; i < index; i++) {
            contact[i].info();
        }
    }


}

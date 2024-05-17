package com.zk.springbootzk.demos;

public enum Color {
    RED("红色"), BLUE("蓝色"), GREEN("绿色");
    // 以上三个值都是 Color 类的对象，,Java 自动实例化

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void test() {
        System.out.println("测试一下");
    }

    private Color(String name){
        this.name = name;
    }

//    private Color(){}

    public static void main(String[] args) {
        // 证明 RED 属于 color 类
        Color red = Color.RED;
//        red.setName("红");
//        System.out.println(red.getName());
//        red.test();
        switch (red){
            case RED:
                System.out.println("红色"); break;
            case BLUE:
                System.out.println("蓝色"); break;
            case GREEN:
                System.out.println("绿色"); break;
        }

    }
}

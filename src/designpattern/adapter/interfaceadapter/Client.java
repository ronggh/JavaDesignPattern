package designpattern.adapter.interfaceadapter;

// 客户端类
public class Client {
    public static void main(String[] args) {
        // 接口适配器类，通过匿名内部类的方式，覆盖需要的方法
        AbsAdapter absAdapter = new AbsAdapter() {
            //
            @Override
            public void m1() {
                //
                System.out.println("使用了m1的方法");
            }
        };

        absAdapter.m1();
    }
}

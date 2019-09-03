package designpattern.prototype.deepclone;

public class Client {
    public static void main(String[] args) throws Exception {
        //
        DeepProtoType p1 = new DeepProtoType();
        p1.name = "宋江";
        p1.deepCloneableTarget = new DeepCloneableTarget("大牛", "小牛");

        //方式1 完成深拷贝
        System.out.println(">>>>> 方式1:完成深拷贝——重写clone()方法");
		DeepProtoType p2 = (DeepProtoType) p1.clone();//
		System.out.println("p1.name = " + p1.name + "  p1.deepCloneableTarget = " + p1.deepCloneableTarget.hashCode());
		System.out.println("p2.name = " + p1.name + "  p2.deepCloneableTarget = " + p2.deepCloneableTarget.hashCode());

        //方式2 完成深拷贝
        System.out.println("\n>>>>> 方式2:完成深拷贝——通过对象序列化");
        DeepProtoType p3 =  p1.deepClone();
        System.out.println("p1.name = " + p1.name + "  p1.deepCloneableTarget = " + p1.deepCloneableTarget.hashCode());
        System.out.println("p3.name = " + p1.name + "  p3.deepCloneableTarget = " + p3.deepCloneableTarget.hashCode());
    }
}

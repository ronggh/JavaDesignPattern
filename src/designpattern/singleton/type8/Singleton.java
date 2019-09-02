package designpattern.singleton.type8;

// 使用枚举，可以实现单例, !!!推荐!!!
public enum Singleton {
    INSTANCE; //属性
    public void sayOK() {
        System.out.println("ok~");
    }
}

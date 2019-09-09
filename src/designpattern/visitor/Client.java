package designpattern.visitor;

public class Client {
    public static void main(String[] args) {
        //创建ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();

        //成功
        System.out.println("=======给的是成功的测评========");
        objectStructure.attach(new Man("Tom"));
        objectStructure.attach(new Woman("Marry"));
        Success success = new Success();
        objectStructure.display(success);

        System.out.println("=======给的是失败的测评========");
        Person jerry = new Man("Jerry");
        Person audrey = new Woman("Audrey");
        objectStructure.attach(jerry);
        objectStructure.attach(audrey);
        Fail fail = new Fail();
        objectStructure.display(fail);


        System.out.println("=======给的是待定的测评========");
        objectStructure.attach(new Man("David"));
        objectStructure.attach(new Woman("Ada"));
        Wait wait = new Wait();
        objectStructure.display(wait);
    }
}

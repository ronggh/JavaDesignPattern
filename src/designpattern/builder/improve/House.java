package designpattern.builder.improve;

//产品->Product, 剥离出具体的构建过程，交由构建者完成
public class House {
    //
    private String baise;
    private String wall;
    private String roofed;
    //
    public String getBaise() {
        return baise;
    }
    public void setBaise(String baise) {
        this.baise = baise;
    }
    public String getWall() {
        return wall;
    }
    public void setWall(String wall) {
        this.wall = wall;
    }
    public String getRoofed() {
        return roofed;
    }
    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}

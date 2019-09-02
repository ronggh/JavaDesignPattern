package uml.composition;

public class Computer {
	private Mouse mouse = new Mouse(); //鼠标可以和computer不能分离
	private Monitor moniter = new Monitor();//显示器可以和Computer不能分离
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public void setMoniter(Monitor moniter) {
		this.moniter = moniter;
	}
}

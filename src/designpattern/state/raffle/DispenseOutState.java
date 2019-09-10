package designpattern.state.raffle;

// 具体状态类 ====> 奖品发放完毕状态 DispenseOutState
public class DispenseOutState extends State {
    // 构造器
    public DispenseOutState(RaffleActivity activity) {
        super(activity);
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品发送完了，请下次再参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了，请下次再参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了，请下次再参加");
    }
}

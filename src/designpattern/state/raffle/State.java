package designpattern.state.raffle;

//状态抽象类 ====> IState
public abstract class State {
    // 初始化时传入活动引用
    protected RaffleActivity activity;

    // 构造器
    public State(RaffleActivity activity) {
        this.activity = activity;
    }

    public abstract void deductMoney(); // 扣除积分 - 50
    public abstract boolean raffle();// 是否抽中奖品
    public abstract void dispensePrize();// 发放奖品
}

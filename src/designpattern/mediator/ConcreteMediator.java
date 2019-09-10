package designpattern.mediator;

import java.util.HashMap;

//具体的中介者类 ====> ConcreteMediator
public class ConcreteMediator extends Mediator {
    //集合，放入所有的同事对象
    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> interMap;

    //
    public ConcreteMediator() {
        colleagueMap = new HashMap<String, Colleague>();
        interMap = new HashMap<String, String>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);

        if (colleague instanceof AlarmColleague) {
            interMap.put("AlarmColleague", colleagueName);
        } else if (colleague instanceof CoffeeMachineColleague) {
            interMap.put("CoffeeMachineColleague", colleagueName);
        } else if (colleague instanceof TvColleague) {
            interMap.put("TvColleague", colleagueName);
        } else if (colleague instanceof CurtainColleague) {
            interMap.put("CurtainColleague", colleagueName);
        }

    }

    //具体中介者的核心方法
    //1. 根据得到消息，完成对应任务
    //2. 中介者在这个方法，协调各个具体的同事对象，完成任务
    @Override
    public void getMessage(int stateChange, String colleagueName) {
        //处理闹钟发出的消息
        if (colleagueMap.get(colleagueName) instanceof AlarmColleague) {
            if (stateChange == 0) {
                ((CoffeeMachineColleague) (colleagueMap.get(interMap
                        .get("CoffeeMachineColleague")))).startCoffee();
                ((TvColleague) (colleagueMap.get(interMap.get("TvColleague")))).startTv();
            } else if (stateChange == 1) {
                ((TvColleague) (colleagueMap.get(interMap.get("TvColleague")))).stopTv();
            }

        } else if (colleagueMap.get(colleagueName) instanceof CoffeeMachineColleague) {
            ((CurtainColleague) (colleagueMap.get(interMap.get("CurtainColleague"))))
                    .upCurtains();

        } else if (colleagueMap.get(colleagueName) instanceof TvColleague) {
            //如果TV发现消息

        } else if (colleagueMap.get(colleagueName) instanceof CurtainColleague) {
            //如果是以窗帘发出的消息，这里处理...
        }

    }

    @Override
    public void sendMessage() {

    }
}

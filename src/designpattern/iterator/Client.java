package designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // 创建计算机学院及所属系
        ComputerCollege computerCollege = new ComputerCollege(5);
        computerCollege.addDepartment("Java专业", " Java专业 ");
        computerCollege.addDepartment("PHP专业", " PHP专业 ");
        computerCollege.addDepartment("大数据专业", " 大数据专业 ");

        // 创建信息工程学院及所属系
        InfoCollege infoCollege = new InfoCollege();
        infoCollege.addDepartment("信息安全专业", " 信息安全专业 ");
        infoCollege.addDepartment("网络安全专业", " 网络安全专业 ");
        infoCollege.addDepartment("服务器安全专业", " 服务器安全专业 ");

        //创建学院列表
        List<College> collegeList = new ArrayList<College>();
        collegeList.add(computerCollege);
        collegeList.add(infoCollege);
        //
        University university = new University(collegeList);
        university.printCollege();
    }
}

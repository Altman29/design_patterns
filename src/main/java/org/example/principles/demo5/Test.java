package org.example.principles.demo5;

/**
 * 测试类
 * 迪米特法则
 */
public class Test {
    public static void main(String[] args) {
        //创建经纪人对象
        Agent agent = new Agent();
        //创建明星对象
        Star star = new Star("林青霞");
        agent.setStar(star);
        //创建粉丝对象
        Fans fans = new Fans("张三");
        agent.setFans(fans);
        //创建媒体公司对象
        Company company = new Company("传媒公司");
        agent.setCompany(company);

        //和粉丝见面
        agent.meeting();
        //和媒体公司洽谈业务
        agent.business();
    }
}

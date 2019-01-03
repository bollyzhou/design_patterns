package com.github.bollyzhou.design;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ZST
 * @Date: 2018/12/25
 * @Description:
 */
public class DemoTest {
    public static void main(String[] args) {
        List<Colleague> landlordList = new ArrayList<>();
        List<Colleague> renterList = new ArrayList<>();

        Renter zhangsan = new Renter("zhangsan");
        Renter lisi = new Renter("lisi");

        Landlord wangwu = new Landlord("wangwu");


        landlordList.add(zhangsan);
        landlordList.add(lisi);
        renterList.add(wangwu);

        RoomMediator roomMediator = new RoomMediator(renterList,landlordList);
        zhangsan.sendToMediator("西站房子出租1000元一月",roomMediator);
        lisi.sendToMediator("西站房子出租1300元一月",roomMediator);
        wangwu.sendToMediator("我想租房子",roomMediator);

    }
}

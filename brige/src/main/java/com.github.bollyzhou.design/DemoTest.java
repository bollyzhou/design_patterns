package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/20
 * @Description:
 */
public class DemoTest {
    public static void main(String[] args) {
        HuaWeiPhone huaWeiPhone = new HuaWeiPhone(new Call());
        huaWeiPhone.use();

        ZhongXingPhong zhongXingPhong = new ZhongXingPhong(new Camera());
        zhongXingPhong.use();
    }
}

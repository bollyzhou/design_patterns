package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/20
 * @Description:
 */
public class HuaWeiPhone extends AbstractPhoneBrand {
    public HuaWeiPhone(SoftWare softWare) {
        super(softWare);
    }

    @Override
    void use() {
        System.out.println("华为手机");
        softWare.run();
    }
}

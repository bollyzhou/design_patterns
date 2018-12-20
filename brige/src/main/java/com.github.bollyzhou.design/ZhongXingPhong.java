package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/20
 * @Description: 具体的手机品牌
 */
public class ZhongXingPhong extends AbstractPhoneBrand {
    public ZhongXingPhong(SoftWare softWare) {
        super(softWare);
    }

    @Override
    void use() {
        System.out.println("中兴手机");
        softWare.run();
    }
}

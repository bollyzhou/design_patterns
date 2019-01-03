package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/24
 * @Description:房间状态类
 *
 *  转态模式，参考博客：https://blog.csdn.net/sinat_41604086/article/details/85239922
 */
public interface State {
    /**
     * 预定房间
     */
    public void bookRoom();

    /**
     * 退订房间
     */
    public void unsubscribeRoom();

    /**
     * 入住房间
     */
    public void checkinRoom();

    /**
     * 退房
     */
    public void checkoutRoom();
}

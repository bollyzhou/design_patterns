package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/27
 * @Description:
 */
public class Handle1 implements Handle {
    //下一级
    private Handle handle;

    @Override
    public void setNextHandle(Handle handle) {
        this.handle = handle;
    }

    @Override
    public void doHandle() {
        System.out.println("第一步：准备材料。。。");
        if(null != handle){
            handle.doHandle();
        }

    }
}

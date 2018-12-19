package com.github.bollyzhou.design.intface.adapter;

/**
 * 接口适配器
 * 这个接口中有很多的方法，但是如果我们只想去适配220v的方法，如果按照前两种适配器的方法去做，会将这个接口所有的方法都要去实现，即使都写成默认的{}，
 * 也将实现的类变的很臃肿，所以我们就加一层去实现这个方法，使抽象类的子类来重写想要是适配的方法。
 */
public interface Charge {
    int chargeFor220V();
    int chargeFor200V();
    int chargeFor180V();
    int chargeFor150V();
    int chargeFor100V();

}

package com.github.bollyzhou.design;

public class DemoTest {
    public static void main(String[] args) {
        JianBing makeBing = new MakeBing();
        makeBing.make();

        AddEgg addEgg = new AddEgg(makeBing);
        addEgg.make();

        AddHuoTui addHuoTui = new AddHuoTui(addEgg);
        addHuoTui.make();
    }
}

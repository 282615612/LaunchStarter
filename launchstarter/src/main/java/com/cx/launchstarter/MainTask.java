package com.cx.launchstarter;

public abstract class MainTask extends Task {

    @Override
    public boolean runOnMainThread() {
        return true;
    }

}

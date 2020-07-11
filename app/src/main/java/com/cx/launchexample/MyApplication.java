package com.cx.launchexample;

import android.app.Application;

import com.cx.launchstarter.TaskDispatcher;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        TaskDispatcher.init(this);
        TaskDispatcher taskDispatcher=TaskDispatcher.createInstance();
        taskDispatcher.addTask(new InitSdkTask()).start();
        taskDispatcher.await();

    }
}

package com.evoj.note.app;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;

/**
 * Created by XhinLiang on 2017/5/13.
 * xhinliang@gmail.com
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AVOSCloud.initialize(this, "TW88suKpKevTuaGJHhG4qd0H-gzGzoHsz", "q3W1XQ06zJeOMjRDsu0R5Qsj");
    }
}

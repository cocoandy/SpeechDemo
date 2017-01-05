package application;

import android.app.Application;

import cn.bmob.v3.Bmob;

/**
 * Created by Administrator on 2017/1/5.
 */

public class HotelApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Bmob.initialize(this, "c01f006fc8d7d5bfe088e2b7e1823777");
    }
}

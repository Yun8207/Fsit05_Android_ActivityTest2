package tw.alex.activitytest2;

import android.app.Application;
import android.util.Log;

public class Alexapp extends Application {
    public int a;
    //public static int a;
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("alex","Alexapp:onCreate");
        a = 111;
        Log.d("alex","a= " + a);
    }
}

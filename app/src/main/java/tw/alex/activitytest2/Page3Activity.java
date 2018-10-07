package tw.alex.activitytest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Page3Activity extends AppCompatActivity {
    private Alexapp alexapp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        alexapp = (Alexapp)getApplication();
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("alex","before a = " + alexapp.a);
        alexapp.a = 444;

        Log.d("alex","after a = " + alexapp.a);
    }
}

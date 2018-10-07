package tw.alex.activitytest2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Page2Activity extends AppCompatActivity {
    private Alexapp alexapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);


        alexapp = (Alexapp)getApplication();

        Intent intent = getIntent();
        int rand = intent.getIntExtra("rand", -1);
        Log.d("alex","Page2 rand="+ rand);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("alex","before a = " + alexapp.a);
        alexapp.a = 333;

        Log.d("alex","after a = " + alexapp.a);
    }

    @Override
    public void finish() {
        //setResult(123);
        Intent intent = new Intent();
        intent.putExtra("username","Alex");
        intent.putExtra("isPass", true);
        setResult(321, intent);

        super.finish();
    }
}


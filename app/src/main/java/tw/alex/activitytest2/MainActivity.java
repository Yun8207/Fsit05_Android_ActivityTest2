package tw.alex.activitytest2;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Alexapp alexapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alexapp = (Alexapp)getApplication();
    }


    public void gotoPage2(View view){
        int rand = (int)(Math.random()*49+1);
        Log.d("alex","Main rand=" + rand);

        Intent intent = new Intent(this, Page2Activity.class);
        intent.putExtra("rand", rand);
        //startActivity(intent);
        startActivityForResult(intent,134);
    }

    public void gotoPage3(View view){

        Intent intent = new Intent(this, Page3Activity.class);
        startActivityForResult(intent,234);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d("alex","onActivityResult()" + requestCode + ":"+ resultCode);

        if(requestCode ==134) {
            String username = data.getStringExtra("username");
            boolean isPass = data.getBooleanExtra("isPass", false);
            Log.d("alex", username + ":" + isPass);
        }else if (requestCode == 234){
            Log.d("alex", "Page3 back");
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("alex","onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("alex","onResume()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("alex","onStart()");
        Log.d("alex","before a = " + alexapp.a);
        alexapp.a = 222;

        Log.d("alex","after a = " + alexapp.a);
    }
}

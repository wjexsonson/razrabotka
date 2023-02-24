package com.example.a1prak;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    int duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "onCreate", duration).show();
        Log.i(TAG, "onCreate");
    }
}
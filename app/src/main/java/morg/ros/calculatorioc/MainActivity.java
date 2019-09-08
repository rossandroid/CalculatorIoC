package morg.ros.calculatorioc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import morg.ros.calculator.IMemory;
import morg.ros.calculator.IOperations;

public class MainActivity extends AppCompatActivity {

    @Inject
    IOperations operations;
    @Inject
    IMemory memory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApplication)getApplication()).getAppComponent().inject(this);

        memory.setOperations(operations);
        operations.setMemory(memory);

        int r = operations.add(1, 2);
        Log.i("Operations_MainActivity", ""+r);
        memory.saveValue(r);
        r = memory.mPlus(5);
        Log.i("Operations_MainActivity", ""+r);
    }
}

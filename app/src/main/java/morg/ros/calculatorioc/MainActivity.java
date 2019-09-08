package morg.ros.calculatorioc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import morg.ros.calculator.IMemory;
import morg.ros.calculator.IOperations;
import morg.ros.calculator.Memory;
import morg.ros.calculator.Operations;

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
        Log.i("Operations_Dagger", ""+r);
        memory.saveValue(r);
        r = memory.mPlus(5);
        Log.i("Operations_Dagger", ""+r);

        //Dependency Inversion Principle
        Memory m = new Memory();
        Operations o = new Operations(m);
        m.setOperations(o);

        r = o.add(1, 2);
        Log.i("Operations_DIP", ""+r);
        m.saveValue(r);
        r = m.mPlus(5);
        Log.i("Operations_DIP", ""+r);

    }
}

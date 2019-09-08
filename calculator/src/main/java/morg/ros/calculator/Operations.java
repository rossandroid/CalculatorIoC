package morg.ros.calculator;

import android.support.annotation.Nullable;

public class Operations  implements IOperations{
    private IMemory memory;

    public Operations(){}


    //NO DAGGER
    public Operations(IMemory m){
        setMemory(m);
    }


    private Integer getValueFromMemory(@Nullable Integer b){
        if(b == null)
            b = this.memory.getValue();
        return b;
    }

    @Override
    public int add (Integer a, @Nullable Integer b ){
        b = getValueFromMemory(b);
        return a + b;
    }

    @Override
    public void setMemory(IMemory m) { this.memory  = m; }

    public IMemory getMemory() {
        return memory;
    }
}

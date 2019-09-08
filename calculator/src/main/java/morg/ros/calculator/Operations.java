package morg.ros.calculator;

import android.support.annotation.Nullable;

public class Operations  implements IOperations{
    IMemory memory;

    public Operations(){}

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


}

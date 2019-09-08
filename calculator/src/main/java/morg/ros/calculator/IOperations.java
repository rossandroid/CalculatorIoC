package morg.ros.calculator;

import android.support.annotation.Nullable;

public interface IOperations {

    int add (Integer a, @Nullable Integer b );

    void setMemory(IMemory m);
}

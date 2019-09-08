package morg.ros.calculator;

public interface IMemory {

    int getValue();

    void saveValue(int value);

    void setOperations(IOperations iops);

    int mPlus(int value);
}

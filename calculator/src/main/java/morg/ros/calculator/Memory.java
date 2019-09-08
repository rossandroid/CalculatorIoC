package morg.ros.calculator;

public class Memory implements IMemory {
    private int memory;
    private IOperations operations;

    @Override
    public void saveValue(int value) { this.memory = value; }

    @Override
    public int getValue() { return this.memory; }

    @Override
    public void setOperations(IOperations iops) { this.operations = iops; }

    @Override
    public int mPlus(int value) {
        memory = operations.add(this.memory, value);
        return memory;
    }
}

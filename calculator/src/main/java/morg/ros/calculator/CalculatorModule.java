package morg.ros.calculator;

import dagger.Module;
import dagger.Provides;

@Module
public class CalculatorModule {

    @Provides
    public IOperations getOperations() {

        return new Operations();

    }

    @Provides
    public IMemory getMemory(){

        return new Memory();

    }
}

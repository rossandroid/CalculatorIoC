package morg.ros.calculatorioc;


import dagger.Component;
import morg.ros.calculator.CalculatorModule;

@Component(modules = CalculatorModule.class)
public interface AppComponent {
    void inject(MainActivity m);
}

package morg.ros.calculatorioc;

import android.app.Application;

import morg.ros.calculator.CalculatorModule;

public class MyApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .calculatorModule(new CalculatorModule()).build();
    }

    public AppComponent getAppComponent() {

        return appComponent;

    }
}

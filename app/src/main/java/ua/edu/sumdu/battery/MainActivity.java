package ua.edu.sumdu.battery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private final int BATTERY_LEVEL_MIN = 0;

    private final int BATTERY_LEVEL_MAX = 7;

    private int batteryLevelValue = 3;

    private ImageView mImgLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImgLevel = findViewById(R.id.img_level);
        updateBatteryLevel();
    }

    public void onPlus(View view) {
        batteryLevelValue = Math.min(batteryLevelValue + 1, BATTERY_LEVEL_MAX);
        updateBatteryLevel();
    }

    public void onMinus(View view) {
        batteryLevelValue = Math.max(batteryLevelValue - 1, BATTERY_LEVEL_MIN);
        updateBatteryLevel();
    }

    private void updateBatteryLevel() {
        mImgLevel.setImageLevel(batteryLevelValue);
    }
}
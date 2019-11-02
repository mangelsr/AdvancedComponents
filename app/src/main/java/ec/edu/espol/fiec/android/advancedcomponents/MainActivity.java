package ec.edu.espol.fiec.android.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.leinardi.android.speeddial.SpeedDialActionItem;
import com.leinardi.android.speeddial.SpeedDialView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SpeedDialView speedDialView = findViewById(R.id.speedDial);

        SpeedDialActionItem mapItem = new SpeedDialActionItem.Builder(R.id.fab_map,
                R.drawable.ic_map).create();
        speedDialView.addActionItem(mapItem);

        speedDialView.setOnActionSelectedListener(new SpeedDialView.OnActionSelectedListener() {
            @Override
            public boolean onActionSelected(SpeedDialActionItem actionItem) {
                switch (actionItem.getId()) {
                    case R.id.fab_map:
                        Toast.makeText(getApplicationContext(), "Se apachurro...",
                                Toast.LENGTH_SHORT).show();
                        speedDialView.close();
                        return true;
                }
                return false;
            }
        });
    }
}

package ec.edu.espol.fiec.android.advancedcomponents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.getbase.floatingactionbutton.FloatingActionsMenu;

public class MenuActivity extends AppCompatActivity {

    FloatingActionsMenu floatingActionsMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        floatingActionsMenu = findViewById(R.id.btnMenu);
    }

    public void navigate(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.btnMap:
              intent = new Intent(MenuActivity.this, MapActivity.class);
              break;
//            case R.id.btnCalendar:
//                intent = new Intent(MenuActivity.this, MapActivity.class);
//                break;
            case R.id.btnVideo:
                intent = new Intent(MenuActivity.this, VideoActivity.class);
                break;
            case R.id.btnStatistics:
                intent = new Intent(MenuActivity.this, GraphicActivity.class);
                break;
        }
        if (intent != null) startActivity(intent);
        floatingActionsMenu.collapse();
    }
}

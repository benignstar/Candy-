package tailcatching.mirim.tailcatching;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static tailcatching.mirim.tailcatching.R.layout.activity_colorassign;

/**
 * Created by 안성현 on 2017-06-02.
 */

public class GameRoomActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Button start_Button=(Button)findViewById(R.id.start_Button);
        Button back_Button=(Button)findViewById(R.id.back_Button);

        start_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View colorAssign_View = (View) View.inflate(getApplicationContext(), R.layout.activity_colorassign, null);
                Intent ingame_Intent=new Intent(getApplicationContext(), InGameRoomActivity.class);
                startActivity(ingame_Intent);
                finish();
            }
        });
        back_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

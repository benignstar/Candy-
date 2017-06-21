package tailcatching.mirim.tailcatching;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class WaitingRoomActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting);
        Button room1_Button=(Button)findViewById(R.id.room1);
        Button room2_Button=(Button)findViewById(R.id.room2);
        Button room3_Button=(Button)findViewById(R.id.room3);

        room1_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gameRoom_Intent=new Intent(getApplicationContext(), GameRoomActivity.class);
                startActivity(gameRoom_Intent);
            }
        });
        room2_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gameRoom_Intent=new Intent(getApplicationContext(), GameRoomActivity.class);
                startActivity(gameRoom_Intent);
            }
        });
        room3_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gameRoom_Intent=new Intent(getApplicationContext(), GameRoomActivity.class);
                startActivity(gameRoom_Intent);
            }
        });

    }
}


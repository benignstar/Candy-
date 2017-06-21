package tailcatching.mirim.tailcatching;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login_Button=(Button)findViewById(R.id.login_Button);
        Button join_Button=(Button)findViewById(R.id.join_Button);

        login_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login_Intent=new Intent(getApplicationContext(), WaitingRoomActivity.class);
                startActivity(login_Intent);
            }
        });
    }
}

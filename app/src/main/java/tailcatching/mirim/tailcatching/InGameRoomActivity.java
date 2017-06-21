package tailcatching.mirim.tailcatching;

import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static tailcatching.mirim.tailcatching.R.layout.activity_colorassign;

/**
 * Created by 안성현 on 2017-06-02.
 */

@RequiresApi(api = Build.VERSION_CODES.N)
public class InGameRoomActivity extends AppCompatActivity {

    Button back_Button, submit_Button;
    TextView text_time, text_Chating;
    EditText edit_Chating;
    String s;
    int time=0;
    long start;
    long end;
    SimpleDateFormat timeFormat=new SimpleDateFormat("mm:ss");;

    Handler timer=new Handler(){
        public void handleMessage(Message msg) {
            time++;
            long now=System.currentTimeMillis();
                if(end>=start) {
                    text_time.setText(timeFormat.format(end - start));
                    end -= 1000;
                    timer.sendEmptyMessageDelayed(0, 1000);
                }
                else timeEnd();
        }
    };

    public void timeEnd(){
        Toast.makeText(this, "토론시간이 종료되었습니다", Toast.LENGTH_LONG).show();

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingame);
        back_Button=(Button)findViewById(R.id.back_Button);
        text_time=(TextView)findViewById(R.id.text_time);
        submit_Button=(Button)findViewById(R.id.submit_Button);
        edit_Chating=(EditText)findViewById(R.id.edit_Chating);
        text_Chating=(TextView)findViewById(R.id.text_Chating);
        s="";
        start=System.currentTimeMillis();
        end=start+10*1000;
        timer.sendEmptyMessage(0);
        AlertDialog.Builder color_assign = new AlertDialog.Builder(InGameRoomActivity.this);
        color_assign.setView(activity_colorassign);
        color_assign.setPositiveButton("확인", null);
        color_assign.show();

        submit_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s+=edit_Chating.getText().toString()+"\n";
                text_Chating.setText(s);
                edit_Chating.setText(null);

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

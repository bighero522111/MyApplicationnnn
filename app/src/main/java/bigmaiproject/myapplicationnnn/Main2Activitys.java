package bigmaiproject.myapplicationnnn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activitys extends AppCompatActivity {
    TextView data;
    String b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_activitys);
        data = (TextView) findViewById(R.id.textView);
        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            b3 = bundle.getString("b3");
            data.setText(b3);
        }
    }
}

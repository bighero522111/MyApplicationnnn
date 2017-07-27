package bigmaiproject.myapplicationnnn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText b1;
    Button b2;
    String b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b2 = (Button) findViewById(R.id.button);
        b1 = (EditText) findViewById(R.id.editText);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b3 = b1.getText().toString();
                if (!b3.isEmpty()){
                    Intent intent = new Intent(MainActivity.this,Main2Activitys.class);
                    intent.putExtra("b3",b3);
                    startActivity(intent);
                }
            }
        });
    }
}

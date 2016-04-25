package congnt.intentsdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonScenario1Click(View v) {
        Intent intentScenario1 =
            new Intent(this, Scenario1Activity.class);
        this.startActivity(intentScenario1);
    }

    public void onButtonCallReturnableActivityClick(View v) {
        Intent intentReturnableActivity =
            new Intent(this, ReturnScenarioActivity.class);
        this.startActivityForResult(intentReturnableActivity, 100);
    }

    @Override
    protected void onActivityResult(int requestCode,int returnCode, Intent intent) {
        super.onActivityResult(requestCode, returnCode, intent);
        if (returnCode == 50) {
            tView = (TextView) findViewById(R.id.textViewReturnCode);
            tView.setText(intent.getStringExtra("MyMessage"));
        }
    }
}

package congnt.intentsdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ReturnScenarioActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_return_scenario);
    }

    public void onButtonReturnClick(View v) {
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        String str = editText1.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("MyMessage", str);
        setResult(50, intent);
        finish();
    }
}

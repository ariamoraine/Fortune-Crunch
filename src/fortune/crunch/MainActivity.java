package fortune.crunch;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


public void toggleFortune(View view) {
	TextView fortune = (TextView) findViewById(R.id.fortune_text);
	ImageView cookie = (ImageView) findViewById(R.id.fortune_view);
	if (fortune.getVisibility() == View.GONE) {
		fortune.setVisibility(View.VISIBLE);
		cookie.setImageResource(R.drawable.fortune_cracked);
	}
}
}

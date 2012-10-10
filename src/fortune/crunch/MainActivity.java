package fortune.crunch;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;
import android.content.res.Resources;

public class MainActivity extends Activity {
	
	 private String[] myString;
	 private static final Random rgenerator = new Random();
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


public void toggleFortune(View view) {
	TextView fortune = (TextView) findViewById(R.id.fortune_text);
	ImageView cookie = (ImageView) findViewById(R.id.fortune_view);
	 Resources res = getResources();

	    myString = res.getStringArray(R.array.fortunes); 

	    String q = myString[rgenerator.nextInt(myString.length)];

	    TextView tv = (TextView) findViewById(R.id.fortune_text);
	    tv.setText(q);
	if (fortune.getVisibility() == View.GONE) {
		fortune.setVisibility(View.VISIBLE);
		cookie.setImageResource(R.drawable.fortune_cracked);
	}
}
}

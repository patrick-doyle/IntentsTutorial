package com.te.intentstutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends Activity {

	TextView textView;
	Intent intent;
	public static String ACTION_START = "com.te.intent.startsecondactivity";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.second_activity);
		textView = (TextView) findViewById(R.id.textView1);
		intent = this.getIntent();
		
		String action = intent.getAction();
		if(action.equals(ACTION_START)){
			Toast.makeText(this, "Started with Custom action", Toast.LENGTH_SHORT).show();
		}
		else if(action.equals(Intent.ACTION_VIEW)){
			Toast.makeText(this, intent.getStringExtra(Intent.EXTRA_TEXT), Toast.LENGTH_SHORT).show();
		}
		else if(action.equals(Intent.ACTION_SEND)){
			Toast.makeText(this, intent.getType(), Toast.LENGTH_SHORT).show();
		}
		
		super.onCreate(savedInstanceState);
	}
	
	

}

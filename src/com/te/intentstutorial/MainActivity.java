package com.te.intentstutorial;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void sendIntent(View v){
		Intent intent = new Intent();
		intent.setAction(SecondActivity.ACTION_START);
		startActivity(intent);
	}
	
	public void viewWebpage(View v){
		Uri uri = Uri.parse("http://www.twistedequations.com");
		Intent intent = new Intent(Intent.ACTION_VIEW,uri);
		startActivity(intent);
	}
	
	public void shareText(View v){
		String text = "content:///sdcard/pictures";
		Intent intent = new Intent();
		intent.setAction(Intent.ACTION_SEND);
		intent.putExtra(Intent.EXTRA_TEXT,text);
		intent.setType("text/plain");
		startActivity(Intent.createChooser(intent, "Send text to"));
	}

}

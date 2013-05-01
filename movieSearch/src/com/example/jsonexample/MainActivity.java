package com.example.jsonexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.parsexmlexample.R;

public class MainActivity extends Activity {
	TextView text;
	EditText mEdit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		text = (TextView) findViewById(R.id.info);
		mEdit = (EditText) findViewById(R.id.editText1);
		
	}
	public void searchForMovie(View view){
		String movieToSearch=mEdit.getText().toString();
		downloadJson json=new downloadJson(text,mEdit);
		json.execute("http://api.rottentomatoes.com/api/public/v1.0/movies.json?apikey=pukhd8djvdz2w29e88x67372&q="+movieToSearch+"&page_limit=5");

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


}

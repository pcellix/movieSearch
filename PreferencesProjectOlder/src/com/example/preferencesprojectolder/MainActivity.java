package com.example.preferencesprojectolder;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends PreferenceActivity {

	public void onCreate(Bundle savedInstanceState) {    
	    super.onCreate(savedInstanceState);       
	    addPreferencesFromResource(R.layout.preferences);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		menu.add(Menu.NONE, 0, 0, "Show current settings");
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case 0:
			startActivity(new Intent(this, Preferences.class));
			return true;
		}
		return false;
	}
}

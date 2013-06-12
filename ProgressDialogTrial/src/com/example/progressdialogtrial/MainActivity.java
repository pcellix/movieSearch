package com.example.progressdialogtrial;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final ProgressDialog myPd_ring=ProgressDialog.show(this, "Please wait", "Loading please wait..", true);
        myPd_ring.setCancelable(true);
        new Thread(new Runnable() {  
              @Override
              public void run() {
                    // TODO Auto-generated method stub
                    try
                    {
                          Thread.sleep(5000);
                    }catch(Exception e){}
                    myPd_ring.dismiss();
              }
        }).start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

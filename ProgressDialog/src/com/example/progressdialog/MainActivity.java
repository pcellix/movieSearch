package com.example.progressdialog;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Menu;

public class MainActivity extends Activity {
	ProgressDialog myPd_ring;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	    myPd_ring = ProgressDialog.show(this, "Pekling...wait", "Pekling please wait..");
        myPd_ring.setCancelable(true);
        new Thread(new Runnable() {  
              @Override
              public void run() {
                    // TODO Auto-generated method stub
                  
                          try {
							Thread.sleep(10000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
              }
        }).start();
	}
        private Handler handler = new Handler(){
        	@Override 
        	public void handleMessage(Message msg){
        		myPd_ring.dismiss();
        			
        	}
        };


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
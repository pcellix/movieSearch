package com.example.styrta;


public class MainActivity extends Activity {

    private WebView mWebview ;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        final ProgressDialog pD = ProgressDialog.show(this,"Pekieling...wait","Pekieling please wait");
        new Thread (new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				pD.dismiss();
			}
		}).start();
        
        mWebview  = new WebView(this);

        mWebview.getSettings().setJavaScriptEnabled(true); // enable javascript

        final Activity activity = this;

        mWebview.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }
        });
        mWebview .loadUrl("file:///storage/sdcard0/styrta1/main1.html");
        setContentView(mWebview );

    }

}
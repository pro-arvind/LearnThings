  package com.mycompany.learnthings;


import android.os.Bundle;
import android.support.v7.app.*;
import android.content.*;


public class Launch extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.launch);
		
		
			android.os.Handler hand=new android.os.Handler();
			hand.postDelayed(new Runnable() {
				@Override
				public void run()
				{
					Intent intent=new Intent(Launch.this,MainActivity.class);
					startActivity(intent);
				}
			},1000);
		
       }
	
	
}

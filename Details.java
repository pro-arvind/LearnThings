 package com.mycompany.learnthings;
import android.os.Bundle;
import android.support.v7.app.*;
import android.content.*;
import android.widget.*;
import android.net.*;
import android.view.*;

public class Details extends AppCompatActivity {
	String title;
	private Button btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.details);
		Intent intent=getIntent();
	 title=intent.getStringExtra("arg");
		getSupportActionBar().setTitle(title);
		ImageView img=findViewById(R.id.detailsImageView1);
		ImageView img2=findViewById(R.id.channelLogo);
		TextView text=findViewById(R.id.detailsTextView1);
		//  String variableValue=title.toLowerCase();
		//img.setImageResource(getResources().getIdentifier(variableValue, "drawable", getPackageName()));

		if(title.equals("HTML"))
		{
		    img.setImageResource(R.drawable.html);
			text.setText(R.string.html);
			img2.setImageResource(R.drawable.yb);
		}
		else if(title.equals("CSS"))
		{
		    img.setImageResource(R.drawable.css);
			text.setText(R.string.css);
			img2.setImageResource(R.drawable.yb);
		}
		else if(title.equals("Bootstrap"))
		{
		    img.setImageResource(R.drawable.bootstrap);
			text.setText(R.string.bootstrap);
			img2.setImageResource(R.drawable.yb);
		}
		else if(title.equals("JavaScript"))
		{
		    img.setImageResource(R.drawable.javascript);
			text.setText(R.string.javascript);
			img2.setImageResource(R.drawable.yb);
		}
		else if(title.equals("jQuery"))
		{
		    img.setImageResource(R.drawable.jquery);
			text.setText(R.string.jquery);
			img2.setImageResource(R.drawable.yb);
		}
		else if(title.equals("Php"))
		{
		    img.setImageResource(R.drawable.php);
			text.setText(R.string.php);
			img2.setImageResource(R.drawable.yb);
		}
		else if(title.equals("C language"))
		{
		    img.setImageResource(R.drawable.c);
			text.setText(R.string.c);
			img2.setImageResource(R.drawable.my);
		}
		else if(title.equals("Java"))
		{
		    img.setImageResource(R.drawable.java);
			text.setText(R.string.java);
			img2.setImageResource(R.drawable.my);
		}
		else if(title.equals("Android Studio"))
		{
		    img.setImageResource(R.drawable.as);
			text.setText(R.string.as);
			img2.setImageResource(R.drawable.fcc);
		}
		else if(title.equals("My SQL"))
		{
		    img.setImageResource(R.drawable.mysql);
			text.setText(R.string.mysql);
			img2.setImageResource(R.drawable.yb);
		}

		



		btn=findViewById(R.id.detailsButton1);
		btn.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View view)
				{
					//Intent in=new Intent(Details.this,Start.class);
					//startActivity(in);


					if(title.equals("HTML"))
					{
						String url="https://www.youtube.com/playlist?list=PL0b6OzIxLPbxStBQ21C2toa5uQMqHEoRT";
						yt(url);
					}
					else if(title.equals("CSS"))
					{
						String url="https://www.youtube.com/playlist?list=PL0b6OzIxLPbzDsI5YXUa01QzxOWyqmrWw";
						yt(url);
					}
					else if(title.equals("Bootstrap"))
					{
						String url="https://www.youtube.com/playlist?list=PL0b6OzIxLPbz1cgxiH5KCBsyQij1HsPtG";
						yt(url);
					}
					else if(title.equals("JavaScript"))
					{
						String url="https://www.youtube.com/playlist?list=PL0b6OzIxLPbx-BZTaWu_AF7hsKo_Fvsnf";
						yt(url);
					}
					else if(title.equals("jQuery"))
					{
						String url="https://www.youtube.com/playlist?list=PL0b6OzIxLPbzSyiC0PFaqeabe1aGhfrbW";
						yt(url);
					}
					else if(title.equals("Php"))
					{
						String url="https://www.youtube.com/playlist?list=PL0b6OzIxLPbyrzCMJOFzLnf_-_5E_dkzs";
						yt(url);
					}
					else if(title.equals("C language"))
					{
						String url="https://www.youtube.com/playlist?list=PLLioQ130_xjVgW5MVfLS1s7zfLFAbGIVs";
						yt(url);
					}
					else if(title.equals("Java"))
					{
						String url="https://www.youtube.com/playlist?list=PLX9Zi6XTqOKQ7TdRz0QynGIKuMV9Q2H8E";
						yt(url);
					}
					else if(title.equals("Android Studio"))
					{
						String url="https://www.youtube.com/playlist?list=PLaWa_yspJSO2Fa4-IPIQ0xk3PZYqyNYbA";
						yt(url);
					}
					else if(title.equals("My SQL"))
					{
						String url="https://www.youtube.com/playlist?list=PL0b6OzIxLPbzf12lu5etX_vjN-eUxgxnr";
						yt(url);
					}


				}
			});

	}

	public void yt(String url)
	{
		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setData(Uri.parse(url));
		intent.setPackage("com.google.android.youtube");
		startActivity(intent);
	}
	
	
	
}

 package com.mycompany.learnthings;

import android.app.*;
import android.os.*;
import android.support.v7.app.*;
import android.widget.*;
import android.content.*;
import android.view.*;
import android.widget.AdapterView.*;

public class MainActivity extends AppCompatActivity
{
	

	private String[]names;
	private Integer []img;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		getSupportActionBar().setDisplayShowHomeEnabled(true);
		getSupportActionBar().setIcon(R.drawable.icon); //also displays wide logo
		names=new String[]{"C language","Java","Android Studio","HTML","CSS","Bootstrap","JavaScript","jQuery","My SQL","Php"};
        img=new Integer[]{R.drawable.c,R.drawable.java,R.drawable.as,R.drawable.html,R.drawable.css,R.drawable.bootstrap,R.drawable.javascript,R.drawable.jquery,R.drawable.mysql,R.drawable.php};
		MyAdapter adapter=new MyAdapter(this,names);
		ListView lstView=(ListView)findViewById(R.id.mainListView1);
		lstView.setAdapter(adapter);
		lstView.setOnItemClickListener(new OnItemClickListener(){
			@Override
			public void onItemClick(AdapterView<?> l,View v,int position,long id)
			{
				String s=(String)l.getItemAtPosition(position);
				//Toast.makeText(MainActivity.this,s,Toast.LENGTH_LONG).show();
				Intent intent =new Intent(MainActivity.this,Details.class);
				intent.putExtra("arg",s.toString());
				startActivity(intent);
			}
		});

		



	}


	public class MyAdapter extends ArrayAdapter<String>
	{
		MyAdapter(Context context,String[]names)
		{
			super(context,R.layout.entry,names);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent)
		{
			LayoutInflater inflater=LayoutInflater.from(getContext());
			View view=inflater.inflate(R.layout.entry,parent,false);
			String name=getItem(position);
			ImageView imgView=(ImageView) view.findViewById(R.id.entryImage);
			TextView txtView=(TextView)view.findViewById(R.id.entryText);
			txtView.setText(name);
			imgView.setImageResource(img[position]);
			return view;
		}

		
    }
	

	@Override
	public void onBackPressed()
	{
		finishAffinity();
		finish();
	}
}

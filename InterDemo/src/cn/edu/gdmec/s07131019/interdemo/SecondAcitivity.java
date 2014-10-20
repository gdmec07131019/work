package cn.edu.gdmec.s07131019.interdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondAcitivity extends Activity {
	TextView myTv;

	protected void onCreat(Bundle saveInstanceState){
		super.onCreate(saveInstanceState);
		setContentView(R.layout.second);
		myTv =(TextView) findViewById(R.id.textView1);
		String msg =getIntent().getExtras().getString("para1");
		myTv.setText(msg);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	}

}
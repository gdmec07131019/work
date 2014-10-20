package cn.edu.gdmec.s07131019.interdemo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText myEt;
	Button myBtn;
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myBtn=(Button)findViewById(R.id.button1);
        myEt =(EditText)findViewById(R.id.editText1);
        myBtn.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent myIntent =new Intent(MainActivity,this,SecondAcitivity.class);
        		startActivity(myIntent);
        	}
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

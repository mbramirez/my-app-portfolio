package com.mbramirez.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Called when the user touches the button */
    public void sendToast(View view) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;

        CharSequence text = null;

        if(view == findViewById(R.id.button_spotify)) {
            text = "You clicked to view my Spotify App";
        }
        else if(view == findViewById(R.id.button_scores)) {
            text = "You clicked to view my Scores App";
        }
        else if(view == findViewById(R.id.button_library)) {
            text = "You clicked to view my Library App";
        }
        else if(view == findViewById(R.id.button_big)) {
            text = "You clicked to view my Build It Bigger App";
        }
        else if(view == findViewById(R.id.button_xyz)) {
            text = "You clicked to view my XYZ Reader App";
        }
        else if(view == findViewById(R.id.button_cap)) {
            text = "You clicked to view my Capstone App";
        }

        Toast.makeText(context, text, duration).show();
    }
}

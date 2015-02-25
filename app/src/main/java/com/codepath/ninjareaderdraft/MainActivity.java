package com.codepath.ninjareaderdraft;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;


public class MainActivity extends ActionBarActivity {
    private String TAG = this.getClass().getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setUpListFragment();
    }

    public void setUpListFragment() {
        // Begin the transaction
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        ReadingListFragment fragment = ReadingListFragment.newInstance("", "");
        // Replace the container with the new fragment
        ft.replace(R.id.frame_main, fragment);
        // or ft.add(R.id.your_placeholder, new FooFragment());
        // Execute the changes specified
        ft.commit();
    }

    public void setUpArticleFragment() {
        // Begin the transaction
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        ArticleFragment fragment = ArticleFragment.newInstance("", "");
        // Replace the container with the new fragment
        ft.replace(R.id.frame_main, fragment);
        // or ft.add(R.id.your_placeholder, new FooFragment());
        // Execute the changes specified
        ft.commit();

        ((TextView) findViewById(R.id.tvNinjaTitle)).setText("");
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

        return super.onOptionsItemSelected(item);
    }
}

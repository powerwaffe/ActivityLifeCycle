package edu.dtcc.spaol1.activitylifecycle;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    // Log name to be displayed in logcat
    private static final String TAG = "Sean";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Toast message
        Toast.makeText(getApplicationContext(), "Creating", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onCreate(Bundle) called");

        // Snackbar message
        Snackbar.make(findViewById(android.R.id.content), "Creating...", Snackbar.LENGTH_LONG)
                .show();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Snackbar.make(view, "Blah", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart()
    {
        // Toast message
        Toast.makeText(getApplicationContext(), "Starting...", Toast.LENGTH_LONG).show();
        super.onStart();
        Log.d(TAG, "onStart() called");

        // Snackbar message
        Snackbar.make(findViewById(android.R.id.content), "Starting...", Snackbar.LENGTH_LONG)
                .show();
    }

    @Override
    protected void onResume()
    {
        // Toast message
        Toast.makeText(getApplicationContext(), "Resuming", Toast.LENGTH_LONG).show();
        super.onResume();
        Log.d(TAG, "onResume() called");

        // Snackbar message
        Snackbar.make(findViewById(android.R.id.content), "Resuming...", Snackbar.LENGTH_LONG)
                .show();
    }

    @Override
    protected void onPause()
    {
        // Toast message
        Toast.makeText(getApplicationContext(), "Pausing", Toast.LENGTH_LONG).show();
        super.onPause();
        Log.d(TAG, "onPause() called");

        // Snackbar message
        Snackbar.make(findViewById(android.R.id.content), "Pausing...", Snackbar.LENGTH_LONG)
                .show();
    }

    @Override
    protected void onStop()
    {
        // Toast message
        Toast.makeText(getApplicationContext(), "Stopping", Toast.LENGTH_LONG).show();
        super.onStop();
        Log.d(TAG, "onStop() called");

        // Snackbar message
        Snackbar.make(findViewById(android.R.id.content), "Stopping...", Snackbar.LENGTH_LONG)
                .show();
    }

    @Override
    protected void onRestart()
    {
        // Toast message
        Toast.makeText(getApplicationContext(), "Restarting", Toast.LENGTH_LONG).show();
        super.onRestart();
        Log.d(TAG, "onRestart() called");

        // Snackbar message
        Snackbar.make(findViewById(android.R.id.content), "Restarting...", Snackbar.LENGTH_LONG)
                .show();
    }

    @Override
    protected void onDestroy()
    {
        // Toast message
        Toast.makeText(getApplicationContext(), "Destroying", Toast.LENGTH_LONG).show();
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");

        // Snackbar message
        Snackbar.make(findViewById(android.R.id.content), "Destroying...", Snackbar.LENGTH_LONG)
                .show();
    }
}

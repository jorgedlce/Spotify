package music.spotify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Onclick(View v){

        //Toast.makeText(this,"Holaa",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MyMusic.class);
        startActivity(intent);

    }
}

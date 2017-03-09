package te.queremos.beni.ejemplo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Emilio on 04/03/2017.
 */

public class Pantalla1 extends AppCompatActivity /*implements View.OnClickListener*/{

    private Button btPantalla1;

    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        //setContentView(R.layout.pantalla1);
        /*mapui();
        init();*/
    }

    /*private void mapui() {
        btPantalla1 = (Button) findViewById(R.id.btPantalla1);
    }

    private void init() {
        btPantalla1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if(id == btPantalla1.getId()){
            Intent intent = new Intent(getApplicationContext(), Pantalla2.class);
            startActivity(intent);
        }
    }*/
}

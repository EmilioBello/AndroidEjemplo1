package te.queremos.beni.ejemplo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Emilio on 05/03/2017.
 */

public class Pantalla2 extends AppCompatActivity {

    private Button btPantalla2;
    private TextView tvPantalla2;

    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.pantalla2);
        mapui();
        init();
    }

    private void mapui() {
        btPantalla2 = (Button) findViewById(R.id.btPantalla2);
        tvPantalla2 = (TextView) findViewById(R.id.tvPantalla2);
    }

    private void init() {
        btPantalla2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvPantalla2.setText("El boton ha sido pulsado");
            }
        });
    }
}

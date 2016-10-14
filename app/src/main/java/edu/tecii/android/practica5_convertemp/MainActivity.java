package edu.tecii.android.practica5_convertemp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.inputgr)
    EditText inputgr;
    @Bind(R.id.btnConvertion)
    Button btnConvertion;
    @Bind(R.id.inputF)
    TextView inputF;
    @Bind(R.id.inputK)
    TextView inputK;
    @Bind(R.id.inputR)
    TextView inputR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnConvertion)
    public void convertiontemp(){
        String gradcent = inputgr.getText().toString();
        if (!gradcent.isEmpty()){
            double c = Double.parseDouble(gradcent);
            double fgr, kgr, rgr;
            int f, k, r;

            fgr = ((9*c)/5)+32;
            kgr = 273+c;
            rgr = 9*(273+c)/5;

            f = (int)(fgr);
            k = (int)(kgr);
            r = (int)(rgr);

            String gf = "";
            String gk = "";
            String gr = "";
            gf = "La temperatura equivalente en grados fahrenheit es: " + f + "°";
            gk = "La temperatura equivalente en grados kelvin es: " + k + "°";
            gr = "La temperatura equivalente en grados rankine es: " + r + "°";

            inputF.setText(gf);
            inputK.setText(gk);
            inputR.setText(gr);
        }
    }

}

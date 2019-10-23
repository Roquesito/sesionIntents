package unapiquitos.edu.pe.sesionintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogin;
    EditText txt_user, txt_pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button)findViewById(R.id.btnLogin);
        txt_user = (EditText)findViewById(R.id.usuario);
        txt_pwd = (EditText)findViewById(R.id.pwd);

        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        String user = txt_user.getText().toString();
        String pwd = txt_pwd.getText().toString();

        if(!user.isEmpty() && !pwd.isEmpty()){

            Intent ilogin = new Intent(this, SegundaActivity.class);
            ilogin.putExtra("valorUser",user);
            startActivity(ilogin);

        }



    }


}

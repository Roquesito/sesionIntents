package unapiquitos.edu.pe.sesionintents;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SegundaActivity extends AppCompatActivity {

    TextView txt_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Bundle extras = getIntent().getExtras();
        String usuario = extras.getString("valorUser");

        txt_user = (TextView)findViewById(R.id.txt_bienvenida);

        txt_user.setText("Bienvenido " +usuario);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mnu, menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.added:
                Toast.makeText(this,"Menu Agregar", Toast.LENGTH_LONG).show();
                return true;
            case R.id.edit:
                Toast.makeText(this,"Menu Editar", Toast.LENGTH_LONG).show();
                return true;
            case R.id.delete:
                Toast.makeText(this,"Menu Borrar", Toast.LENGTH_LONG).show();
                return true;
            case R.id.exit:
                Toast.makeText(this,"Menu Salir", Toast.LENGTH_LONG).show();
                return true;

            default:
                    return super.onOptionsItemSelected(item);

        }

    }
}

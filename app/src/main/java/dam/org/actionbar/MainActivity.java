package dam.org.actionbar;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creo un objeto ActionBar
        ActionBar actionBar = getActionBar();
        //Le digo a mi action bar que el modo de navegación sea por pestañas
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        //Oculto el título del action bar
        actionBar.setDisplayShowTitleEnabled(false);

        //Creo dos pestañas y les pongo título.
        ActionBar.Tab tabCuadrado = actionBar.newTab().setText("Cuadrado");
        ActionBar.Tab tabCirculo = actionBar.newTab().setText("Circulo");

        //Creo dos objetos Frament, uno para cada pestaña.
        Fragment fragTabcuadrado = new CuadradoFragment();
        Fragment fragTabCirculo = new CirculoFragment();

        //Creo los listeners para las pestañas del action bar
        tabCuadrado.setTabListener(new MiTabListener(fragTabcuadrado));
        tabCirculo.setTabListener(new MiTabListener(fragTabCirculo));

        //Añado las dos pestañas al action bar
        actionBar.addTab(tabCuadrado);
        actionBar.addTab(tabCirculo);

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

        return super.onOptionsItemSelected(item);
    }
}

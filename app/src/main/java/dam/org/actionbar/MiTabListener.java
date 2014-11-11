package dam.org.actionbar;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;

public class MiTabListener implements ActionBar.TabListener {

    private Fragment fragment;

    public MiTabListener(Fragment frag){
        this.fragment = frag;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        ft.replace(R.id.contenedor, fragment);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        ft.remove(fragment);
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}

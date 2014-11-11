package dam.org.actionbar;

import android.app.Fragment;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class CirculoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.circulo_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Creo un objeto LinearLayout y le asigno el layout que tengo en su XML
        LinearLayout layout = (LinearLayout) view.findViewById(R.id.circuloLayout);
        //Añado al layout una vista que será un objeto Circulo que dibuja un círculo.
        layout.addView(new Circulo(view.getContext()));
    }

    //Clase que dibuja un círculo
    public class Circulo extends View{

        public Circulo(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Paint pincel = new Paint();
            pincel.setColor(Color.BLUE);
            canvas.drawCircle(150,200,100,pincel);
        }
    }
}

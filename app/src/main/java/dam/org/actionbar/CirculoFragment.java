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

/**
 * Created by alumno on 06/11/2014.
 */
public class CirculoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.circulo_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LinearLayout layout = (LinearLayout) view.findViewById(R.id.circuloLayout);
        layout.addView(new Circulo(view.getContext()));
    }

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

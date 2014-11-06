package dam.org.actionbar;

/**
 * Created by alumno on 06/11/2014.
 */

import android.app.Fragment;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class CuadradoFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.cuadrado_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LinearLayout relativeLayout = (LinearLayout) view.findViewById(R.id.cuadradoLayout);
        relativeLayout.addView(new Cuadrado(getActivity()));

    }

    private class Cuadrado extends View{

        public Cuadrado(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            Paint paint = new Paint();
            paint.setColor(Color.BLUE);
            Rect rect = new Rect(100, 100, 200, 200);
            canvas.drawRect(rect, paint);
        }
    }

}

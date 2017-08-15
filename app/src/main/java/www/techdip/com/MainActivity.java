package www.techdip.com;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import www.techdip.com.fragments.Fragment1;
import www.techdip.com.fragments.R;

public class MainActivity extends AppCompatActivity implements Fragment1.OnHeadlineSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeFragment(View view) {
        Fragment fragment = null;
        if (view == findViewById(R.id.imageButton)) {
            fragment= new Fragment1();

        } else if (view == findViewById(R.id.imageButton2)){
            fragment= new Fragment1();
        }
        FragmentManager fm=getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment_place,fragment);
        ft.commit();
    }

    @Override
    public void onArticleSelected(int position) {
        Toast.makeText(this, String.valueOf(position), Toast.LENGTH_SHORT).show();
        TextView textView=(TextView)findViewById(R.id.mtext);
        textView.setText("qsdmlfk");
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}

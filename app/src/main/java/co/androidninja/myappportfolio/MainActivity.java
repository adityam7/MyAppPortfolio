package co.androidninja.myappportfolio;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.popular_movies:
                showMessage(R.string.popular_movies);
                break;
            case R.id.stock_hawk:
                showMessage(R.string.stock_hawk);
                break;
            case R.id.build_it_bigger:
                showMessage(R.string.build_it_bigger);
                break;
            case R.id.make_material:
                showMessage(R.string.make_material);
                break;
            case R.id.go_ubiquitous:
                showMessage(R.string.go_ubiquitous);
                break;
            case R.id.capstone:
                showMessage(R.string.capstone);
                break;
        }
    }

    void showMessage(@StringRes int stringResource) {
        Toast.makeText(this, stringResource, Toast.LENGTH_SHORT).show();
    }

}

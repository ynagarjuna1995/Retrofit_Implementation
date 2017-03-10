package io.github.ynagarjuna1995.retrofitimplementation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;
import io.github.ynagarjuna1995.retrofitimplementation.albumLite.AlbumLite;
import io.github.ynagarjuna1995.retrofitimplementation.albumViewer.AlbumViewer;
import io.github.ynagarjuna1995.retrofitimplementation.firerealm.FireRealm;
import io.github.ynagarjuna1995.retrofitimplementation.firetube.FireTube;

import static io.github.ynagarjuna1995.retrofitimplementation.common.ActivityUtils.changeScreenintent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.albumLite,R.id.albumViewer,R.id.fireRealm,R.id.fireTube})
    public void changeScreen(View view){
        switch (view.getId()) {
            case R.id.albumLite:
                changeScreenintent(view.getContext(), AlbumLite.class);
                break;
            case R.id.albumViewer:
                changeScreenintent(view.getContext(), AlbumViewer.class);
                break;
            case R.id.fireRealm:
                changeScreenintent(view.getContext(), FireRealm.class);
                break;
            case R.id.fireTube:
                changeScreenintent(view.getContext(), FireTube.class);
                break;
        }
    }
}

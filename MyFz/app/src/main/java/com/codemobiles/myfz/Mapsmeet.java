package com.codemobiles.myfz;

        import android.app.Activity;
        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.support.design.widget.FloatingActionButton;
        import android.support.design.widget.Snackbar;
        import android.support.v7.app.ActionBar;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.Button;
        import android.app.Activity;
        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.view.View;

        import com.codemobiles.myfz.R;
        import static android.R.id.home;

        import android.os.Bundle;
        import android.support.v4.app.FragmentActivity;

        import com.google.android.gms.maps.CameraUpdateFactory;
        import com.google.android.gms.maps.GoogleMap;
        import com.google.android.gms.maps.SupportMapFragment;
        import com.google.android.gms.maps.model.BitmapDescriptorFactory;
        import com.google.android.gms.maps.model.LatLng;
        import com.google.android.gms.maps.model.MarkerOptions;

        import android.content.Context;
        import android.location.Location;
        import android.location.LocationListener;
        import android.location.LocationManager;



public class Mapsmeet extends AppCompatActivity {

    protected LocationManager locationManager;
    protected LocationListener locationListener;

    // Google Map
    private GoogleMap googleMap;

    // Latitude & Longitude
    private Double Latitude = 13.7641642;
    private Double Longitude = 100.5363301;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showmaps);

        Latitude = 13.7641642;
        Longitude = 100.5363301;

        if (Latitude > 0 && Longitude > 0) {
            //*** Display Google Map
            googleMap = ((SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.map)).getMap();

            //*** Focus & Zoom
            LatLng coordinate = new LatLng(Latitude, Longitude);
            googleMap.setMapType(com.google.android.gms.maps.GoogleMap.MAP_TYPE_HYBRID);
            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinate, 17));

            //*** Marker
            String toolTip = String.format("Your Location Lat=%s, Lon=%s", Latitude, Longitude);
            MarkerOptions marker = new MarkerOptions().position(new LatLng(Latitude, Longitude)).title(toolTip);
            googleMap.addMarker(marker);

        }

        //test map
        Button buttonIntent = (Button) findViewById(R.id.buttonIntent);
        buttonIntent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Uri gmmIntentUri = Uri.parse("google.navigation:q=13.7641642,100.5363301");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

        //test map
        Button button1 = (Button) findViewById(R.id.buttonIntent);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Uri gmmIntentUri = Uri.parse("google.navigation:q=13.7641642,100.5363301");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

        //test next1
        Button button2 = (Button) findViewById(R.id.next1);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Phonenumber.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return false;
    }

    public class LinkButtons extends Activity {

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.showmaps);
        }

        public void goToSo(View view) {
            goToUrl("http://www.rajavithi.go.th/");
        }

        private void goToUrl(String url) {
            Uri uriUrl = Uri.parse(url);
            Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
            startActivity(launchBrowser);
        }

    }
}

package ms.sapientia.gaitbiometricsapp.controller.activityes;

import android.content.Context;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import ms.sapientia.gaitbiometricsapp.R;
import ms.sapientia.gaitbiometricsapp.controller.fragments.FirebaseAuthenticationFragment;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";
    private final Context context = MainActivity.this;
    private Button mExitButton;
    private TextView mTitleTextView;
    private Button mFirebaseAuthButton;
    private Button mGaitAuthButton;
    private final String SUCCESS_MARK = "succmarc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindView();
        initTexts();
        bindOnClicks();

    }

    private void bindView() {
        mExitButton = findViewById(R.id.button_exit);
        mTitleTextView = findViewById(R.id.text_title);
        mFirebaseAuthButton = findViewById(R.id.button_firebase_auth);
        mGaitAuthButton = findViewById(R.id.button_gait_auth);
    }

    private void initTexts(){
        mTitleTextView.setText(getString(R.string.main_title));
        mFirebaseAuthButton.setText(getString(R.string.main_firebase_auth));
        mGaitAuthButton.setText(getString(R.string.main_gait_auth));
    }

    private void bindOnClicks() {
        mExitButton.setOnClickListener(exitButtonOnClickListener);
        mFirebaseAuthButton.setOnClickListener(firebaseButtonOnClickListener);
        mGaitAuthButton.setOnClickListener(gaitButtonOnClickListener);
    }

    //region View.OnClickListener exitButtonOnClickListener ...
    private View.OnClickListener exitButtonOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.i(TAG,"Exit button pressed.");
            finish();
        }
    };
    //endregion

    //region View.OnClickListener firebaseButtonOnClickListener ...
    private View.OnClickListener firebaseButtonOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.i(TAG,"Firebase Auth button pressed.");
            //Bundle args = new Bundle();
            //args.putParcelable("my_custom_objects_key", myObject);
            FirebaseAuthenticationFragment fragment = new FirebaseAuthenticationFragment();
            //fragment.setArguments(args);
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.activity_main_container, fragment);
            transaction.commit();
            mExitButton.setVisibility(View.INVISIBLE);  // TODO: Why I have to hide it manually? (1)
        }
    };
    //endregion

    //region View.OnClickListener gaitButtonOnClickListener ...
    private View.OnClickListener gaitButtonOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.i(TAG,"Gait auth button pressed.");

            // TODO: START FRAGMENT
            Toast.makeText(context,"YAP", Toast.LENGTH_SHORT).show();
        }
    };
    //endregion ...


    @Override
    public void onResume(){
        super.onResume();
        mExitButton.setVisibility(View.VISIBLE);    // TODO: Why I have to hide it manually? (2)
        Log.i(TAG,"onResume");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.i(TAG,"onPause");
    }
}

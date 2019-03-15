package ms.sapientia.gaitbiometricsapp.controller.activityes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

import ms.sapientia.gaitbiometricsapp.R;
import ms.sapientia.gaitbiometricsapp.controller.fragments.FirebaseAuthenticationFragment;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";
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
        setClickListeners();

    }

    private void bindView() {
        mExitButton = findViewById(R.id.button_exit);
        mTitleTextView = findViewById(R.id.text_title);
        mFirebaseAuthButton = findViewById(R.id.button_firebase_auth);
        mGaitAuthButton = findViewById(R.id.button_gait_auth);
    }

    private void setClickListeners() {
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

            // TODO: START FRAGMENT WITH RESULT (result: TAGged in state)
        }
    };
    //endregion

    //region View.OnClickListener gaitButtonOnClickListener ...
    private View.OnClickListener gaitButtonOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.i(TAG,"Gait auth button pressed.");

            // TODO: START FRAGMENT WITH RESULT (result: TAGged in state)
        }
    };
    //endregion ...

}

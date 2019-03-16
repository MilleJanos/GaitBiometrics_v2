package ms.sapientia.gaitbiometricsapp.controller.fragments;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import ms.sapientia.gaitbiometricsapp.R;
import ms.sapientia.gaitbiometricsapp.controller.activityes.MainActivity;

public class FirebaseAuthenticationFragment extends Fragment {

    private FirebaseAuthenticationViewModel mViewModel;
    private Button mBackButton;
    private TextView mTitleTextView;
    private EditText mFieldEditText0;   // email
    private EditText mFieldEditText1;   // password
    private EditText mFieldEditText2;   // password (re-enter)
    private Button mMainButton;
    private Button mAdditionalButton0;
    private Button mAdditionalButton1;
    private Button mAdditionalButton2;


    public static FirebaseAuthenticationFragment newInstance() {
        return new FirebaseAuthenticationFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.firebase_authentication_fragment, container, false);
        bindView(view);
        bindOnClicks();
        initTexts();

        return view;
    }



    private void bindView(View view) {
        mBackButton = view.findViewById(R.id.button_back);
        mTitleTextView = view.findViewById(R.id.text_title);
        mFieldEditText0 = view.findViewById(R.id.edit_text_0);
        mFieldEditText1 = view.findViewById(R.id.edit_text_1);
        mFieldEditText2 = view.findViewById(R.id.edit_text_2);
        mMainButton = view.findViewById(R.id.button_main);
        mAdditionalButton0 = view.findViewById(R.id.button_additional_0);
        mAdditionalButton1 = view.findViewById(R.id.button_additional_1);
        mAdditionalButton2 = view.findViewById(R.id.button_additional_2);
    }

    private void initTexts() {
        mTitleTextView.setText(getString(R.string.firebase_auth_login_title));
        mFieldEditText0.setHint(getString(R.string.firebase_auth_login_field_1));
        mFieldEditText1.setHint(getString(R.string.firebase_auth_login_field_2));
        mFieldEditText2.setVisibility(View.GONE);
        mMainButton.setText(getString(R.string.firebase_auth_login_main_button));
        mAdditionalButton0.setText(getString(R.string.firebase_auth_login_additional_button_1));
        mAdditionalButton1.setText(getString(R.string.firebase_auth_login_additional_button_2));
        mAdditionalButton2.setVisibility(View.GONE);
    }

    private void bindOnClicks() {
        mBackButton.setOnClickListener(backButtonOnClickListener);
        mMainButton.setOnClickListener(loginOnClickListener);
        mAdditionalButton0.setOnClickListener(gotoRegisterOnClickListener);
        mAdditionalButton1.setOnClickListener(forgotPasswordOnClickListener);
    }

    //region View.OnClickListener backButtonOnClickListener
    private View.OnClickListener backButtonOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            closeFragment();
        }
    };
    //endregion

    //region View.OnClickListener loginOnClickListener
    private View.OnClickListener loginOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            // TODO: Login
            Toast.makeText(getActivity(),"login", Toast.LENGTH_SHORT).show();

        }
    };
    //endregion

    //region View.OnClickListener registerOnClickListener
    private View.OnClickListener registerOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            // TODO: Register
            Toast.makeText(getActivity(),"register main button", Toast.LENGTH_SHORT).show();

        }
    };
    //endregion

    //region View.OnClickListener gotoRegisterOnClickListener
    private View.OnClickListener gotoRegisterOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            // TODO: goto Register (create account small button)
            Toast.makeText(getActivity(),"go to register", Toast.LENGTH_SHORT).show();

        }
    };
    //endregion

    //region View.OnClickListener forgotPasswordOnClickListener
    private View.OnClickListener forgotPasswordOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            // TODO: forgot password (small button)
            Toast.makeText(getActivity(),"forgot pass", Toast.LENGTH_SHORT).show();

        }
    };
    //endregion

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(FirebaseAuthenticationViewModel.class);
        // TODO: Use the ViewModel
    }

    private void closeFragment(){
        getActivity().getSupportFragmentManager().beginTransaction().remove(FirebaseAuthenticationFragment.this).commit();
    }

}

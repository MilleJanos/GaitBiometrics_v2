package ms.sapientia.gaitbiometricsapp.controller.fragments;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ms.sapientia.gaitbiometricsapp.R;

public class FirebaseAuthenticationFragment extends Fragment {

    private FirebaseAuthenticationViewModel mViewModel;

    public static FirebaseAuthenticationFragment newInstance() {
        return new FirebaseAuthenticationFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.firebase_authentication_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(FirebaseAuthenticationViewModel.class);
        // TODO: Use the ViewModel
    }

}

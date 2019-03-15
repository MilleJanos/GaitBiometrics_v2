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

public class GaitAuthenticationFragment extends Fragment {

    private GaitAuthenticationViewModel mViewModel;

    public static GaitAuthenticationFragment newInstance() {
        return new GaitAuthenticationFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.gait_authentication_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(GaitAuthenticationViewModel.class);
        // TODO: Use the ViewModel
    }

}

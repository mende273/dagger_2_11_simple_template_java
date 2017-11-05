package com.jumrukovski.dagger_2_11_simple_template_java.fragment;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jumrukovski.dagger_2_11_simple_template_java.R;
import com.jumrukovski.dagger_2_11_simple_template_java.base.BaseFragment;
import com.jumrukovski.dagger_2_11_simple_template_java.databinding.FragmentMainBinding;

import javax.inject.Inject;

public class MainFragment extends BaseFragment implements View.OnClickListener {

    private static final String TEXT_VALUE = "value";

    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        return fragment;
    }

    @Inject
    SharedPreferences pref;

    private FragmentMainBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onResume() {
        super.onResume();
        init();
        setData();
    }

    @Override
    public void onPause() {
        super.onPause();
        removeListeners();
    }

    private void init() {
        setListeners();
    }

    private void setListeners() {
        binding.btnAddValue.setOnClickListener(this);
    }

    private void removeListeners() {
        binding.btnAddValue.setOnClickListener(null);
    }

    private void setData() {
        binding.textSavedValue.setText(getValue());
    }

    private void addValue(String value) {
        pref.edit()
                .putString(TEXT_VALUE, value)
                .apply();
    }

    private String getValue() {
        return pref.getString(TEXT_VALUE, "No value saved yet");
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.btn_add_value) {
            addValue(binding.editText.getText().toString());
            setData();
        }
    }
}

package com.joshcarreer.android.criminalintent;

import java.util.UUID;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;

public class CrimeFragment extends Fragment {
	public static final String EXTRA_CRIME_ID =
			"com.joshcarreer.android.criminalintent.crime_id";
	private Crime mCrime;
	private EditText mTitleField;
	private Button mDateButton;
	private CheckBox mSolvedCheckBox;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		UUID crimeId = (UUID)getArguments().getSerializable(EXTRA_CRIME_ID);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent,
			Bundle savedInstanceState) {
				View v = inflater.inflate(R.layout.fragment_crime, parent, false);
				
					mTitleField = (EditText)v.findViewById(R.id.crime_title);
					mTitleField.setText(mCrime.getmTitle());
					mTitleField.addTextChangedListener(new TextWatcher() {
				public void onTextChanged(
						CharSequence c, int start, int before, int count) {mCrime.setmTitle(c.toString());
				}
				public void beforeTextChanged(
						CharSequence c, int start, int count, int after){ // This space intentionally left blank
				}
				public void afterTextChanged(Editable c) {
				// This one too
				}
				});
				mDateButton = (Button)v.findViewById(R.id.crime_date);
				mDateButton.setText(mCrime.getmDate().toString());
				mDateButton.setEnabled(false);
					
				mSolvedCheckBox =(CheckBox)v.findViewById(R.id.crime_solved);
				mSolvedCheckBox.setChecked(mCrime.ismSolved());
				mSolvedCheckBox.setOnCheckedChangeListener(new 
						OnCheckedChangeListener(){
					public void onCheckedChanged (CompoundButton 
							buttonView, boolean isChecked){
						mCrime.setmSolved(isChecked);
					}
				});	
					
				return v;
	}
	public static CrimeFragment newInstance(UUID crimeId) {
		Bundle args = new Bundle();
		args.putSerializable(EXTRA_CRIME_ID, crimeId);
		CrimeFragment fragment = new CrimeFragment();
		fragment.setArguments(args);
		return fragment;
		}

	}


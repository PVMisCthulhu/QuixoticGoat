package com.example.clinicdashboard;

import java.sql.SQLException;

import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class PopClinicSpinnerTask extends AsyncTask<Void, Void, Void>
{
	private ActionBarActivity activity = null;
	private String[] clinics = null;
	
	public PopClinicSpinnerTask(ActionBarActivity a)
	{
		activity = a;
	}
	
	@Override
	protected Void doInBackground(Void... arg0) 
	{
        DataAccess da = new DataAccess();                        
        
        try 
        {
			clinics = da.getClinicsForPractice();										
		} 
        catch (SQLException|ClassNotFoundException e) 
        {
			e.printStackTrace();			
		}   
        
        return null;
	}
	
	@Override
	protected void onPostExecute(Void arg0)
	{
		Spinner s = (Spinner)(activity.findViewById(R.id.clinicSpinner));		
		ArrayAdapter<?> aa = new ArrayAdapter<Object>(activity, android.R.layout.simple_spinner_dropdown_item, clinics);
		s.setAdapter(aa);		
	}
}

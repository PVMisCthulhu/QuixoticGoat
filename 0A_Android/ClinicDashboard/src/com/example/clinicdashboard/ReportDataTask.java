package com.example.clinicdashboard;

import java.sql.SQLException;

import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class ReportDataTask  extends AsyncTask<Void, Void, Void> 
{
	private ActionBarActivity activity = null;
	
	private static int totalVisits = 0;
	private static int patientsInClinic = 0;	
	
	public ReportDataTask(ActionBarActivity a)
	{
		activity = a;
	}
	
	
	
	@Override
	protected Void doInBackground(Void... arg0) 
	{
        DataAccess da = new DataAccess();                        
        
        try 
        {
			totalVisits = da.getTotalVisitsForClinic();		
			patientsInClinic = da.getPatientsInClinic();
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
		TextView tv = (TextView)(activity.findViewById(R.id.totalVisitsCountTextView));
		TextView tv2 = (TextView)(activity.findViewById(R.id.totalInClinicCountTextView));
		tv.setText(Integer.toString(totalVisits));
		tv2.setText(Integer.toString(patientsInClinic));
	}	
}

package AP2006;

import java.util.ArrayList;

public class DailySchedule
{
    private ArrayList<Appointment> apptList;
    public DailySchedule()
    {
        apptList = new ArrayList<>();
    }

    public void clearConflicts(Appointment apt)
    {
        for(int i = 0; i < apptList.size(); i++)
        {
            if(apptList.get(i).conflictsWith(apt))
            {
                apptList.remove(i);
                i--;
            }
        }
    }

    public boolean addApt(Appointment apt, boolean emergency)
    {
        if(emergency)
        {
            clearConflicts(apt);
            apptList.add(apt);
            return true;
        }
        else
        {
            for(Appointment a : apptList)
            {
                if(a.conflictsWith(apt))
                {
                    return false;
                }
            }
            apptList.add(apt);
            return true;
        }
    }
}

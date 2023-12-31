package myintegrator.msproject.model;

import java.util.Date;

public class Resource {
	public int UID;
	public int ID;
	public int Type;
	public int IsNull;
	public int WorkGroup;
	public double MaxUnits;
	public double PeakUnits;
	public int OverAllocated;
	public int CanLevel;
	public int AccrueAt;
	public String Work;
	public String RegularWork;
	public String OvertimeWork;
	public String ActualWork;
	public String RemainingWork;
	public String ActualOvertimeWork;
	public String RemainingOvertimeWork;
	public int PercentWorkComplete;
	public int StandardRate;
	public int StandardRateFormat;
	public int Cost;
	public int OvertimeRate;
	public int OvertimeRateFormat;
	public int OvertimeCost;
	public int CostPerUse;
	public int ActualCost;
	public int ActualOvertimeCost;
	public int RemainingCost;
	public int RemainingOvertimeCost;
	public double WorkVariance;
	public int CostVariance;
	public double SV;
	public double CV;
	public double ACWP;
	public int CalendarUID;
	public double BCWS;
	public double BCWP;
	public int IsGeneric;
	public int IsInactive;
	public int IsEnterprise;
	public int BookingType;
	public Date CreationDate;
	public int IsCostResource;
	public int IsBudget;
}

package myintegrator.msproject.model;

import lombok.Data;
import myintegrator.msproject.model.Assignment;
import myintegrator.msproject.model.Resource;
import myintegrator.msproject.model.Task;

import java.util.Date;
import java.util.List;

@Data
public class Project {
	public int SaveVersion;
	public String Name;
	public String Title;
	public Date CreationDate;
	public Date LastSaved;
	public int ScheduleFromStart;
	public Date StartDate;
	public Date FinishDate;
	public int FYStartDate;
	public int CriticalSlackLimit;
	public int CurrencyDigits;
	public String CurrencySymbol;
	public String CurrencyCode;
	public int CurrencySymbolPosition;
	public int CalendarUID;
	public Date DefaultStartTime;
	public Date DefaultFinishTime;
	public int MinutesPerDay;
	public int MinutesPerWeek;
	public int DaysPerMonth;
	public int DefaultTaskType;
	public int DefaultFixedCostAccrual;
	public int DefaultStandardRate;
	public int DefaultOvertimeRate;
	public int DurationFormat;
	public int WorkFormat;
	public int EditableActualCosts;
	public int HonorConstraints;
	public int InsertedProjectsLikeSummary;
	public int MultipleCriticalPaths;
	public int NewTasksEffortDriven;
	public int NewTasksEstimated;
	public int SplitsInProgressTasks;
	public int SpreadActualCost;
	public int SpreadPercentComplete;
	public int TaskUpdatesResource;
	public int FiscalYearStart;
	public int WeekStartDay;
	public int MoveCompletedEndsBack;
	public int MoveRemainingStartsBack;
	public int MoveRemainingStartsForward;
	public int MoveCompletedEndsForward;
	public int BaselineForEarnedValue;
	public int AutoAddNewResourcesAndTasks;
	public Date CurrentDate;
	public int MicrosoftProjectServerURL;
	public int Autolink;
	public int NewTaskStartDate;
	public int NewTasksAreManual;
	public int DefaultTaskEVMethod;
	public int ProjectExternallyEdited;
	public Date ExtendedCreationDate;
	public int ActualsInSync;
	public int RemoveFileProperties;
	public int AdminProject;
	public int UpdateManuallyScheduledTasksWhenEditingLinks;
	public int KeepTaskOnNearestWorkingTimeWhenMadeAutoScheduled;
	public Object OutlineCodes;
	public Object WBSMasks;
	public Object ExtendedAttributes;
	public Object Calendars;
	public  List<Task> Tasks;
	public List<Resource> Rescources;
	public List<Assignment> Assignments;
	public String xmlns;
	public String text;
}

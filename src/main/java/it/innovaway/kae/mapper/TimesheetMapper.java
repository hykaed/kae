package it.innovaway.kae.mapper;

import it.innovaway.kae.dto.TimesheetDto;
import it.innovaway.kae.model.Timesheet;

public interface TimesheetMapper {

	public Timesheet timesheetDtoToTimesheet(TimesheetDto timesheetDto);

	public TimesheetDto timesheetToTimesheetDto(Timesheet timesheet);
}

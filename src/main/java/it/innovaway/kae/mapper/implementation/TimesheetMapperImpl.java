package it.innovaway.kae.mapper.implementation;

import org.springframework.stereotype.Component;

import it.innovaway.kae.dto.TimesheetDto;
import it.innovaway.kae.mapper.TimesheetMapper;
import it.innovaway.kae.model.Employee;
import it.innovaway.kae.model.Task;
import it.innovaway.kae.model.Timesheet;

@Component
public class TimesheetMapperImpl implements TimesheetMapper {

	@Override
	public Timesheet timesheetDtoToTimesheet(TimesheetDto timesheetDto) {

		if (timesheetDto == null) {
			return null;
		}

		Timesheet timesheet = new Timesheet();
		timesheet.setId(timesheetDto.getTimesheetId());
		timesheet.setWorkDays(timesheetDto.getWorkDays());
		timesheet.setMonth(timesheetDto.getMonth());
		timesheet.setYear(timesheetDto.getYear());
		timesheet.setCost(timesheetDto.getCost());

		Employee employee = new Employee();
		employee.setId(timesheetDto.getEmployeeId());
		employee.setFirstName(timesheetDto.getEmployeeFirstName());
		employee.setLastName(timesheetDto.getEmployeeLastName());

		timesheet.setEmployee(employee);

		Task task = new Task();
		task.setId(timesheetDto.getTimesheetId());
		task.setName(timesheetDto.getTaskName());
		task.setStartDate(timesheetDto.getTaskStartDate());
		task.setEndDate(timesheetDto.getTaskEndDate());

		timesheet.setTask(task);

		return timesheet;
	}

	@Override
	public TimesheetDto timesheetToTimesheetDto(Timesheet timesheet) {

		if (timesheet == null) {
			return null;
		}

		TimesheetDto timesheetDto = new TimesheetDto();
		timesheetDto.setTimesheetId(timesheet.getId());
		timesheetDto.setWorkDays(timesheet.getWorkDays());
		timesheetDto.setMonth(timesheet.getMonth());
		timesheetDto.setYear(timesheet.getYear());
		timesheetDto.setCost(timesheet.getCost());
		timesheetDto.setEmployeeId(timesheet.getEmployee().getId());
		timesheetDto.setEmployeeFirstName(timesheet.getEmployee().getFirstName());
		timesheetDto.setEmployeeLastName(timesheet.getEmployee().getLastName());
		timesheetDto.setTaskId(timesheet.getTask().getId());
		timesheetDto.setTaskName(timesheet.getTask().getName());
		timesheetDto.setTaskStartDate(timesheet.getTask().getStartDate());
		timesheetDto.setTaskEndDate(timesheet.getTask().getEndDate());

		return timesheetDto;
	}

}

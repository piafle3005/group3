# USE CASE: 23 Report of the total population, population in cities, population not in cities, for all region.

## CHARACTERISTIC INFORMATION

### Goal in Context

As an employee that is working for an organisation that requires reporting on population information, I want to create a report of the total population, population in cities, population not in cities, for all regions.

### Scope

Organisation.

### Level

Primary task.

### Preconditions

Functionality of the reports. We don't require any input as this is just a complete list.

### Success End Condition

The report is available. Correct input and functionality of the required report(s).

### Failed End Condition

The report is not produced, and we didn't get the requested information about the population city/not city region information.

### Primary Actor

Employee of the organisation.

### Trigger

A request for regions population information is sent to the organisation the report is being made for.

## MAIN SUCCESS SCENARIO

1. Employee requests region population information for regions in the world.
2. Employee requests the city population information for the region.
3. Employee extracts current city information of the region.
4. Employee provides the report to organisation.

## EXTENSIONS

3. **Invalid continent.**:
    1. Employee is informed that the request is not valid.

## SUB-VARIATIONS

None.

## SCHEDULE

code review 1 or week 13 (submission of the whole project)
# USE CASE: 22 Report of the top N populated capital cities in a region where N is provided by the user.

## CHARACTERISTIC INFORMATION

### Goal in Context

As an employee that is working for an organisation that requires reporting on population information, I want to create a report of the top N populated capital cities in a given region, where N is provided by the user.

### Scope

Organisation.

### Level

Primary task.

### Preconditions

Valid entry of N.

### Success End Condition

The report is available. Correct input and functionality of the required report(s).

### Failed End Condition

The report is not produced, and we didn't get the requested information about the capital city population region information.

### Primary Actor

Employee of the organisation.

### Trigger

A request for regions capital city population information is sent to the organisation the report is being made for.

## MAIN SUCCESS SCENARIO

1. Employee requests region population information for regions in the world.
2. Employee requests the top N capital cities population information for the region.
3. Employee extracts current capital city information of the region.
4. Employee provides the report to organisation.

## EXTENSIONS

3. **Invalid continent.**:
    1. Employee is informed that the input of N is not valid.

## SUB-VARIATIONS

None.

## SCHEDULE

code review 1 or week 13 (submission of the whole project)
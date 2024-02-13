# USE CASE: 15 Report of all the top N populated cities in a district, where N is provided by the user.

## CHARACTERISTIC INFORMATION

### Goal in Context

As an employee that is working for an organisation that requires reporting on population information I want to create a report of all the top N populated cities in a specific district, with N provided by the user.

### Scope

Organisation.

### Level

Primary task.

### Preconditions

Valid entry of N.

### Success End Condition

The report is available. Correct input and functionality of the required report.

### Failed End Condition

The report is not produced, and we didn't get the requested information about the top N populated cities in a given region.

### Primary Actor

Employee of the organisation.

### Trigger

A request for cities' information is sent to the organisation the report is being made for.

## MAIN SUCCESS SCENARIO

1. Employee requests population's information about the top N populated cities in the given district.
2. Employee requests the N variable to get cities's information from.
3. Employee extracts current population's information of the given N number of cities from the district given.
4. Employee provides the report to organisation.

## EXTENSIONS

3. **Invalid continent.**:
    1. Employee is informed that the N variable and/or the district is invalid and report can't be produced.

## SUB-VARIATIONS

None.

## SCHEDULE

code review 1 or week 13 (submission of the whole project)
# USE CASE: 18 Report of top N capital cities in a country, where N is provided by the user.

## CHARACTERISTIC INFORMATION

### Goal in Context

As an employee that is working for an organisation that requires reporting on population information, I want to create a report of the top N capital cities in a country, where N is provided bt the user.
### Scope

Organisation.

### Level

Primary task.

### Preconditions

Valid entry of N.

### Success End Condition

The report is available. Correct input and functionality of the required report(s).

### Failed End Condition

The report is not produced, and we didn't get the requested information about the top N capital cities.

### Primary Actor

Employee of the organisation.

### Trigger

A request for all the top N capital cities in a country.

## MAIN SUCCESS SCENARIO

1. Employee requests country population information.
2. Employee requests the top N capital cities by population in the country.
3. Employee extracts the top N capital cities.
4. Employee provides the report to organisation.

## EXTENSIONS

3. **Invalid continent.**:
    1. Employee is informed that N is not valid.

## SUB-VARIATIONS

None.

## SCHEDULE

code review 1 or week 13 (submission of the whole project)
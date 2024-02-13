# USE CASE: 21 Report of the top N populated capital cities in a continent where N is provided by the user.

## CHARACTERISTIC INFORMATION

### Goal in Context

As an employee that is working for an organisation that requires reporting on population information, I want to create a report of the top N populated capital cities in a given continent, where N is provided by the user.

### Scope

Organisation.

### Level

Primary task.

### Preconditions

Valid entry of N.

### Success End Condition

The report is available. Correct input and functionality of the required report(s).

### Failed End Condition

The report is not produced, and we didn't get the requested information about the capital city population continent information.

### Primary Actor

Employee of the organisation.

### Trigger

A request for continents capital city population information is sent to the organisation the report is being made for.

## MAIN SUCCESS SCENARIO

1. Employee requests continent population information for continents in the world.
2. Employee requests the top N capital cities population information for the continent.
3. Employee extracts current capital city information of the continent.
4. Employee provides the report to organisation.

## EXTENSIONS

3. **Invalid continent.**:
    1. Employee is informed that the input of N is not valid.

## SUB-VARIATIONS

None.

## SCHEDULE

code review 1 or week 13 (submission of the whole project)
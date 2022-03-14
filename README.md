# WagesCalculator

An object oriented console application in Java, using IntelliJ IDEA developer environment to maintain and calculate wages of employees.

Data to store:
  • employee name
  • position (manager/worker)
  • required daily work hours
  • sum of work hours
  • sum of overtime hours
  
Payment data and calculation:
  • Manager
    o basic wage
    o overtime wage (hourly)
    o Wage: basic + (overtime * overtime wage)
  • Worker
    o hourly wage
    o overtime wage (hourly)
    o Wage: (basic work hours * hourly wage) + (overtime hours * overtime wage)
    
1. Read employee data from catalog file:
File structure:
name; position; required workhours; basic or hourly wage (based on position); overtime wage

2. Read daily work hours from an other data file. Please provide option to read more daily work hour files.
Daily work datafile:
name; workhours worked on a day
If worked hours (in a data row) exeeds daily required work hours, then register overtime hours.

3. Print current wages of employees in alphabetic order of employee name.

4. Create a new catalog file, which stores employees in original order (order of initial catalog), but storing updated sum hours. Structure is the same as initial catalog file.

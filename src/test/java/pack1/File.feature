Feature: Tester 
 
Scenario Outline: Team
Given the Tester name is "<Name>"
And the age is "<Age>" for Tester
And working on the Project "<ProjectName>"
Then he is a "<Designation>"
Examples:
|Name| Age| ProjectName|Designation|
|Raj|20|Yahoo|Tester|
|Ram|30|Google|Developer|
|Rose|35|Apple|BA|
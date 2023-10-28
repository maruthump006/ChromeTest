Feature: To Login in a FaceBook
Scenario Outline: To Login a User valid Email and PassWord
Given To launch a Browser and Minimize to a windows
When To get the FaceBook Url to lauch the chrome
And User Enter the FaceBook valid "<UserName>" UserName
And User Enter the FaceBook Valid "<PassWord>" PassWord
And User Click the Login btn
Then Close the Browser

Examples:
|UserName                         |PassWord     |
|maruthupandiyanveera@gamil.com   |maruthuMp66  |
|creationsmp3338@gmail.com        |MaruthuMp@360|
|9789173338                       |maruthump66  |
|Maruthump                        |978917338    |




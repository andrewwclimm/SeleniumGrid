First machine terminal: // in the place where you have selenium-server-standalone
java -jar selenium-server-standalone.141.59.jar -role hub


Second machine terminal :
java -Dwebdriver.chrome.driver="/Userandreiclim/Downloads/chromedriver.exe" -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub http://172.20.10.2:4444/grid/register
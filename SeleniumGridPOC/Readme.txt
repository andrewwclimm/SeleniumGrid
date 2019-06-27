// in the place where you have selenium-server-standalone
java -jar selenium-server-standalone.141.59.jar -role hub


java -Dwebdriver.chrome.driver="/Users/andreiclim/Downloads/chromedriver.exe" -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub http://172.20.10.2:4444/grid/register
(without port : accessed directly the port 5000)


Launch hub on both machines :

http://localhost:4444/grid/console
http://172.20.10.2:4444/grid/console

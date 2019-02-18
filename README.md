# ankuran-wages
Ankuran wages system


Sample endpoint URL: <br/>

Exception handling sample:
<pre>
curl -X GET \
  http://localhost:8080/wages/sample \
  -H 'Content-Type: application/json' \
  -d '{
	"amount":-1
}'
</pre>

<br/>

Happy flow request:

<pre>
curl -X GET \
  http://localhost:8080/wages/sample \
  -H 'Content-Type: application/json' \
  -d '{
	"amount":400
}'
</pre>


  
<br/>

localhost:8080/wages/actuator/info  <br/>
localhost:8080/wages/status


Command to be used to build (in parent directory):<br/>
mvn clean install -Plocal

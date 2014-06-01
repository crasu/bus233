Start server:

    dev_appserver.py .

Testing:

    curl -i -H "Accept: application/json" -X POST -d '{ "email": "crasu@crasu.de" }' http://localhost:8080/signup

Deploy:

    appcfg.py update .

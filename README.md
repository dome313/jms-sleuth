# Adding sleuth dependency to the classpath stops @JmsListener from working.

This demonstrate that behavior with ActiveMq and IBM MQ.

To run the example you either need to have IBM MQ or Active MQ running locally.

## How to reporduce:
1. Start the app
2. Send a request GET http://localhost:8080/test
3. With sleuth on classpath the message is not consumed, without it, it is (change dependencies in pom.xml for this0
 

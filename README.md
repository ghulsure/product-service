# product-service

#Api details
1) GET - /product-service/api
Returns string ("Getting Called by product service")

2) GET - /product-order
Calls order-service api (http://order-service:8080/order-service/api) which returns (Service call from service 2 to service 1 --- " + val)

#To build using dockerfile command - docker build -t app .

#To run docker file command - docker run -it -p 8080:8080 app

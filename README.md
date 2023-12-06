
![Diagram](https://github.com/kubrainci/Rent-a-car-microservices/assets/131158025/e54f6d17-b78a-4f47-bc19-fdbd4bda399a)


The following services have been added to the base structure in the project:

.keycloak

.gateway

.Eureka (Service Discovery)

.Rental Service & PostgreSql

.Car Service & MongoDb

.Customer Service & PostgreSql

.docker-compose.yml

CAR SERVİCE

.Brand, model, color, model year, daily fee and picture information of the cars are integrated into the project.

.Cars are listed.

.There is CRUD in the car service.

.Car images can be uploaded to your application. A CDN service was used for this structure "Cloudinary".

.The URLs of the uploaded images are kept in a new CarImages table.

CUSTOMER SERVİCE

CustomerService This service uses PostgreSql and will keep our customer information. 
It basically performs the following tasks.

.Sign up

.There is CRUD in the customer service

.Customers are listed.

.There is sync communication between customer service and rental service.

RENTAL SERVİCE

.The necessary Kafka configurations were made for asynchronous communication between the Rental Service and Notification Service.

.A rental function is created in RentalService and this function notifies NotificationService asynchronously.

.The function enabled in NotificationService simulates sending notifications by email.


HOW WİLL THE PROJECT WORK ?

Rental service provides the function of adding rental data to the database by providing the following features:
While renting, the status of the car is checked synchronously from the car service.
Again, after checking whether there is sufficient balance in the customer table, the price for the rental is sent to CustomerService in sync.
If everything is suitable, car rental will take place.
Depending on the realization, the customer will receive an e-mail.

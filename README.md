# JAX-RS
```js
What is REST ?
Representational State Transfer (REST) is an architectural style that defines a set of constraints to be used for creating web services.These constraints restrict the ways that the server can process and respond to client requests so that, by operating within these constraints, the service gains desirable non-functional properties, such as performance, scalability, simplicity, modifiability, visibility, portability, and reliability.
If a service violates any of the required constraints, it cannot be considered RESTful.


REST Architectural constraints 

Client–server architecture
Statelessness
Cacheability
Layered system
Code on demand
Uniform interface 


```


```js
What is JAX-RS ?

JAX-RS (Java Api for Restful web Services) this provides specifications about how those 6 constrains be implemeted. It only gives specifications just like interface. It does not provide any servlets it only gives inforamtions about how Architectural constraints  must be implemented. Some framework which implemented JAX-RS is Jersey, RESTEasy, Apache CFX these frameworks apart from providing the implemetation to JAX-RS they also provide Servlets.

```


``` js
Jersey Vs JAX-RS


JAX-RS is an specification (just a definition) and Jersey is a JAX-RS implementation of REST Constrains.
Jersey just a interface to use JAX-rs in more easier way. JAX-RS dont provided servlet but Jersey does. Jersey provides a library to implement Restful webservices in a Java servlet container, Jersey provides a servlet implementation which scans predefined classes to identify RESTful resources. In your web.xml configuration file your register this servlet for your web application.


JAX-RS is a specification (which basically tells what to implement/follow) and Jersey is an implementation (which means how those specifications should be implemented). We can have multiple implementations for a Specification. We have libs for JAX-RS because we can use JAX-RS API's in your code so that in future if you change your implementation (in this case Jersey to something else) you code will still work fine. You can relate it with your interface and implementation class.


```


                                                                   STDM Laboratory work No.2
                                                                   Topic: Structural Design Patterns
                                                                   Prepared by : Virtosu Dan , FAF-181
                                                                   Evaluated by : Drumea Vasile 
                                                                   
                                                                        Main tasks :      
1. By extending our project,to implement at least 3 structural design patterns;

2. Keep the files grouped (into packages/directories);

3. Document the work in a separate markdown file;

##                                                                           Theory :
In software engineering, structural design patterns are design patterns that ease the design by identifying a simple way to realize relationships between entities.
 
Some examples of from this category of design patterns are :

**1)Adapter**-Allows the conversion of the interface of a class to another interface that clients expect. This allows classes with incompatible interfaces to work together.

**2)Bridge** -	Allows the separation of an abstract interface from its implementation. This eliminates the dependency between the two, allowing them to be modified independently.

**3)Composite** -Composite pattern is used where we need to treat a group of objects in similar way as a single object.

**4)Decorator** -Extends the functionality of an object in a manner that is transparent to its clients without using inheritance.

**5)Facade** -	Provides a higher-level interface to a subsystem of classes, making the subsystem easier to use.

**6)Flyweight** -Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance.

**7)Proxy** -	Allows a separate object to be used as a substitute to provide controlled access to an object that is not accessible by normal means.

 ##                                                                       Implementation :
In this project I continued work from the previous laboratory with the Transport domain. I implemented 3 Structural Design Patterns(Facade , Proxy and Adapter) that allows to extend functionalities of the system .

## 1. Adapter 
Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot be connected directly. From my point of view , the usage of this pattern for this domain is very important . We have 2 different types of measurements for the transport , which are Miles/Hour and Kilometer/Hour . In order to convert Miles/Hour I created an adapter for this. I have 2 interfaces **IMovable** and **IMovableAdapter** that represents 2 incompatible interfaces . Next I created concrete classes that implements **IMovable** , which represents speed on the rural roads(**RuralSpeed**) and speed for interstate roads(**InterstatesSpeed**). To obtain the needed conversion , the **MovableAdapterImplementation** was created , and in this way we obtained the desired results . Following screeshots will define the process of implementing this pattern :
![download](https://user-images.githubusercontent.com/45829623/98462526-a2df2280-21bd-11eb-9a49-6bcce67a0be2.png)

## 2.Facade
Facade pattern is used to hide the complexities of the system. The motivation for usage of this pattern is the following: this pattern involves a single class which provides simplified methods required by client and delegates calls to methods of existing system classes.The purpose of this is to color pieces of a Transport and for this I have the interface **IBodyColor** , and classes(**BodyColor** , **WheelColor** and **HoodColor**) implementing this interface . After that I created the **Painter** class which provides the simplified methods for the client.
![facade](https://user-images.githubusercontent.com/45829623/98538994-4438a800-2294-11eb-81ea-51d7267fde30.png)

## 3. Proxy 
Proxy pattern is used when a class need to represent functionality of another class . I have the **IRepair** interface , and 2 classes that implements this interface(**TransportService** and **TransportServiceProxy**) . In **TransportService** a have just one method that validates the reservation to service . In order to represent the functionality of this class I implemented the **TransportServiceProxy** , in which I've implemented method that helps us to call to service and schedule your car for some repair.
![proxy](https://user-images.githubusercontent.com/45829623/98539685-70085d80-2295-11eb-9725-386d664bbdf9.png)

##                                                                           Results and Conclusion:
![results](https://user-images.githubusercontent.com/45829623/98540264-574c7780-2296-11eb-99ff-ade4d9f3a86e.png)

**In conclusion** , the main goal of this laboratory work was to continue the work from the previous lab and add some new functionalities to the system using the Structural Design Patterns . In order to achieve this , I implemented 3 StructuralDP (Facade , Proxy and Adapter) . Now the client is able to modify the color of different parts of the body , to adapt the speed from Miles/Hour to Km/Hour and to made a reservation for Service.






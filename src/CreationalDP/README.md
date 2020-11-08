                                                                   STDM Laboratory work No.1
                                                                   Topic: Creational Design Patterns
                                                                   Prepared by : Virtosu Dan , FAF-181
                                                                   Evaluated by : Drumea Vasile 
                                                                   
                                                                        Main tasks :
1. Choose an OO programming language and a suitable IDE or Editor (No frameworks/libs/engines allowed);

2. Select a domain area for the sample project;

3. Define the main involved classes and think about what instantiation mechanisms are needed;

4. Based on the previous point, implement atleast 3 creational design patterns in your project;

                                                                           Theory :

In software engineering, creational design patterns are design patterns that deal with object creation mechanisms, trying to create objects in a manner suitable to the situation. The basic form of object creation could result in design problems or added complexity to the design. Creational design patterns solve this problem by somehow controlling this object creation.
Creational design patterns are composed of two dominant ideas.
One is encapsulating knowledge about which concrete classes the system use.
Another is hiding how instances of these concrete classes are created and combined.

We have the following examples of Creational Design Patterns:

1)Abstract Factory -Creates an instance of several families of classes

2)Builder -Separates object construction from its representation

3)Factory Method -Creates an instance of several derived classes

4)Object Pool - Avoid expensive acquisition and release of resources by recycling objects that are no longer in use

5)Prototype- A fully initialized instance to be copied or cloned

6)Singleton-A class of which only a single instance can exist

                                                                        Implementation :

So for the realization of this project I implemented 4 types of CreationalDP , which are : Singleton , Factory , AbstractFactory and the Builder. The laboratory is concentrated other the Transport class , which contains 4 attributes(brand , model , type , body) , getters and setters.

Abstract Factory is implemented with Factory method so using these DP we obtained 2 levels of abstractions . The Factory method lets a class defer instantiation to subclasses, which is useful for constructing individual objects for a specific purpose without the requestor knowing the specific class being instantiated.The "Abstract Factory" pattern provides an abstract class that determines the appropriate concrete class to instantiate to create a set of concrete products. First , in FactoryMethod we created the main transport types , and in the Abstract Factory we obtained families of concrete classes . 

From my point of view , Singleton DP is the simplest one , cause it requires just few lines of code .The Singleton pattern ensures that a class has only one instance, and provides a global point of access to that class. It ensures that all objects that use an instance of this class use the same instance.

![s](https://user-images.githubusercontent.com/45829623/95080895-6f722980-0721-11eb-98bd-a5821accc94b.PNG)


The Builder pattern separates the construction of a complex object from its representation so the same construction process can create different objects. In the corresponding factory we can see a builder class(BikeFactory and ScooterBuilder). The builder classes are created in TransportBuilder , in which I described the information about each body .

The output of the program:

![4](https://user-images.githubusercontent.com/45829623/95081507-5027cc00-0722-11eb-98ef-91bc08bc8f16.png)


                                                                           Conclusion:
In this laboratory work the main goal was to became familiarized with Creational Design Patterns . In general DP helps delelopers and software engineers to write clean and understandable code . So I the goal is achieved , and we will use the DP each time we need to express our code in a clear way . 

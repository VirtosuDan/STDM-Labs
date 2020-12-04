

                                                                   STDM Laboratory work No.3
                                                                   Topic: Behavioral Design Patterns
                                                                   Prepared by : Virtosu Dan , FAF-181
                                                                   Evaluated by : Drumea Vasile 
                                                                        Main tasks :   
 1. By extending the project, implement as many behavioral design patterns as it is needed in the project;
 2. Keep the files grouped (into packages/directories) by their responsibilities (an example project structure);
 3. Finish the project by implementing a simple interface for the client of a whole system.
 4. Document the work in a separate markdown file according to the requirements presented below (the structure can be extended of course).
 ##                                                                           Theory :
   In software engineering, behavioral design patterns have the purpose of identifying common communication patterns between different software entities. By doing so, these patterns increase flexibility in carrying out this communication.

    Some examples from this category of design patterns are :

**1)Chain of Responsibility**-A way of passing a request between a chain of objects

**2)Command**-Encapsulate a command request as an object

**3)Interpreter**-A way to include language elements in a program

**4)Iterator**-Sequentially access the elements of a collection

**5)Mediator**-Defines simplified communication between classes

**6)Observer**-A way of notifying change to a number of classes

**7)Strategy**-Encapsulates an algorithm inside a class

 ##                                                                       Implementation : 
 So , this is my finally laboratory work on Design Patterns , in which I implemented 1 Behavioral Design Pattern(**Strategy**) and finished the project by making a simple interface for the client of the whole system that I developed on these laboratory works.
 
**1. Strategy Pattern** - this pattern allow us to choose an algorithm in run time . In order to introduce this pattern , I found that a good strategy is changing the wheels . I think this is one of the most important strategies for every drivers . So , depending what perios of the year is outside , the client can choose what wheels to put on his tranport . I have an Interface (**IChangingWheelsStrategy**) with the method **changeWheels** . Now I have the following classes that implements this interface (**ChangeAllSeasonsWheels** , **ChangeSummerWheels** , **ChangeWinterWheels** ) . So, you can easily use this strategy all the time you need .
![final2](https://user-images.githubusercontent.com/45829623/101175211-8d8ad600-364d-11eb-8c4f-c088f6b37371.png)

**2.New Client** . This is the final laboratory work and one of the taks was to make a simple client for entire system . Now the client is able to operate with all design pattern , is able to choose what operations he intends to do .

##                                                                Results:
**1.Strategy Results:
![s1](https://user-images.githubusercontent.com/45829623/101175639-13a71c80-364e-11eb-9c9b-7476057142bd.PNG)


**2.Final Results :
![f1](https://user-images.githubusercontent.com/45829623/101175740-33d6db80-364e-11eb-9574-8234e0127f30.PNG)



                                                                

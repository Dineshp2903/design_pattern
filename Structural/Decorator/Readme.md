The Decorator design pattern is a structural pattern that allows you to dynamically add behavior and responsibilities to objects without modifying their code. It is useful for adhering to the Open/Closed Principle (a class should be open for extension but closed for modification).

Key Concepts
1. Component: This is an interface or abstract class defining the core methods to be implemented.
2. ConcreteComponent: This class implements the Component interface and is the original object to which new functionalities are added.
3. Decorator: This abstract class implements the Component interface and has a Component object as an attribute. It delegates the original functionality to the Component object.
4. ConcreteDecorator: This class extends the Decorator class and adds new functionalities.


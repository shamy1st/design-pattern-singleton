# Singleton Design Pattern (Java)
**Singleton** a class has only one instance and a global point of access to it.
![](https://github.com/shamy1st/design-pattern-singleton/blob/main/uml.png)
### Problem:
Create **SingleObject** class has only one object.

    public class Main {
        public static void main(String[] args) {
            SingleObject object = SingleObject.getInstance();
            object.showMessage();
        }
    }
### Solution:
![](https://github.com/shamy1st/design-pattern-singleton/blob/main/uml-solution.png)

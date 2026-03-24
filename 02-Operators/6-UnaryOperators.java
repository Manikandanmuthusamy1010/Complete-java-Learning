```java id="u7k2mn"
public class UnaryOperators {
    public static void main(String[] args) {

        int a = 5;

        // Unary minus (-)
        System.out.println("Unary minus (-a): " + (-a));

        // Unary plus (+)
        System.out.println("Unary plus (+a): " + (+a));

        // Increment (++)
        System.out.println("Post Increment (a++): " + (a++));
        System.out.println("After a++ value: " + a);

        System.out.println("Pre Increment (++a): " + (++a));

        // Decrement (--)
        System.out.println("Post Decrement (a--): " + (a--));
        System.out.println("After a-- value: " + a);

        System.out.println("Pre Decrement (--a): " + (--a));

        // Logical NOT (!)
        boolean b = true;
        System.out.println("Logical NOT (!b): " + (!b));

        // Complement (~)
        System.out.println("Complement (~a): " + (~a));
    }
}
```

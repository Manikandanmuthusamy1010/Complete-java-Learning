public class LogicalOperators {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        // AND Operator (&&)
        System.out.println("a && b: " + (a && b));

        // OR Operator (||)
        System.out.println("a || b: " + (a || b));

        // NOT Operator (!)
        System.out.println("!a: " + (!a));
        System.out.println("!b: " + (!b));

        // Using logical operators in conditions
        int x = 10;
        int y = 20;

        if (x > 5 && y > 15) {
            System.out.println("Both conditions are TRUE (AND)");
        }

        if (x > 15 || y > 15) {
            System.out.println("At least one condition is TRUE (OR)");
        }

        if (!(x > y)) {
            System.out.println("Condition is FALSE, so NOT makes it TRUE");
        }
    }
}
```

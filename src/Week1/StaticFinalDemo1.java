package Week1;

public class StaticFinalDemo1 {

        static int instanceCount = 0;               // static counter
        public static final String ORG = "Vinay Corp"; // final constant

    StaticFinalDemo1() {
            instanceCount++;
        }

        public static void printCount() {   // Static method can use directly on class name and not a object creation required.
            System.out.println("Instances created: " + instanceCount);
        }

        public final void cannotOverride() {    // Final Method
            System.out.println("This method is final and cannot be overridden");
        }

public static void main(String[] args) {
            new StaticFinalDemo1();
            StaticFinalDemo1.printCount();
            System.out.println("Organization: " + StaticFinalDemo1.ORG);

        }
    }

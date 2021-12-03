package Chapter8Exercises;

// Exercise 8.3: Integer set
public class Ex813_IntegerSet {

    boolean[] integers = new boolean[101];

    public Ex813_IntegerSet(int... set) {
        // Update array with integer values
        for (int element : set) 
            integers[element] = true;
        
    }

    public static Ex813_IntegerSet union(Ex813_IntegerSet set1, Ex813_IntegerSet set2) {
        //unionInt[i] = (set1.integers[i] || set2.integers[i]) ? i : -1;   

        Ex813_IntegerSet union = new Ex813_IntegerSet();

        for (int i = 0; i < 101; i++) 
            // Set union to true if either of set1 or set 2 is true
            union.integers[i] = set1.integers[i] || set2.integers[i];        

        return union;
    }

    public static Ex813_IntegerSet intersection(Ex813_IntegerSet set1, Ex813_IntegerSet set2) {
        Ex813_IntegerSet intersect = new Ex813_IntegerSet();

        for (int i = 0; i < 101; i++) 
            // Set intersect to true if set1 and set2 are true
            intersect.integers[i] = set1.integers[i] && set2.integers[i];        

        return intersect;
    }

    public void insertElement(int element) {
        integers[element] = true;
    }

    public void deleteElement(int element) {
        integers[element] = false;
    }

    public boolean isEqual(Ex813_IntegerSet set) {
        boolean isEqual = true;
        for (int i = 0; i < 101; i++) {
            if (integers[i] != set.integers[i]) {
                isEqual = false;
                break;
            }
        }
        return isEqual;
    }

    @Override
    public String toString() {
        //  Declare and initialize variables
        int count = 0;
        boolean empty = true;
        int[] output = new int[101];

        // Add set elements to set array
        for (boolean element : integers) {
            output[count] = element ? count : -1;
            ++count;
        }

        // Display set elements
        for (int element : output) 
            System.out.printf("%s", element < 0 ? "" : element + " ");
        

        // Prints dashes for empty set
        for (boolean element : integers) {
            if (element) {
                empty = false;
                break;
            }
        }
        System.out.printf("%s", empty ? "---" : "");

        return "";
    }
}

// Class to test integer set
class TestIntegerSet {

    public static void main(String[] args) {
        try {
            int[] elements1 = {0, 1, 2, 3, 4, 5};
            int[] elements2 = {3, 27, 23, 5, 99, 48, 98, 74, 12};

            Ex813_IntegerSet set1 = new Ex813_IntegerSet(elements1);
            Ex813_IntegerSet set2 = new Ex813_IntegerSet(elements2);

            System.out.printf("Set1: [%s]%n", set1);
            System.out.printf("Set2: [%s]%n", set2);

            // Union
            Ex813_IntegerSet intersection = Ex813_IntegerSet.intersection(set1, set2);
            System.out.printf("The Intersection between Set1 and Set 2 is: [%s]%n", intersection);

            // Intersection
            Ex813_IntegerSet union = Ex813_IntegerSet.union(set1, set2);
            System.out.printf("The union between Set1 and Set 2 is: [%s]%n", union);

            // Equality
            System.out.printf("Set1 is %s equal to set2%n",
                    set1.isEqual(set2) ? "" : "not");

            // Insert element
            set1.insertElement(4);
            System.out.printf("Set1 after adding 4: [%s]%nSet2: [%s]%n", set1, set2);

            // Delete element
            set1.deleteElement(4);
            System.out.printf("Set1 after deleting 4: [%s]%n", set1);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf("An Exception has occured: %s%n%s%n", e,
                    "This means you should only enter integers within the range 0 - 100");
        } catch (Exception e) {
            System.out.printf("Exception: %s", e.getMessage());
        }

    }
}

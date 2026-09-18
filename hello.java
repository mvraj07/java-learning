// import java.util.Scanner;
// public class hello{
//     public static void main(String[] raj){
// String text = "Selenium Automation";

// System.out.println(text);
// System.out.println(text.length());
// System.out.println(text.charAt(10));
// System.out.println(text.toUpperCase());
// System.out.println(text.toLowerCase());
// System.out.println(text.codePointAt(2));
// System.out.println(text.startsWith("selen"));
// System.out.println(text.endsWith("ion"));
    // String str="raj mahajan";
    // String str="raj";
    // String btr="raj";
    // System.out.println(str == btr);
    // System.out.println(str.equals(btr));
// System.out.println(str);
// String []res= str.split(" ");
// System.out.println(res[0]);
// System.out.println(res[1]);
// System.out.println(str.equals("raj"));
// System.out.println(str.equalsIgnoreCase("RaJ"));
        // Scanner sc = new Scanner(System.in);
        // String name = "raj";
        // int age;
        // int integer;
        // float floating;
        // boolean truth;
        // String name;
        // name = sc.next();
        // truth = sc.hasNextInt();
        // age = sc.nextInt();
        // System.out.print(name);
        // System.out.print(truth);

        // double cgpa = 7.22;
        // boolean automation = true;
        // System.out.println("Name: "+name);
        // System.out.println("CGPA: "+cgpa);
        // System.out.println("Learning: "+automation);
        // System.out.println("Age: "+age);
        // System.out.println(name);
    //    sc.close();

    //     int number=19;
    //   System.out.println(number&1);
//  Students std11 = new Students();
//  std11.getData("rajjj",22);

//         std11.displayData();

//     }
// }
    abstract class BaseTest {

    void setup() {
        System.out.println("Common test setup");
    }

    abstract void executeTest();
}

 class LoginTest extends BaseTest {

    @Override
    void executeTest() {
        System.out.println("Login test executed");
    }
}

public class hello {
    public static void main(String[] args) {

        LoginTest test = new LoginTest();

        test.setup();
        test.executeTest();
    }
}
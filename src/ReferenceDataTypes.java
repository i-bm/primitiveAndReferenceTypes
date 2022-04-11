
public class ReferenceDataTypes {
    public static void main(String[] args) {
      Integer number = 20;
        System.out.println("Integer Parsed to double value:" + number.doubleValue());
      String str = "I'm a Java Developer";
        System.out.println(str.toUpperCase());
      Character character = 'A';
        System.out.println(character.equals('B'));

        Person isaac =  new Person("Isaac", 20);
        System.out.println(isaac.name);
    }

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age){
            this.age = age;
            this.name = name;
        }
    }

}


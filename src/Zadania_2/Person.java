package Zadania_2;


import javax.naming.Name;

public class Person implements  Comparable<Person> {

    //todo zrobić w chacie

       private   String Name;

       private String lastName;

       private  int age;

       private static int person_c = 1;
       private static  int p = 0;

       private static Person[]t = new Person[person_c];


       public  Person(String Name ,String lastName,int age){

         person_c++;
           this.Name =  Name;

         this.lastName = lastName;

         this.age = age;






       }


    @Override
    public String toString() {
        return "Name = " + Name + "Last name = " + this.lastName + " Birth date = " +
                + age;


       }


    public String getName() {
        return Name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthdate() {
        return age;
    }

    public static int getPerson_c() {
        return person_c;
    }

    public static Person[] getT() {
        return t;
    }




       public static Person[] exampleArray(){
          return t;
       }

    public static void setT(Person[] t) {
        Person.t = t;

    }

    public static void  addPerson(Person person){

      t[p++] =  person;
    }

    @Override
    public int compareTo(Person o) {
        return  this.Name.compareTo(o.Name);
    }
}

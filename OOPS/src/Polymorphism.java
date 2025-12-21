
public class Polymorphism {   // poly-> many forms
         public static  class dog{
        void speak(){
            System.out.println("zzzzz");
        }
         }

    public static  class cat{
       void speka(){
           System.out.println("meow meow");
       }
    }

    public static  class lion{
      void speak(){
          System.out.println("Grrrrr");
      }
    }

    public static  class Dogeshbhai{
       void speak(){
           System.out.println("Case karo");
       }
    }

    public static  class Human{
     void speak(){
         System.out.println("Ouch ouch");
     }
    }

    static void main(String[] args) {
        Human h = new Human();
        cat c = new cat();
        lion l = new lion();
        Dogeshbhai b = new Dogeshbhai();
        dog d= new dog();

        d.speak();
        b.speak();
        l.speak();
        h.speak();
        c.speka();
         }
}

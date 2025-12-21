
public class PassingClassToMethod {
   public static class car{
        int seats;
        double length;
        String name;
        String type;
        int torque;

        void print(){
            System.out.println(seats+" "+length+" "+name+" "+type+" "+torque+" ");
        }

    }

    static void main(String[] args) {
        car c= new car();
        c.length=5.66;
        c.name= " tasla";
        c.seats= 3;
        c.type= " truck ";
        c.torque = 440 ;

        change(c);
        System.out.println(c.seats);
        c.print();
    }

    private static void change(car c){ // pass by reference
             c.seats = 4;
    }


}

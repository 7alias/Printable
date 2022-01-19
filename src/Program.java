public class Program{

    public static void main(String[] args) {

        Printable printable = new Book("Java. Complete Reference", "H. Shildt");
        printable.print();      //  Java. Complete Reference (H. Shildt)
        printable = new Journal("Foreign Policy");
        printable.print();      // Foreign Policy



        Printable p =new Journal("Foreign Affairs");
        p.print();
        // Интерфейс не имеет метода getName, необходимо явное приведение
        String name = ((Journal)p).getName();
        System.out.println(name);

        System.out.println("Print through embedded interface");
        Printer.Printable q =new Cheque("1. Blue water $9.99");
        q.print();

        System.out.println("Calculation through interface:");
        Calculatable c = new Calculation();
        System.out.println(c.sum(1, 2));
        System.out.println(c.sum(1, 2, 4));

        WaterPipe pipe = new WaterPipe();
        pipe.printState(0);
        pipe.printState(1);
        pipe.printState(3);
    }

    }


public class Cheque implements Printer.Printable {

    String name;

    Cheque(String name){

        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }
}
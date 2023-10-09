// main code that activates our factory
public class Main {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
        // it gets values like type, ram, hdd and cpu(it creates computer by computerfactory class)
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        // it gets values like type, ram, hdd and cpu(it creates server by computerfactory class)
        System.out.println("Factory PC Config::"+pc);// output of pc
        System.out.println("Factory Server Config::"+server);// output of server
    }
}
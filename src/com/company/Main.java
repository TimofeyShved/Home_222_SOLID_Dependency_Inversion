package com.company;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        client.doJob();
    }
}

// принцип мы должны разделять классы при помощи интерфейсов, что-бы они меньше друг-друга знали,
// что-бы классы верхнего уровня ничего не знали о нижних

interface DAO{
    void execute();
}

class DataAccess implements DAO{
    @Override
    public void execute() {
        System.out.println("execute");
    }
}

class Client{
    // Client | -> | DataAccess
    //не доложно быть такого

    //DataAccess dataAccess = new DataAccess();

    // через интерфейс
    // Client | -> | interface | <- | DataAccess

    DAO dataAccess = new DataAccess();

    void doJob(){
        dataAccess.execute();
    }
}

package es_thread;

public class Main {
    public static void main(String[] args) {
        int array [] =  new int[10];

        for(int i = 0; i < 10; i++){
            Miothread t = new Miothread(array, i);
            t.run();
        }
    }
}
package es_thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int array [] =  new int[10];
        Miothread[] threads = new Miothread[10];
        for(int i = 0; i < 10; i++){
            Miothread t = new Miothread(array, i);
            threads[i] = t;
            t.start();
        }

        for(int i = 0; i < 10; i++){
            threads[i].join();
        }
        
        for(int i = 0; i < 10; i++){
            System.out.print(array [i] + " ");
        }
        System.out.println();
    }
}
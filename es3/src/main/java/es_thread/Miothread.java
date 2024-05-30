package es_thread;

public class Miothread extends Thread{
    private int pos;
    private int array[];
    
    public Miothread(int ar[], int i){
        array = ar;
        pos = i;
    }
    @Override
    public void run() {
        int num = (int)(Math.random()*100+1);
        System.out.println("il thread " + getName() + " ha creato il numero " + num);
        array[pos] = num;
    }
}

package practice.ch06;

import ch06.Sample.MessageBox;



public class Main {
    public static void main(String[] args) {
        MessageBox mbox1 = new MessageBox('@');
        mbox1.use("Hello, world.");

        mbox1.createCopy().use("Hello, world.");
        mbox1.clone();
    }
}

package thread;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrintAl {

    public static void main(String[] args) {
        new Thread(new PrintA()).start();
        new Thread(new PrintB()).start();
        new Thread(new PrintNum()).start();
    }
}


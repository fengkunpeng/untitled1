package g;

import java.io.Serializable;

public class User<T extends Comparable & Cloneable & Serializable> {
    private T name;
    private int age;
}

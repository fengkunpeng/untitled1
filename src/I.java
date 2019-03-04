interface J{}
class c{}
class D extends c implements I,J {

    @Override
    public void f() {

    }
}

public interface I extends J {
    private static int fun(){
        return 0;
    }

    public static final int i = 1;
    public abstract void f();
    public static void g() {
        fun();
    }
    public default void h() {
        fun();
    }
}


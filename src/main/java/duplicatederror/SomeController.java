package duplicatederror;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class SomeController implements Serializable {

    private static final long serialVersionUID = 6184842672181799938L;

    private Foo foo = new Foo();

    public void someAction() {
        System.out.println("action");
    }

    public Foo getFoo() {
        return foo;
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
    }

}

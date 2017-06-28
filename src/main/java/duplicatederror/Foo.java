package duplicatederror;

import java.io.Serializable;

import javax.validation.constraints.Max;

public class Foo implements Serializable {

    private static final long serialVersionUID = -7334434752280744719L;

    @Max(5)
    private Integer bar;

    public Integer getBar() {
        return bar;
    }

    public void setBar(Integer bar) {
        this.bar = bar;
    }

}

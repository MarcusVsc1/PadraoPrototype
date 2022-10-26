package model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Raca implements Cloneable {
    private String nome;
    private String origem;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

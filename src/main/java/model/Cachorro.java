package model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Cachorro implements Cloneable{
    private String nome;
    private Float peso;
    private Raca raca;

    @Override
    public Cachorro clone() throws CloneNotSupportedException {
        Cachorro cachorroClone = (Cachorro) super.clone();
        cachorroClone.raca = (Raca) cachorroClone.raca.clone();
        return cachorroClone;
    }

}

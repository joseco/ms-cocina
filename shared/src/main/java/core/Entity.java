package core;

import lombok.Getter;


public abstract class Entity<ID> {
    @Getter
    protected ID id;


}

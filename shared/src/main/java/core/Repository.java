package core;

public interface Repository<ID, E extends AggregateRoot<ID>> {

    E getById(ID id);

    void create(E obj);
}

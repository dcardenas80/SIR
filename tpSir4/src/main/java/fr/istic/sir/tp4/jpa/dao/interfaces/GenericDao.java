package fr.istic.sir.tp4.jpa.dao.interfaces;

import java.io.Serializable;

public interface GenericDao<T, PK extends Serializable> {
    T create(T t);
    T read(PK id);
    T update(T t);
    void delete(T t);
}

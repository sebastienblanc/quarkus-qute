package dev.morling.demos.quarkus;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.panache.common.Sort;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Todo extends PanacheEntity {

    public String title;

    public String owner;

    public int priority;

    public boolean completed;

    public static List<Todo> findByOwner(String owner, Sort sort){
        return list("owner",sort, owner);
    }
}

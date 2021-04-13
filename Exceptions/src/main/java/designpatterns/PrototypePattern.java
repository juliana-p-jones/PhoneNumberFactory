package designpatterns;

import java.util.List;

public class PrototypePattern implements Cloneable{
    /*
    Concepts: avoid costly creation, avoids subclassing, typically doesn't use "new". Often utilizes an interface, and usually implemented with a Registry
    Example" java.lang.Object#clone()

    Design:
    Implements the clone/cloneable interface and avoids the keyword new.
    Although a copy, each instance is unique.
    Costly construction is not handled by client.
    Can still utilize params for construction.
    "Shallow Vs Deep copy"

    This is great if you had 10,000 objects on a page and it could get tedious making new objects
    In a nutshell: you create the protoype that takes the parameters that you want the objects being cloned to take, then you change them for each new object if you need for new instances with each clone

    Pitfalls:
    Often not used!
    Used with other patterns
    Often you want a deep copy, not a shallow copy like you get with this method

    Contrast Prototype Vs Factory:
    Prototype is lighter weight construction, gives a copy constructor or clone, shallow or deep, copy of itself
    Factory has flexible objects with multiple constructors, concrete instances, fresh "new" instance where nothing needs to get overwritten


     */
    private String sql;
    private List<String> parameters;
    private Record record;

    public PrototypePattern(String sql, List<String> parameters, Record record){
        this.sql = sql;
        this.parameters = parameters;
        this.record = record;
    }
    public PrototypePattern clone(){
        try{
            return (PrototypePattern) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<String> getParameters(){
        return parameters;
    }
    public Record getRecord(){
        return record;
    }
    public String getSql(){
        return sql;
    }
    public void setParameters(List<String> parameters){
        this.parameters = parameters;
    }
}

package idv.design.pattern.prototype.example7;

/**
 * @author Carl Lu
 */
public interface Prototype {

    public Prototype clone();

    public String getName();

    public void setName(String name);

}

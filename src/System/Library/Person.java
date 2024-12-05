package System.Library;

abstract public class person {
    protected String name;
    protected int id;

    public person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public person(String name) {
        this(name, 0);
    }

    public String getname() {
        return name;
    }

    public int getid() {
        return id;
    }

    public abstract void displayinfo(int id);
}
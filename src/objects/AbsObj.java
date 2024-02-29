package objects;

public abstract class AbsObj {
    private String name;
    private String decName;

    public AbsObj(String name,String decName) {
        this.name = name;
        this.decName = decName;
    }

    public String getName() {
        return name;
    }
    public String getDecName() {
        return decName;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + this.getName().hashCode();
    }

    @Override
    public boolean equals(Object ob) {
        if (ob == this) return true;
        if (ob == null || ob.getClass() != getClass()) return false;

        AbsObj absObj = (AbsObj) ob;
        return absObj.name.equals(name);
    }

    @Override
    public String toString() {
        return "Объект " + this.getName();

    }
}
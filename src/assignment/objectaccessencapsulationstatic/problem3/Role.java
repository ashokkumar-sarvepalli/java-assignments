package assignment.objectaccessencapsulationstatic.problem3;


public class Role {
    private String name;
    private String description;
    private Privilege[] privilege;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Privilege[] getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Privilege[] privilege) {
        this.privilege = privilege;
    }
    
}

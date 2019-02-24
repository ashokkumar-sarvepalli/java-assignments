package assignment.oopsconcept.problem6;


public class PrivilegeRoleBO {
    
    void displayRoleDetailsByPrivilege(PrivilegeRole[] privilegeRole,String privilege)
    {
        
        System.out.println("Role name :");
    }
    
    void displayPrivilegeDetailsByRole(PrivilegeRole[] privilegeRole,String role)
    {
		System.out.println("Privilege name :");
        
        //fill code here.
    }
    
    
    void displayRole(Role[] roles)
    {
        System.out.println("Role Details :");
        System.out.format("%-15s %s\n", "Id","Name");
       for(Role r : roles)
                System.out.format("%-15d %s\n", r.getId() ,r.getName());
    }
    
    void displayPrivilege(Privilege[] privilege)
    {
        System.out.println("Privilege Details :");
        System.out.format("%-15s %s\n", "Id","Name");
        for(Privilege p : privilege)
                System.out.format("%-15d %s\n",p.getId(),p.getName());
    }
    
    
}

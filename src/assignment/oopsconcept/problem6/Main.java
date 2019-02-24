package assignment.oopsconcept.problem6;

import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n,i;
        String rolePrivilegeDetails;
        PrivilegeRoleBO privilegeRoleBO = new PrivilegeRoleBO();
        
        
        Role [] role = new Role[4];
        role[0] = new Role(1,"Software Developer","Developing a Software in Java");
        role[1] = new Role(2,"Manager","Manage or lead the team");
        role[2] = new Role(3,"Tester","Testing a Software");
        role[3] = new Role(4,"General Manager","Manage the whole organisations");
        Privilege[] privilege = new Privilege[5];
        privilege[0] = new Privilege(1, "Admin");
        privilege[1] = new Privilege(2, "Decision Making");
        privilege[2] = new Privilege(3, "Ordering");
        privilege[3] = new Privilege(4, "Managing");
        privilege[4] = new Privilege(5, "Development");
        Role selectedRole = null;
        Privilege pri = null;
        
        new PrivilegeRoleBO().displayRole(role);
        new PrivilegeRoleBO().displayPrivilege(privilege);
        System.out.println("Enter the number of privileges to assign the role :");
        n = Integer.parseInt(br.readLine());
        PrivilegeRole[] privilegeRole = new PrivilegeRole[n];
        for(i=0;i<n;i++)
        {
            
            System.out.println("Enter the role id and privilege id "+(i+1)+" :");
            
            rolePrivilegeDetails = br.readLine();
            String splited[] = rolePrivilegeDetails.split(",");
            // fill the code
        while(true)
        {
            System.out.println("1. Search by Role\n2. Search by Privilege\n3. Exit\nEnter the choice :");
            int choice = Integer.parseInt(br.readLine());
            if(choice == 2)
            {
                System.out.println("Enter the privilege to search :");
                privilegeRoleBO.displayRoleDetailsByPrivilege(privilegeRole,br.readLine());
            }
            else if(choice == 1)
            {
                System.out.println("Enter the role to search :");
                privilegeRoleBO.displayPrivilegeDetailsByRole(privilegeRole,br.readLine());
            }
            else if(choice == 3)
                System.exit(0);
        }
    }
    
}
}


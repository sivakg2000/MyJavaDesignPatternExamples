package com.sivakg.examples.dp.structural.composite;

import com.sivakg.examples.dp.structural.composite.component.Service;
import com.sivakg.examples.dp.structural.composite.leaf.AdminService;
import com.sivakg.examples.dp.structural.composite.leaf.EmployeeService;

public class MainComposite {
	
	public static void main(String args[]) {
		Service emp1Service=new EmployeeService();
		Service emp2Service=new EmployeeService();
		
		Service adminService=new AdminService();
		
		ServiceProvider sProvier=new ServiceProvider();
		sProvier.addService(emp1Service);
		sProvier.addService(emp2Service);
		sProvier.addService(adminService);
		
		sProvier.service("Registration Service");
		
		sProvier.deletService(emp2Service);
		
		sProvier.addService(new AdminService());
		
		sProvier.service("Logout Service");
		
		
		sProvier.clearService();
		
		
		sProvier.service("Update Service");
	}
	
	

}

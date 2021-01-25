package com.prantati.inheritance;

public class PrintProfession {

	public static void main(String[] args) {
		Teacher teacher=new Teacher();
		teacher.myProfession();
		
		Employee permanentEmp=new PermanentEmployee();
		permanentEmp.myProfession();
		
		Employee contractEmp=new ContractEmployee();
		contractEmp.myProfession();

	}

}

package com.dto;

	public class Employee {
	    private String EmploId;
	    private String  EmpName;
	    private String  DOJ;
	    private double  BasicSal;
   
	    
	    public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
		

		


		public Employee(String emploId, String empName, String dOJ, double basicSal) {
			super();
			EmploId = emploId;
			EmpName = empName;
			DOJ = dOJ;
			BasicSal = basicSal;
		}






		
		public String getEmploId() {
			return EmploId;
		}






		public void setEmploId(String emploId) {
			EmploId = emploId;
		}






		public String getEmpName() {
			return EmpName;
		}






		public void setEmpName(String empName) {
			EmpName = empName;
		}






		public String getDOJ() {
			return DOJ;
		}






		public void setDOJ(String dOJ) {
			DOJ = dOJ;
		}






		public double getBasicSal() {
			return BasicSal;
		}






		public void setBasicSal(double basicSal) {
			BasicSal = basicSal;
		}






		@Override
		public String toString() {
			return "Employee [EmploId=" + EmploId + ", EmpName=" + EmpName + ", DOJ=" + DOJ + ", BasicSal=" + BasicSal
					+ "]";
		}
	    
	    
	    
	    
	}


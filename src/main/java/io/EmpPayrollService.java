package io;

import java.util.*;

public class EmpPayrollService {
    public enum IOService {
        CONSOLE_IO, FILE_IO, DB_IO
    }

    private List<EmpPayrollData> employeePayrollList;

    public EmpPayrollService() {

    }

    public EmpPayrollService(List<EmpPayrollData> employeePayrollList) {
        // TODO Auto-generated constructor stub
        this.employeePayrollList = employeePayrollList;
    }

    public static void main(String[] args) {
        ArrayList<EmpPayrollData> employeePayrollList = new ArrayList<>();
        EmpPayrollService employeePayrollService = new EmpPayrollService(employeePayrollList);
        Scanner sc = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(sc);
        employeePayrollService.writeEmployeePayrollData();

    }

    private void readEmployeePayrollData(Scanner sc) {
        System.out.println("Enter employee id : ");
        int id = sc.nextInt();
        System.out.println("Enter employee name : ");
        String name = sc.next();
        System.out.println("Enter employee salary : ");
        long salary = sc.nextLong();
        employeePayrollList.add(new EmpPayrollData(id, name, salary));
    }


    public void writeEmployeePayrollData() {

        System.out.println("Writing on console : \n" + employeePayrollList);

    }
}


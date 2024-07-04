package com.example.recyclerviewe
import com.example.gfg.Employee

object Constants {
        fun getEmployeeData():ArrayList<Employee>{
            val employeeList=ArrayList<Employee>()

            val emp1=Employee("Chinmai ", "chinmai@gmail.com")
            employeeList.add(emp1)
            val emp2=Employee("Gautham","gautham@gmail.com")
            employeeList.add(emp2)
            val emp3=Employee("Neha","neha@gmail.com")
            employeeList.add(emp3)
            val emp4=Employee("Hari ","hari@gmail.com")
            employeeList.add(emp4)
            val emp5=Employee("Abhisek","abi@gmail.com")
            employeeList.add(emp5)
            val emp6=Employee("Sindhu","sindhu@gmail.com")
            employeeList.add(emp6)
            val emp7=Employee("Anil","anil@gmail.com")
            employeeList.add(emp7)
            val emp8=Employee("Sachin","sachin@gmail.com")
            employeeList.add(emp8)
            val emp9=Employee("Amirth","amirth@gmail.com")
            employeeList.add(emp9)
            val emp10=Employee("Kayal","kayal@gmail.com")
            employeeList.add(emp10)

            return  employeeList
        }
    }

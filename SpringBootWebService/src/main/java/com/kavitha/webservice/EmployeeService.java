package com.kavitha.webservice;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping("/employee_service")
public class EmployeeService {
    private HashMap<Integer, Employee> empMap = new HashMap<>();

    @GetMapping("/getEmpName")
    public String getEmployeeName(@RequestParam(name = "id", defaultValue = "0") int id) {
        if (!empMap.containsKey(id)) {
            return "Employee not found";
        } else
            return empMap.get(id).getName();
    }

    @PutMapping("/addEmployee")
    public String putEmployee(@RequestParam(name = "id", defaultValue = "0") int id, @RequestParam(name = "name", defaultValue = "Kavitha") String name) {
        empMap.put(id, new Employee(id, name, 10000, 200));
        return "New Employee added/updated";
    }

    @GetMapping("/getAllEmployees")
    public HashMap<Integer, Employee> getAllEmployees() {
        return empMap;
    }

    @DeleteMapping("deleteEmployee")
    public String deleteEmployee(@RequestParam(name = "id", defaultValue = "0") int id) {
        if (!empMap.containsKey(id)) {
            return "Employee not found";
        } else {
            empMap.remove(id);
            return "Employee removed";
        }
    }
}
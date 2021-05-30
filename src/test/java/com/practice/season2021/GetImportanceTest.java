package com.practice.season2021;

import com.practice.common.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class GetImportanceTest {
    GetImportance gi = new GetImportance();

    @Test
    public void getImportance() {
        // 输入：[[1, 5, [2, 3]], [2, 3, []], [3, 3, []]], 1
        // 输出：11
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, 5, Arrays.asList(2,3)));
        employees.add(new Employee(2, 3, null));
        employees.add(new Employee(3, 3, null));
        int id = 1;
        int ans = gi.getImportance(employees, id);
        System.out.println(ans);
        System.out.println("-----------");

        // 输出：11
        employees = new ArrayList<>();
        employees.add(new Employee(1, 5, Arrays.asList(2,3)));
        employees.add(new Employee(2, 3, null));
        employees.add(new Employee(3, 3, null));
        employees.add(new Employee(6, 1, Arrays.asList(1,4)));
        employees.add(new Employee(4, 2, null));
        id = 1;
        ans = gi.getImportance(employees, id);
        System.out.println(ans);
        System.out.println("-----------");

        // 输出：14
        id = 6;
        ans = gi.getImportance(employees, id);
        System.out.println(ans);
        System.out.println("-----------");

        // 输出：0
        employees = new ArrayList<>();
        id = 6;
        ans = gi.getImportance(employees, id);
        System.out.println(ans);
        System.out.println("-----------");
    }
}
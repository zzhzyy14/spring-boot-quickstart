package config.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;
@Data
@PropertySource(value = {"classpath:employee.properties"})
public class Employee {
/*
 *使用 SpEl 读取employee 的 names 属性
 */
    @Value("#{'$(employee.names)'.split(',')}")
    private List<String> employeeName;
    @Value("#{'$(employee.names)'.split(',')[0]}")
    private String firstEmployeeName;
    @Value("#{'$(employee.age)'.split(',')[0]}")
    private Map<String, Integer> employeeAges;

}

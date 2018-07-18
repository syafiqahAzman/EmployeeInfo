package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;
    ArrayList<EmployeeItem>alEmployeeList;
    CustomAdapter caEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.listViewEmployee);

        alEmployeeList = new ArrayList<>();
        EmployeeItem item1 = new EmployeeItem("John", "Software Technical Leader", 3400.0);
        EmployeeItem item2 = new EmployeeItem("May", "Programmer", 2200.0);
        EmployeeItem item3 = new EmployeeItem("Syafiqah", "Programmer", 100000.0);
        EmployeeItem item4 = new EmployeeItem("Pei Xian", "Software Technical Leader", 3400.0);
        EmployeeItem item5 = new EmployeeItem("Akmal", "Software Technical Leader", 3400.0);
        EmployeeItem item6 = new EmployeeItem("Aminah", "Software Technical Leader", 3400.0);
        EmployeeItem item7 = new EmployeeItem("Pei Peo", "Software Technical Leader", 3400.0);
        EmployeeItem item8 = new EmployeeItem("Ah Xian", "Software Technical Leader", 3400.0);
        EmployeeItem item9 = new EmployeeItem("Marina", "Software Technical Leader", 3400.0);
        EmployeeItem item10 = new EmployeeItem("Nadia", "Software Technical Leader", 3400.0);
        EmployeeItem item11= new EmployeeItem("Mai", "Software Technical Leader", 3400.0);
        EmployeeItem item12 =  new EmployeeItem("Amir", "Software Technical Leader", 3400.0);
        EmployeeItem item13 =  new EmployeeItem("Amira", "Software Technical Leader", 3400.0);
        EmployeeItem item14 =  new EmployeeItem("Amair", "Software Technical Leader", 3400.0);
        EmployeeItem item15 =  new EmployeeItem("Amicr", "Software Technical Leader", 3400.0);
        EmployeeItem item16 =  new EmployeeItem("Amiar", "Software Technical Leader", 3400.0);
        EmployeeItem item17 =  new EmployeeItem("Amira", "Software Technical Leader", 3400.0);
        EmployeeItem item18 =  new EmployeeItem("Amire", "Software Technical Leader", 3400.0);
        EmployeeItem item19 =  new EmployeeItem("Amier", "Software Technical Leader", 3400.0);
        EmployeeItem item20 = new EmployeeItem("Maya", "Programmer", 2200.0);


        alEmployeeList.add(item1);
        alEmployeeList.add(item2);
        alEmployeeList.add(item3);
        alEmployeeList.add(item4);
        alEmployeeList.add(item5);
        alEmployeeList.add(item6);
        alEmployeeList.add(item7);
        alEmployeeList.add(item8);
        alEmployeeList.add(item9);
        alEmployeeList.add(item10);
        alEmployeeList.add(item11);
        alEmployeeList.add(item12);
        alEmployeeList.add(item13);
        alEmployeeList.add(item14);
        alEmployeeList.add(item15);
        alEmployeeList.add(item16);
        alEmployeeList.add(item17);
        alEmployeeList.add(item18);
        alEmployeeList.add(item19);
        alEmployeeList.add(item20);

        caEmployee = new CustomAdapter(this, R.layout.employee_item2, alEmployeeList);

        lvEmployee.setAdapter(caEmployee);
    }
}

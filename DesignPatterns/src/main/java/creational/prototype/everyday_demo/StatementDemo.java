package creational.prototype.everyday_demo;

import java.util.ArrayList;
import java.util.List;

public class StatementDemo {

    public static void main(String[] args) {

        String sql = "select * from movies where title = ?";
        List<String> params = new ArrayList<>();
        params.add("Star Wars");

        Record record = new Record();

        Statement firstStatement = new Statement(sql, params, record);

        System.out.println(firstStatement.getSql());
        System.out.println(firstStatement.getParameters());
        System.out.println(firstStatement.getRecord());

        Statement secondStatement = firstStatement.clone();

        System.out.println(secondStatement.getSql());
        System.out.println(secondStatement.getParameters());
        System.out.println(secondStatement.getRecord());
    }
}

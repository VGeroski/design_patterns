package creational.prototype.everyday_demo;

import java.util.List;

public class Statement implements Cloneable {

    private String sql;
    private List<String> parameters;
    private Record record;

    public Statement(String sql, List<String> parameters, Record record) {
        this.sql = sql;
        this.parameters = parameters;
        this.record = record;
    }

    public Statement clone() {
        try {
            Statement cloned = (Statement) super.clone();
            // deep copy of Record (Record needs to implement Cloneable as well)
            cloned.setRecord(this.record.clone());
            return cloned;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return null;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }
}

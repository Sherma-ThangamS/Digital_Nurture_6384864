package org.example;

public interface ExternalApi {
    String getData();
    String getDataById(int id);
    void deleteData();
    void start();
    void execute();
    void finish();
}

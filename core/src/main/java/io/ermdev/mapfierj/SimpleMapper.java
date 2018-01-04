package io.ermdev.mapfierj;

import io.ermdev.mapfierj.cj7.Transaction;

import java.util.Collection;
import java.util.HashMap;

public class SimpleMapper {

    private Transaction transaction;

    public Transaction set(Object obj) {
        try {
            transaction=new Transaction(obj);
            return transaction;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Transaction set(HashMap<String, Object> map) {
        try {
            transaction=new Transaction(map);
            return transaction;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Transaction set(Collection collection) {
        return transaction=new Transaction(collection);
    }
}

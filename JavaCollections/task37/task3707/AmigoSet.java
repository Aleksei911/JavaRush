package com.javarush.task.task37.task3707;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class AmigoSet<E> extends AbstractSet<E> implements Serializable, Cloneable, Set<E> {

    private static final Object PRESENT=new Object();
    private transient HashMap<E,Object> map;
    AmigoSet(){
        map=new HashMap<>();
    }
    AmigoSet(Collection<? extends E> collection){
        int capacity = Math.max(16, (int) Math.floor(collection.size() / .75f)+1);
        map = new HashMap<>(capacity);

        for (E e : collection) {
            this.add(e);
        }
    }
    @Override
    public boolean add(Object e){
        return null==map.put((E) e,PRESENT);
    }

    @Override
    public int size(){
        return map.size();
    }


    @Override
    public Iterator iterator() {
        return (Iterator<HashMap.Entry<E,Object>>) map.keySet().iterator();
    }

    public boolean isEmpty(){
        return map.isEmpty();
    }

    public boolean contains(Object o){
        return map.containsKey(o);
    }

    public void clear(){
        map.clear();
    }

    @Override
    public boolean remove(Object o) {
        return null==map.remove(o);
    }

    public Object clone() throws InternalError {

        AmigoSet<E> object=null;
        try {
            object=new AmigoSet<>();
            object.map=(HashMap<E,Object>) map.clone();

        } catch (Exception e) {
            throw new InternalError();
        }
        return object;

    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeInt(HashMapReflectionHelper.callHiddenMethod(map, "capacity"));
        out.writeFloat(HashMapReflectionHelper.callHiddenMethod(map, "loadFactor"));
        out.writeInt(map.keySet().size());
        for(E e : map.keySet()) {
            out.writeObject(e);
        }
    }
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        int capacity = in.readInt();
        float loadFactor = in.readFloat();
        map = new HashMap(capacity, loadFactor);
        int size = in.readInt();
        for(int i = 0; i<size; i++) {
            map.put((E)in.readObject(), PRESENT);
        }
    }


}

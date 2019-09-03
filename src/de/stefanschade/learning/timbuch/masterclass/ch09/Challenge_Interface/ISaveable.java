package de.stefanschade.learning.timbuch.masterclass.ch09.Challenge_Interface;

import java.util.List;

public interface ISaveable {

    public List<Object> saveObject();

    public boolean restoreObject(List<Object> myList);

}

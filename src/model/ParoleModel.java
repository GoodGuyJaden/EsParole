package model;


import java.util.Collections;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ParoleModel {

	private ObservableList<String> elenco;
	
	public ParoleModel()
	{
		elenco = FXCollections.observableArrayList();
	}
	
	public void add(String s)
	{
		if(!s.equals(""))
		{
			elenco.add(s);
			Collections.sort(elenco);
		}
	}
	
	public void clear()
	{
		elenco.clear();
	}
	
	public void remove(ObservableList<String> elenco)
	{
		this.elenco.removeAll(elenco);
	}

	public ObservableList<String> getElenco() {
		return elenco;
	}

	
	
	
	
}

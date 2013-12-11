package com.medullan.task.generic;

import java.util.List;

public interface Crud<Model,Id> {
	public void add(Model obj);
	public void edit(Model obj);
	public void delete(Id obj);
	public Model get(Id obj);
	public List<Model> getAll();
}

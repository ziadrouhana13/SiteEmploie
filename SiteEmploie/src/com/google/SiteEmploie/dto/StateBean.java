package com.google.SiteEmploie.dto;

public class StateBean
{
private String[] states = new String[28];
public String[] getStates()
{
return this.states;
}
public void setStates(String[] states)
{
for (int i = 0; i < states.length; i++) {
this.states[i] = states[i];
}
}
}

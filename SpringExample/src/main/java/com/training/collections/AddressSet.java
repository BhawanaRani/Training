package com.training.collections;

import java.util.HashSet;
import java.util.Set;

public class AddressSet {
private Set<String> addresses;

public AddressSet() {
addresses=new HashSet<String>();
}

public Set<String> getAddresses() {
	return addresses;
}

public void setAddresses(Set<String> addresses) {
	this.addresses = addresses;
}

@Override
public String toString() {
	return "AddressSet [addresses=" + addresses + "]";
}

}

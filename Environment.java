import java.util.HashMap;
import java.util.Map.Entry;

class Environment {
    private HashMap<Variable,Boolean> variableValues = new HashMap<Variable,Boolean>();
    public Environment() { }	
    public void setVariable(Variable name, boolean value) {
	variableValues.put(name, value);
    }
    
    public boolean getVariable(Variable name){
	Boolean value = variableValues.get(name); 
	if (value == null) { System.err.println("Variable not defined: "+name); System.exit(-1); }
	return value;
    }
    
    public String toString() {
	String table = "";
	for (Entry<Variable,Boolean> entry : variableValues.entrySet()) {
	    table += entry.getKey() + "\t-> " + entry.getValue() + "\n";
	}
	return table;
    }   
}

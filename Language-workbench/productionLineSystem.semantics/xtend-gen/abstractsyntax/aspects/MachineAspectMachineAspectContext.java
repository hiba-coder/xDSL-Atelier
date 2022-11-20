package abstractsyntax.aspects;

import java.util.Map;
import productionlinesystem.abstractsyntax.Machine;

@SuppressWarnings("all")
public class MachineAspectMachineAspectContext {
  public static final MachineAspectMachineAspectContext INSTANCE = new MachineAspectMachineAspectContext();
  
  public static MachineAspectMachineAspectProperties getSelf(final Machine _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new abstractsyntax.aspects.MachineAspectMachineAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Machine, MachineAspectMachineAspectProperties> map = new java.util.WeakHashMap<productionlinesystem.abstractsyntax.Machine, abstractsyntax.aspects.MachineAspectMachineAspectProperties>();
  
  public Map<Machine, MachineAspectMachineAspectProperties> getMap() {
    return map;
  }
}

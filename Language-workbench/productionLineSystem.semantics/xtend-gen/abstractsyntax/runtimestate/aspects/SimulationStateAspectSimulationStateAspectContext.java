package abstractsyntax.runtimestate.aspects;

import java.util.Map;
import productionlinesystem.abstractsyntax.runtimestate.SimulationState;

@SuppressWarnings("all")
public class SimulationStateAspectSimulationStateAspectContext {
  public static final SimulationStateAspectSimulationStateAspectContext INSTANCE = new SimulationStateAspectSimulationStateAspectContext();
  
  public static SimulationStateAspectSimulationStateAspectProperties getSelf(final SimulationState _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new abstractsyntax.runtimestate.aspects.SimulationStateAspectSimulationStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<SimulationState, SimulationStateAspectSimulationStateAspectProperties> map = new java.util.WeakHashMap<productionlinesystem.abstractsyntax.runtimestate.SimulationState, abstractsyntax.runtimestate.aspects.SimulationStateAspectSimulationStateAspectProperties>();
  
  public Map<SimulationState, SimulationStateAspectSimulationStateAspectProperties> getMap() {
    return map;
  }
}

package abstractsyntax.runtimestate.aspects;

import java.util.Map;
import productionlinesystem.abstractsyntax.runtimestate.ContainerState;

@SuppressWarnings("all")
public class ContainerStateAspectContainerStateAspectContext {
  public static final ContainerStateAspectContainerStateAspectContext INSTANCE = new ContainerStateAspectContainerStateAspectContext();
  
  public static ContainerStateAspectContainerStateAspectProperties getSelf(final ContainerState _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new abstractsyntax.runtimestate.aspects.ContainerStateAspectContainerStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ContainerState, ContainerStateAspectContainerStateAspectProperties> map = new java.util.WeakHashMap<productionlinesystem.abstractsyntax.runtimestate.ContainerState, abstractsyntax.runtimestate.aspects.ContainerStateAspectContainerStateAspectProperties>();
  
  public Map<ContainerState, ContainerStateAspectContainerStateAspectProperties> getMap() {
    return map;
  }
}

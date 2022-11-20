package abstractsyntax.aspects;

import java.util.Map;
import productionlinesystem.abstractsyntax.Container;

@SuppressWarnings("all")
public class ContainerAspectContainerAspectContext {
  public static final ContainerAspectContainerAspectContext INSTANCE = new ContainerAspectContainerAspectContext();
  
  public static ContainerAspectContainerAspectProperties getSelf(final Container _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new abstractsyntax.aspects.ContainerAspectContainerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Container, ContainerAspectContainerAspectProperties> map = new java.util.WeakHashMap<productionlinesystem.abstractsyntax.Container, abstractsyntax.aspects.ContainerAspectContainerAspectProperties>();
  
  public Map<Container, ContainerAspectContainerAspectProperties> getMap() {
    return map;
  }
}

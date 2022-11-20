package abstractsyntax.aspects;

import java.util.Map;
import productionlinesystem.abstractsyntax.Conveyor;

@SuppressWarnings("all")
public class ConveyorAspectConveyorAspectContext {
  public static final ConveyorAspectConveyorAspectContext INSTANCE = new ConveyorAspectConveyorAspectContext();
  
  public static ConveyorAspectConveyorAspectProperties getSelf(final Conveyor _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new abstractsyntax.aspects.ConveyorAspectConveyorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Conveyor, ConveyorAspectConveyorAspectProperties> map = new java.util.WeakHashMap<productionlinesystem.abstractsyntax.Conveyor, abstractsyntax.aspects.ConveyorAspectConveyorAspectProperties>();
  
  public Map<Conveyor, ConveyorAspectConveyorAspectProperties> getMap() {
    return map;
  }
}

package abstractsyntax.runtimestate.aspects;

import java.util.Map;
import productionlinesystem.abstractsyntax.runtimestate.ProductionLineElementState;

@SuppressWarnings("all")
public class ProductionLineElementStateAspectProductionLineElementStateAspectContext {
  public static final ProductionLineElementStateAspectProductionLineElementStateAspectContext INSTANCE = new ProductionLineElementStateAspectProductionLineElementStateAspectContext();
  
  public static ProductionLineElementStateAspectProductionLineElementStateAspectProperties getSelf(final ProductionLineElementState _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new abstractsyntax.runtimestate.aspects.ProductionLineElementStateAspectProductionLineElementStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ProductionLineElementState, ProductionLineElementStateAspectProductionLineElementStateAspectProperties> map = new java.util.WeakHashMap<productionlinesystem.abstractsyntax.runtimestate.ProductionLineElementState, abstractsyntax.runtimestate.aspects.ProductionLineElementStateAspectProductionLineElementStateAspectProperties>();
  
  public Map<ProductionLineElementState, ProductionLineElementStateAspectProductionLineElementStateAspectProperties> getMap() {
    return map;
  }
}

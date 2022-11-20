package abstractsyntax.aspects;

import java.util.Map;
import productionlinesystem.abstractsyntax.ProductionLineElement;

@SuppressWarnings("all")
public class ProductionLineElementAspectProductionLineElementAspectContext {
  public static final ProductionLineElementAspectProductionLineElementAspectContext INSTANCE = new ProductionLineElementAspectProductionLineElementAspectContext();
  
  public static ProductionLineElementAspectProductionLineElementAspectProperties getSelf(final ProductionLineElement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new abstractsyntax.aspects.ProductionLineElementAspectProductionLineElementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ProductionLineElement, ProductionLineElementAspectProductionLineElementAspectProperties> map = new java.util.WeakHashMap<productionlinesystem.abstractsyntax.ProductionLineElement, abstractsyntax.aspects.ProductionLineElementAspectProductionLineElementAspectProperties>();
  
  public Map<ProductionLineElement, ProductionLineElementAspectProductionLineElementAspectProperties> getMap() {
    return map;
  }
}

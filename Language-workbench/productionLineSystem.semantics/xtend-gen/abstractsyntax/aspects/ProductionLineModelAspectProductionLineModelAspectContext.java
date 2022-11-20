package abstractsyntax.aspects;

import java.util.Map;
import productionlinesystem.abstractsyntax.ProductionLineModel;

@SuppressWarnings("all")
public class ProductionLineModelAspectProductionLineModelAspectContext {
  public static final ProductionLineModelAspectProductionLineModelAspectContext INSTANCE = new ProductionLineModelAspectProductionLineModelAspectContext();
  
  public static ProductionLineModelAspectProductionLineModelAspectProperties getSelf(final ProductionLineModel _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new abstractsyntax.aspects.ProductionLineModelAspectProductionLineModelAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ProductionLineModel, ProductionLineModelAspectProductionLineModelAspectProperties> map = new java.util.WeakHashMap<productionlinesystem.abstractsyntax.ProductionLineModel, abstractsyntax.aspects.ProductionLineModelAspectProductionLineModelAspectProperties>();
  
  public Map<ProductionLineModel, ProductionLineModelAspectProductionLineModelAspectProperties> getMap() {
    return map;
  }
}

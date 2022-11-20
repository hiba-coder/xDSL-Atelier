package abstractsyntax.aspects;

import java.util.Map;
import productionlinesystem.abstractsyntax.GenHandle;

@SuppressWarnings("all")
public class GenHandleAspectGenHandleAspectContext {
  public static final GenHandleAspectGenHandleAspectContext INSTANCE = new GenHandleAspectGenHandleAspectContext();
  
  public static GenHandleAspectGenHandleAspectProperties getSelf(final GenHandle _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new abstractsyntax.aspects.GenHandleAspectGenHandleAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<GenHandle, GenHandleAspectGenHandleAspectProperties> map = new java.util.WeakHashMap<productionlinesystem.abstractsyntax.GenHandle, abstractsyntax.aspects.GenHandleAspectGenHandleAspectProperties>();
  
  public Map<GenHandle, GenHandleAspectGenHandleAspectProperties> getMap() {
    return map;
  }
}

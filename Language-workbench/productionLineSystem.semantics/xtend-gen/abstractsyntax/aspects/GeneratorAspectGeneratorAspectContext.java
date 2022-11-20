package abstractsyntax.aspects;

import java.util.Map;
import productionlinesystem.abstractsyntax.Generator;

@SuppressWarnings("all")
public class GeneratorAspectGeneratorAspectContext {
  public static final GeneratorAspectGeneratorAspectContext INSTANCE = new GeneratorAspectGeneratorAspectContext();
  
  public static GeneratorAspectGeneratorAspectProperties getSelf(final Generator _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new abstractsyntax.aspects.GeneratorAspectGeneratorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Generator, GeneratorAspectGeneratorAspectProperties> map = new java.util.WeakHashMap<productionlinesystem.abstractsyntax.Generator, abstractsyntax.aspects.GeneratorAspectGeneratorAspectProperties>();
  
  public Map<Generator, GeneratorAspectGeneratorAspectProperties> getMap() {
    return map;
  }
}

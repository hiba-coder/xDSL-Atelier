// AspectJ classes that have been aspectized and name
package productionlinesystem.abstractsyntax;
public aspect AspectJGenHandle{
void around (productionlinesystem.abstractsyntax.GenHandle self)  :target (self) && (call ( void productionlinesystem.abstractsyntax.GenHandle.start(  ) ) ) { abstractsyntax.aspects.GenHandleAspect.start(self );}

}

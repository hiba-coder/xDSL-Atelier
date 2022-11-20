// AspectJ classes that have been aspectized and name
package productionlinesystem.abstractsyntax;
public aspect AspectJGenHead{
void around (productionlinesystem.abstractsyntax.GenHead self)  :target (self) && (call ( void productionlinesystem.abstractsyntax.GenHead.start(  ) ) ) { abstractsyntax.aspects.GenHeadAspect.start(self );}

}

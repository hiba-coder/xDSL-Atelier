// AspectJ classes that have been aspectized and name
package productionlinesystem.abstractsyntax;
public aspect AspectJAssembler{
void around (productionlinesystem.abstractsyntax.Assembler self)  :target (self) && (call ( void productionlinesystem.abstractsyntax.Assembler.start(  ) ) ) { abstractsyntax.aspects.AssemblerAspect.start(self );}

}

package abstractsyntax.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import productionlinesystem.abstractsyntax.AbstractsyntaxFactory;
import productionlinesystem.abstractsyntax.Assembler;
import productionlinesystem.abstractsyntax.Hammer;
import productionlinesystem.abstractsyntax.Handle;
import productionlinesystem.abstractsyntax.Head;
import productionlinesystem.abstractsyntax.Part;

@Aspect(className = Assembler.class)
@SuppressWarnings("all")
public class AssemblerAspect extends MachineAspect {
  @Step
  @OverrideAspectMethod
  @ReplaceAspectMethod
  public static void start(final Assembler _self) {
    final abstractsyntax.aspects.AssemblerAspectAssemblerAspectProperties _self_ = abstractsyntax.aspects.AssemblerAspectAssemblerAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void start()
    if (_self instanceof productionlinesystem.abstractsyntax.Assembler){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			abstractsyntax.aspects.AssemblerAspect._privk3_start(_self_, (productionlinesystem.abstractsyntax.Assembler)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Assembler", "start");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  private static void super_start(final Assembler _self) {
    final abstractsyntax.aspects.MachineAspectMachineAspectProperties _self_ = abstractsyntax.aspects.MachineAspectMachineAspectContext.getSelf(_self);
     abstractsyntax.aspects.MachineAspect._privk3_start(_self_, _self);
  }
  
  protected static void _privk3_start(final AssemblerAspectAssemblerAspectProperties _self_, final Assembler _self) {
    if ((IterableExtensions.<Part>exists(ContainerAspect.currentParts(_self.getIn()), ((Function1<Part, Boolean>) (Part p) -> {
      return Boolean.valueOf((p instanceof Head));
    })) && IterableExtensions.<Part>exists(ContainerAspect.currentParts(_self.getIn()), ((Function1<Part, Boolean>) (Part p) -> {
      return Boolean.valueOf((p instanceof Handle));
    })))) {
      String _name = _self.getName();
      String _plus = ("I am in the Assembler machine name \'" + _name);
      String _plus_1 = (_plus + "\'");
      InputOutput.<String>println(_plus_1);
      final Function1<Part, Boolean> _function = (Part e) -> {
        return Boolean.valueOf((e instanceof Handle));
      };
      Part anHandle = ((Part[])Conversions.unwrapArray(IterableExtensions.<Part>filter(ContainerAspect.currentParts(_self.getIn()), _function), Part.class))[0];
      final Function1<Part, Boolean> _function_1 = (Part e) -> {
        return Boolean.valueOf((e instanceof Head));
      };
      Part aHead = ((Part[])Conversions.unwrapArray(IterableExtensions.<Part>filter(ContainerAspect.currentParts(_self.getIn()), _function_1), Part.class))[0];
      ContainerAspect.currentParts(_self.getIn()).remove(anHandle);
      ContainerAspect.currentParts(_self.getIn()).remove(aHead);
      Hammer aHammer = AbstractsyntaxFactory.eINSTANCE.createHammer();
      ContainerAspect.currentParts(_self.getOut()).add(aHammer);
      return;
    }
  }
}

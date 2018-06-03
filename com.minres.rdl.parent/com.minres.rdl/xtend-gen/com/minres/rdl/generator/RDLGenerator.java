/**
 * generated by Xtext 2.12.0
 */
package com.minres.rdl.generator;

import com.minres.rdl.generator.AddrmapGenerator;
import com.minres.rdl.generator.RdlBaseGenerator;
import com.minres.rdl.generator.RegfileGenerator;
import com.minres.rdl.rdl.ComponentDefinition;
import com.minres.rdl.rdl.ComponentDefinitionType;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class RDLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Function1<Notifier, Boolean> _function = (Notifier it) -> {
      return Boolean.valueOf((it instanceof ComponentDefinition));
    };
    final Function1<Notifier, ComponentDefinition> _function_1 = (Notifier it) -> {
      return ((ComponentDefinition) it);
    };
    final Procedure1<ComponentDefinition> _function_2 = (ComponentDefinition it) -> {
      final RdlBaseGenerator gen = this.fileGenerator(it);
      if ((gen != null)) {
        final String header = gen.generateHeader();
        if (((header != null) && (header.length() > 0))) {
          String _name = it.getName();
          String _plus = (_name + ".h");
          fsa.generateFile(_plus, this.outputConfig(fsa, "incl-out"), header);
        }
        final String source = gen.generateSource();
        if (((source != null) && (source.length() > 0))) {
          String _name_1 = it.getName();
          String _plus_1 = (_name_1 + ".cpp");
          fsa.generateFile(_plus_1, this.outputConfig(fsa, "src-out"), source);
        }
      }
    };
    IteratorExtensions.<ComponentDefinition>forEach(IteratorExtensions.<Notifier, ComponentDefinition>map(IteratorExtensions.<Notifier>filter(resource.getResourceSet().getAllContents(), _function), _function_1), _function_2);
  }
  
  public RdlBaseGenerator fileGenerator(final ComponentDefinition definition) {
    RdlBaseGenerator _switchResult = null;
    ComponentDefinitionType _type = definition.getType();
    if (_type != null) {
      switch (_type) {
        case REGFILE:
          _switchResult = new RegfileGenerator(definition);
          break;
        case ADDRMAP:
          _switchResult = new AddrmapGenerator(definition);
          break;
        default:
          _switchResult = null;
          break;
      }
    } else {
      _switchResult = null;
    }
    return _switchResult;
  }
  
  public String outputConfig(final IFileSystemAccess2 fsa, final String string) {
    String output_config = string;
    try {
      fsa.getURI("", output_config);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        output_config = "DEFAULT_OUTPUT";
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return output_config;
  }
}

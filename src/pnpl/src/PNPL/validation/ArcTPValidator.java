/**
 *
 * $Id$
 */
package PNPL.validation;

import PNPL.Place;
import PNPL.Transition;

/**
 * A sample validator interface for {@link PNPL.ArcTP}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ArcTPValidator {
	boolean validate();

	boolean validateSource(Transition value);
	boolean validateTarget(Place value);
}

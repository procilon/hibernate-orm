/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.procedure.internal;

import javax.persistence.ParameterMode;

import org.hibernate.type.Type;

/**
 * Represents a registered positional parameter
 *
 * @author Steve Ebersole
 */
public class PositionalParameterRegistration<T> extends AbstractParameterRegistrationImpl<T> {
	PositionalParameterRegistration(
			ProcedureCallImpl procedureCall,
			Integer position,
			ParameterMode mode,
			Class<T> type) {
		super( procedureCall, position, mode, type );
	}

	PositionalParameterRegistration(
			ProcedureCallImpl procedureCall,
			Integer position,
			ParameterMode mode,
			Class<T> type,
			Type hibernateType) {
		super( procedureCall, position, mode, type, hibernateType );
	}
}

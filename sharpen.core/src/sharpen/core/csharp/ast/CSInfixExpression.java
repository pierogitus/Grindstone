/* Copyright (C) 2004 - 2008  Versant Inc.  http://www.db4o.com

This file is part of the sharpen open source java to c# translator.

sharpen is free software; you can redistribute it and/or modify it under
the terms of version 2 of the GNU General Public License as published
by the Free Software Foundation and as clarified by db4objects' GPL 
interpretation policy, available at
http://www.db4o.com/about/company/legalpolicies/gplinterpretation/
Alternatively you can write to db4objects, Inc., 1900 S Norfolk Street,
Suite 350, San Mateo, CA 94403, USA.

sharpen is distributed in the hope that it will be useful, but WITHOUT ANY
WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
for more details.

You should have received a copy of the GNU General Public License along
with this program; if not, write to the Free Software Foundation, Inc.,
59 Temple Place - Suite 330, Boston, MA  02111-1307, USA. */

package sharpen.core.csharp.ast;

import java.util.*;

public class CSInfixExpression extends CSExpression {

	private String _operator;
	private CSExpression _lhs;
	private CSExpression _rhs;
	private List<CSExpression> _extendedOperands = new ArrayList<CSExpression>();

	public CSInfixExpression(String operator, CSExpression lhs, CSExpression rhs) {
		_operator = operator;
		_lhs = lhs;
		_rhs = rhs;
	}
	
	public void addExtendedOperand(CSExpression extendedOperand){
		_extendedOperands.add(extendedOperand);
	}
	
	public String operator() {
		return _operator;
	}
	
	public CSExpression lhs() {
		return _lhs;
	}
	
	public CSExpression rhs() {
		return _rhs;
	}
	
	public List<CSExpression> extendedOperands() {
		return _extendedOperands;
	}

	public void accept(CSVisitor visitor) {
		visitor.visit(this);
	}

}

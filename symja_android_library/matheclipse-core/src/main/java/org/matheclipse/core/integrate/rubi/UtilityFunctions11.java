package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;

import org.matheclipse.core.interfaces.IAST;
/** 
 * UtilityFunctions rules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class UtilityFunctions11 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
ISetDelayed(216,FixSimplify(Times(Power(Plus(a_,b_),m_DEFAULT),Power(Plus(c_,d_),n_),w_DEFAULT)),
    Condition(With(List(Set(q,Simplify(Times(b,Power(d,CN1))))),Condition(FixSimplify(Times(w,Power(q,m),Power(Plus(c,d),Plus(m,n)))),FreeQ(q,Plus))),And(IntegerQ(m),Not(IntegerQ(n)),EqQ(Subtract(Times(b,c),Times(a,d)),C0))));
ISetDelayed(217,FixSimplify(Times(Power(Plus(Times(Power(a_,m_DEFAULT),u_DEFAULT),Times(Power(a_,n_DEFAULT),v_DEFAULT)),t_DEFAULT),w_DEFAULT)),
    Condition(FixSimplify(Times(Power(a,Times(m,t)),w,Power(Plus(u,Times(Power(a,Subtract(n,m)),v)),t))),And(Not(RationalQ(a)),IntegerQ(t),RationalQ(m,n),And(Less(C0,m),LessEqual(m,n)))));
ISetDelayed(218,FixSimplify(Times(w_DEFAULT,Power(Plus(Times(Power(a_,m_DEFAULT),u_DEFAULT),Times(Power(a_,n_DEFAULT),v_DEFAULT),Times(Power(a_,p_DEFAULT),z_DEFAULT)),t_DEFAULT))),
    Condition(FixSimplify(Times(Power(a,Times(m,t)),w,Power(Plus(u,Times(Power(a,Subtract(n,m)),v),Times(Power(a,Subtract(p,m)),z)),t))),And(Not(RationalQ(a)),IntegerQ(t),RationalQ(m,n,p),And(Less(C0,m),LessEqual(m,n),LessEqual(n,p)))));
ISetDelayed(219,FixSimplify(Times(w_DEFAULT,Power(Plus(Times(Power(a_,m_DEFAULT),u_DEFAULT),Times(Power(a_,n_DEFAULT),v_DEFAULT),Times(Power(a_,q_DEFAULT),y_DEFAULT),Times(Power(a_,p_DEFAULT),z_DEFAULT)),t_DEFAULT))),
    Condition(FixSimplify(Times(Power(a,Times(m,t)),w,Power(Plus(u,Times(Power(a,Subtract(n,m)),v),Times(Power(a,Subtract(p,m)),z),Times(Power(a,Subtract(q,m)),y)),t))),And(Not(RationalQ(a)),IntegerQ(t),RationalQ(m,n,p),And(Less(C0,m),LessEqual(m,n),LessEqual(n,p),LessEqual(p,q)))));
ISetDelayed(220,FixSimplify(Times(Plus(u_DEFAULT,Times(b_DEFAULT,Sqrt(v_)),Times(c_DEFAULT,Sqrt(v_)),Times(d_DEFAULT,Sqrt(v_)),Times(a_DEFAULT,Sqrt($p(v,Plus)))),w_DEFAULT)),
    FixSimplify(Times(w,Plus(u,Times(FixSimplify(Plus(a,b,c,d)),Sqrt(v))))));
ISetDelayed(221,FixSimplify(Times(Plus(u_DEFAULT,Times(b_DEFAULT,Sqrt(v_)),Times(c_DEFAULT,Sqrt(v_)),Times(a_DEFAULT,Sqrt($p(v,Plus)))),w_DEFAULT)),
    FixSimplify(Times(w,Plus(u,Times(FixSimplify(Plus(a,b,c)),Sqrt(v))))));
ISetDelayed(222,FixSimplify(Times(Plus(u_DEFAULT,Times(b_DEFAULT,Sqrt(v_)),Times(a_DEFAULT,Sqrt($p(v,Plus)))),w_DEFAULT)),
    FixSimplify(Times(w,Plus(u,Times(FixSimplify(Plus(a,b)),Sqrt(v))))));
ISetDelayed(223,FixSimplify(Times(u_DEFAULT,Power(v_,m_),Power(w_,n_))),
    Condition(Negate(FixSimplify(Times(u,Power(v,Subtract(m,C1))))),And(RationalQ(m),Not(RationalQ(w)),FractionQ(n),Less(n,C0),EqQ(Plus(v,Power(w,Negate(n))),C0))));
ISetDelayed(224,FixSimplify(Times(u_DEFAULT,Power(v_,m_),Power(w_,n_DEFAULT))),
    Condition(Times(Power(CN1,n),FixSimplify(Times(u,Power(v,Plus(m,n))))),And(RationalQ(m),Not(RationalQ(w)),IntegerQ(n),EqQ(Plus(v,w),C0))));
ISetDelayed(225,FixSimplify(Times(u_DEFAULT,Power(Negate(Power(v_,p_DEFAULT)),m_),Power(w_,n_DEFAULT))),
    Condition(Times(Power(CN1,Times(n,Power(p,CN1))),FixSimplify(Times(u,Power(Negate(Power(v,p)),Plus(m,Times(n,Power(p,CN1))))))),And(RationalQ(m),Not(RationalQ(w)),IntegerQ(Times(n,Power(p,CN1))),EqQ(Subtract(v,w),C0))));
ISetDelayed(226,FixSimplify(Times(u_DEFAULT,Power(Negate(Power(v_,p_DEFAULT)),m_),Power(w_,n_DEFAULT))),
    Condition(Times(Power(CN1,Plus(n,Times(n,Power(p,CN1)))),FixSimplify(Times(u,Power(Negate(Power(v,p)),Plus(m,Times(n,Power(p,CN1))))))),And(RationalQ(m),Not(RationalQ(w)),IntegersQ(n,Times(n,Power(p,CN1))),EqQ(Plus(v,w),C0))));
ISetDelayed(227,FixSimplify(Times(Power(Subtract(a_,b_),m_DEFAULT),Power(Plus(a_,b_),m_DEFAULT),u_DEFAULT)),
    Condition(Times(u,Power(Subtract(Sqr(a),Sqr(b)),m)),And(IntegerQ(m),AtomQ(a),AtomQ(b))));
ISetDelayed(228,FixSimplify(Times(Power(Plus(Times(c_Symbol,Sqr(d_Symbol)),Times(CN1,e_Symbol,Plus(Times(b_Symbol,d_Symbol),Times(CN1,a_Symbol,e_Symbol)))),m_DEFAULT),u_DEFAULT)),
    Condition(Times(u,Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),m)),And(RationalQ(m),OrderedQ(List(a,b,c,d,e)))));
ISetDelayed(229,FixSimplify(Times(Power(Plus(Times(c_Symbol,Sqr(d_Symbol)),Times(e_Symbol,Plus(Times(CN1,b_Symbol,d_Symbol),Times(a_Symbol,e_Symbol)))),m_DEFAULT),u_DEFAULT)),
    Condition(Times(u,Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),m)),And(RationalQ(m),OrderedQ(List(a,b,c,d,e)))));
ISetDelayed(230,FixSimplify(Times(Power(Plus(Times(CN1,c_Symbol,Sqr(d_Symbol)),Times(e_Symbol,Plus(Times(b_Symbol,d_Symbol),Times(CN1,a_Symbol,e_Symbol)))),m_DEFAULT),u_DEFAULT)),
    Condition(Times(Power(CN1,m),u,Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),m)),And(IntegerQ(m),OrderedQ(List(a,b,c,d,e)))));
ISetDelayed(231,FixSimplify(Times(Power(Plus(Times(CN1,c_Symbol,Sqr(d_Symbol)),Times(CN1,e_Symbol,Plus(Times(CN1,b_Symbol,d_Symbol),Times(a_Symbol,e_Symbol)))),m_DEFAULT),u_DEFAULT)),
    Condition(Times(Power(CN1,m),u,Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),m)),And(RationalQ(m),OrderedQ(List(a,b,c,d,e)))));
ISetDelayed(232,FixSimplify(u_),
    u);
ISetDelayed(233,SimpFixFactor(Power(Plus(Times(a_DEFAULT,Complex(C0,c_)),Times(b_DEFAULT,Complex(C0,d_))),p_DEFAULT),x_),
    Condition(Times(Power(CI,p),SimpFixFactor(Power(Plus(Times(a,c),Times(b,d)),p),x)),IntegerQ(p)));
ISetDelayed(234,SimpFixFactor(Power(Plus(Times(a_DEFAULT,Complex(C0,d_)),Times(b_DEFAULT,Complex(C0,e_)),Times(c_DEFAULT,Complex(C0,f_))),p_DEFAULT),x_),
    Condition(Times(Power(CI,p),SimpFixFactor(Power(Plus(Times(a,d),Times(b,e),Times(c,f)),p),x)),IntegerQ(p)));
ISetDelayed(235,SimpFixFactor(Power(Plus(Times(a_DEFAULT,Power(c_,r_)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT),x_),
    Condition(Times(Power(c,Times(r,p)),SimpFixFactor(Power(Plus(a,Times(b,Power(Power(c,r),CN1),Power(x,n))),p),x)),And(FreeQ(List(a,b,c),x),IntegersQ(n,p),AtomQ(c),RationalQ(r),Less(r,C0))));
ISetDelayed(236,SimpFixFactor(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(c_,r_),Power(x_,n_DEFAULT))),p_DEFAULT),x_),
    Condition(Times(Power(c,Times(r,p)),SimpFixFactor(Power(Plus(Times(a,Power(Power(c,r),CN1)),Times(b,Power(x,n))),p),x)),And(FreeQ(List(a,b,c),x),IntegersQ(n,p),AtomQ(c),RationalQ(r),Less(r,C0))));
ISetDelayed(237,SimpFixFactor(Power(Plus(Times(a_DEFAULT,Power(c_,s_DEFAULT)),Times(b_DEFAULT,Power(c_,r_DEFAULT),Power(x_,n_DEFAULT))),p_DEFAULT),x_),
    Condition(Times(Power(c,Times(s,p)),SimpFixFactor(Power(Plus(a,Times(b,Power(c,Subtract(r,s)),Power(x,n))),p),x)),And(FreeQ(List(a,b,c),x),IntegersQ(n,p),RationalQ(s,r),And(Less(C0,s),LessEqual(s,r)),UnsameQ(Power(c,Times(s,p)),CN1))));
ISetDelayed(238,SimpFixFactor(Power(Plus(Times(a_DEFAULT,Power(c_,s_DEFAULT)),Times(b_DEFAULT,Power(c_,r_DEFAULT),Power(x_,n_DEFAULT))),p_DEFAULT),x_),
    Condition(Times(Power(c,Times(r,p)),SimpFixFactor(Power(Plus(Times(a,Power(c,Subtract(s,r))),Times(b,Power(x,n))),p),x)),And(FreeQ(List(a,b,c),x),IntegersQ(n,p),RationalQ(s,r),Less(C0,r,s),UnsameQ(Power(c,Times(r,p)),CN1))));
ISetDelayed(239,SimpFixFactor(u_,x_),
    u);
ISetDelayed(240,FactorNumericGcd(u_),
    If(And(PowerQ(u),RationalQ(Part(u,C2))),Power(FactorNumericGcd(Part(u,C1)),Part(u,C2)),If(ProductQ(u),Map($rubi("FactorNumericGcd"),u),If(SumQ(u),With(List(Set(g,Apply(GCD,Map($rubi("NumericFactor"),Apply(List,u))))),Times(g,Map(Function(Times(Slot1,Power(g,CN1))),u))),u))));
  }
}
}
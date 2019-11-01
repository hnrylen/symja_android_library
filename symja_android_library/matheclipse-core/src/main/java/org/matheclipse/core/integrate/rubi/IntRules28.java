package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules28 { 
  public static IAST RULES = List( 
IIntegrate(561,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(u_,n_))),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(v_,n_))),q_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,Power(w_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),CN1),Subst(Int(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(e,Times(f,Power(x,n))),r)),x),x,u),x),And(FreeQ(List(a,b,c,d,e,f,p,n,q,r),x),EqQ(u,v),EqQ(u,w),LinearQ(u,x),NeQ(u,x)))),
IIntegrate(562,Int(Times(Power(Plus(c_,Times(d_DEFAULT,Power(x_,$p("mn",true)))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_DEFAULT))),r_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(d,Times(c,Power(x,n))),q),Power(Plus(e,Times(f,Power(x,n))),r),Power(Power(x,Times(n,q)),CN1)),x),And(FreeQ(List(a,b,c,d,e,f,n,p,r),x),EqQ($s("mn"),Negate(n)),IntegerQ(q)))),
IIntegrate(563,Int(Times(Power(Plus(c_,Times(d_DEFAULT,Power(x_,$p("mn",true)))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_DEFAULT))),r_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,Times(n,Plus(p,r))),Power(Plus(b,Times(a,Power(Power(x,n),CN1))),p),Power(Plus(c,Times(d,Power(Power(x,n),CN1))),q),Power(Plus(f,Times(e,Power(Power(x,n),CN1))),r)),x),And(FreeQ(List(a,b,c,d,e,f,n,q),x),EqQ($s("mn"),Negate(n)),IntegerQ(p),IntegerQ(r)))),
IIntegrate(564,Int(Times(Power(Plus(c_,Times(d_DEFAULT,Power(x_,$p("mn",true)))),q_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_DEFAULT))),r_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(x,Times(n,FracPart(q))),Power(Plus(c,Times(d,Power(Power(x,n),CN1))),FracPart(q)),Power(Power(Plus(d,Times(c,Power(x,n))),FracPart(q)),CN1)),Int(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(d,Times(c,Power(x,n))),q),Power(Plus(e,Times(f,Power(x,n))),r),Power(Power(x,Times(n,q)),CN1)),x),x),And(FreeQ(List(a,b,c,d,e,f,n,p,q,r),x),EqQ($s("mn"),Negate(n)),Not(IntegerQ(q))))),
IIntegrate(565,Int(Times(Power(Plus($p("e1"),Times($p("f1",true),Power(x_,$p("n2",true)))),r_DEFAULT),Power(Plus($p("e2"),Times($p("f2",true),Power(x_,$p("n2",true)))),r_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(Times($s("e1"),$s("e2")),Times($s("f1"),$s("f2"),Power(x,n))),r)),x),And(FreeQ(List(a,b,c,d,$s("e1"),$s("f1"),$s("e2"),$s("f2"),n,p,q,r),x),EqQ($s("n2"),Times(C1D2,n)),EqQ(Plus(Times($s("e2"),$s("f1")),Times($s("e1"),$s("f2"))),C0),Or(IntegerQ(r),And(GtQ($s("e1"),C0),GtQ($s("e2"),C0)))))),
IIntegrate(566,Int(Times(Power(Plus($p("e1"),Times($p("f1",true),Power(x_,$p("n2",true)))),r_DEFAULT),Power(Plus($p("e2"),Times($p("f2",true),Power(x_,$p("n2",true)))),r_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Plus($s("e1"),Times($s("f1"),Power(x,Times(C1D2,n)))),FracPart(r)),Power(Plus($s("e2"),Times($s("f2"),Power(x,Times(C1D2,n)))),FracPart(r)),Power(Power(Plus(Times($s("e1"),$s("e2")),Times($s("f1"),$s("f2"),Power(x,n))),FracPart(r)),CN1)),Int(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(Times($s("e1"),$s("e2")),Times($s("f1"),$s("f2"),Power(x,n))),r)),x),x),And(FreeQ(List(a,b,c,d,$s("e1"),$s("f1"),$s("e2"),$s("f2"),n,p,q,r),x),EqQ($s("n2"),Times(C1D2,n)),EqQ(Plus(Times($s("e2"),$s("f1")),Times($s("e1"),$s("f2"))),C0)))),
IIntegrate(567,Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Times(b_DEFAULT,Power(x_,n_)),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(g,m),Power(Times(n,Power(b,Subtract(Simplify(Times(Plus(m,C1),Power(n,CN1))),C1))),CN1)),Subst(Int(Times(Power(Times(b,x),Subtract(Plus(p,Simplify(Times(Plus(m,C1),Power(n,CN1)))),C1)),Power(Plus(c,Times(d,x)),q),Power(Plus(e,Times(f,x)),r)),x),x,Power(x,n)),x),And(FreeQ(List(b,c,d,e,f,g,m,n,p,q,r),x),Or(IntegerQ(m),GtQ(g,C0)),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,CN1))))))),
IIntegrate(568,Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Times(b_DEFAULT,Power(x_,n_DEFAULT)),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(g,m),Power(b,IntPart(p)),Power(Times(b,Power(x,n)),FracPart(p)),Power(Power(x,Times(n,FracPart(p))),CN1)),Int(Times(Power(x,Plus(m,Times(n,p))),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(e,Times(f,Power(x,n))),r)),x),x),And(FreeQ(List(b,c,d,e,f,g,m,n,p,q,r),x),Or(IntegerQ(m),GtQ(g,C0)),Not(IntegerQ(Simplify(Times(Plus(m,C1),Power(n,CN1)))))))),
IIntegrate(569,Int(Times(Power(Times(g_,x_),m_),Power(Times(b_DEFAULT,Power(x_,n_DEFAULT)),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(g,IntPart(m)),Power(Times(g,x),FracPart(m)),Power(Power(x,FracPart(m)),CN1)),Int(Times(Power(x,m),Power(Times(b,Power(x,n)),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(e,Times(f,Power(x,n))),r)),x),x),And(FreeQ(List(b,c,d,e,f,g,m,n,p,q,r),x),Not(IntegerQ(m))))),
IIntegrate(570,Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(g,x),m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(e,Times(f,Power(x,n))),r)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,m,n),x),IGtQ(p,CN2),IGtQ(q,C0),IGtQ(r,C0)))),
IIntegrate(571,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q),Power(Plus(e,Times(f,x)),r)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p,q,r),x),EqQ(Plus(m,Negate(n),C1),C0)))),
IIntegrate(572,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,Plus(m,Times(n,Plus(p,q,r)))),Power(Plus(b,Times(a,Power(Power(x,n),CN1))),p),Power(Plus(d,Times(c,Power(Power(x,n),CN1))),q),Power(Plus(f,Times(e,Power(Power(x,n),CN1))),r)),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),IntegersQ(p,q,r),NegQ(n)))),
IIntegrate(573,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,CN1),Subst(Int(Times(Power(x,Subtract(Simplify(Times(Plus(m,C1),Power(n,CN1))),C1)),Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q),Power(Plus(e,Times(f,x)),r)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p,q,r),x),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,CN1))))))),
IIntegrate(574,Int(Times(Power(Times(g_,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(g,IntPart(m)),Power(Times(g,x),FracPart(m)),Power(Power(x,FracPart(m)),CN1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(e,Times(f,Power(x,n))),r)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,m,n,p,q,r),x),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,CN1))))))),
IIntegrate(575,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(With(List(Set(k,GCD(Plus(m,C1),n))),Condition(Dist(Power(k,CN1),Subst(Int(Times(Power(x,Subtract(Times(Plus(m,C1),Power(k,CN1)),C1)),Power(Plus(a,Times(b,Power(x,Times(n,Power(k,CN1))))),p),Power(Plus(c,Times(d,Power(x,Times(n,Power(k,CN1))))),q),Power(Plus(e,Times(f,Power(x,Times(n,Power(k,CN1))))),r)),x),x,Power(x,k)),x),Unequal(k,C1))),And(FreeQ(List(a,b,c,d,e,f,p,q,r),x),IGtQ(n,C0),IntegerQ(m)))),
IIntegrate(576,Int(Times(Power(Times(g_DEFAULT,x_),m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_)),x_Symbol),
    Condition(With(List(Set(k,Denominator(m))),Dist(Times(k,Power(g,CN1)),Subst(Int(Times(Power(x,Subtract(Times(k,Plus(m,C1)),C1)),Power(Plus(a,Times(b,Power(x,Times(k,n)),Power(Power(g,n),CN1))),p),Power(Plus(c,Times(d,Power(x,Times(k,n)),Power(Power(g,n),CN1))),q),Power(Plus(e,Times(f,Power(x,Times(k,n)),Power(Power(g,n),CN1))),r)),x),x,Power(Times(g,x),Power(k,CN1))),x)),And(FreeQ(List(a,b,c,d,e,f,g,p,q,r),x),IGtQ(n,C0),FractionQ(m)))),
IIntegrate(577,Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Plus(e_,Times(f_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Subtract(Times(b,e),Times(a,f)),Power(Times(g,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Power(Times(a,b,g,n,Plus(p,C1)),CN1)),x)),Dist(Power(Times(a,b,n,Plus(p,C1)),CN1),Int(Times(Power(Times(g,x),m),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Subtract(q,C1)),Simp(Plus(Times(c,Plus(Times(b,e,n,Plus(p,C1)),Times(Subtract(Times(b,e),Times(a,f)),Plus(m,C1)))),Times(d,Plus(Times(b,e,n,Plus(p,C1)),Times(Subtract(Times(b,e),Times(a,f)),Plus(m,Times(n,q),C1))),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,m),x),IGtQ(n,C0),LtQ(p,CN1),GtQ(q,C0),Not(And(EqQ(q,C1),SimplerQ(Subtract(Times(b,c),Times(a,d)),Subtract(Times(b,e),Times(a,f)))))))),
IIntegrate(578,Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_),Plus(e_,Times(f_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Subtract(Simp(Times(Power(g,Subtract(n,C1)),Subtract(Times(b,e),Times(a,f)),Power(Times(g,x),Plus(m,Negate(n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,C1)),Power(Times(b,n,Subtract(Times(b,c),Times(a,d)),Plus(p,C1)),CN1)),x),Dist(Times(Power(g,n),Power(Times(b,n,Subtract(Times(b,c),Times(a,d)),Plus(p,C1)),CN1)),Int(Times(Power(Times(g,x),Subtract(m,n)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Simp(Plus(Times(c,Subtract(Times(b,e),Times(a,f)),Plus(m,Negate(n),C1)),Times(Subtract(Times(d,Subtract(Times(b,e),Times(a,f)),Plus(m,Times(n,q),C1)),Times(b,n,Subtract(Times(c,f),Times(d,e)),Plus(p,C1))),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,q),x),IGtQ(n,C0),LtQ(p,CN1),GtQ(Plus(m,Negate(n),C1),C0)))),
IIntegrate(579,Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_),Plus(e_,Times(f_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Subtract(Times(b,e),Times(a,f)),Power(Times(g,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,C1)),Power(Times(a,g,n,Subtract(Times(b,c),Times(a,d)),Plus(p,C1)),CN1)),x)),Dist(Power(Times(a,n,Subtract(Times(b,c),Times(a,d)),Plus(p,C1)),CN1),Int(Times(Power(Times(g,x),m),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Simp(Plus(Times(c,Subtract(Times(b,e),Times(a,f)),Plus(m,C1)),Times(e,n,Subtract(Times(b,c),Times(a,d)),Plus(p,C1)),Times(d,Subtract(Times(b,e),Times(a,f)),Plus(m,Times(n,Plus(p,q,C2)),C1),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,m,q),x),IGtQ(n,C0),LtQ(p,CN1)))),
IIntegrate(580,Int(Times(Power(Times(g_DEFAULT,x_),m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Plus(e_,Times(f_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Subtract(Simp(Times(e,Power(Times(g,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Power(Times(a,g,Plus(m,C1)),CN1)),x),Dist(Power(Times(a,Power(g,n),Plus(m,C1)),CN1),Int(Times(Power(Times(g,x),Plus(m,n)),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),Subtract(q,C1)),Simp(Plus(Times(c,Subtract(Times(b,e),Times(a,f)),Plus(m,C1)),Times(e,n,Plus(Times(b,c,Plus(p,C1)),Times(a,d,q))),Times(d,Plus(Times(Subtract(Times(b,e),Times(a,f)),Plus(m,C1)),Times(b,e,n,Plus(p,q,C1))),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,p),x),IGtQ(n,C0),GtQ(q,C0),LtQ(m,CN1),Not(And(EqQ(q,C1),SimplerQ(Plus(e,Times(f,Power(x,n))),Plus(c,Times(d,Power(x,n)))))))))
  );
}

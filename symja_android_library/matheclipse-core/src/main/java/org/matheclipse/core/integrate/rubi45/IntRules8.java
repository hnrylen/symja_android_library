package org.matheclipse.core.integrate.rubi45;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules8 { 
  public static IAST RULES = List( 
ISetDelayed(4496,Int(Power(Times(Plus(c_,Times(d_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),QQ(3L,4L))),-1),x_Symbol),
    Condition(Dist(Times(Sqrt(Times(CN1,b,Sqr(x),Power(a,-1))),Power(Times(C2,x),-1)),Subst(Int(Power(Times(Sqrt(Times(CN1,b,x,Power(a,-1))),Power(Plus(a,Times(b,x)),QQ(3L,4L)),Plus(c,Times(d,x))),-1),x),x,Sqr(x)),x),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0)))),
ISetDelayed(4497,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Dist(Times(b,Power(d,-1)),Int(Power(Plus(a,Times(b,Sqr(x))),Plus(p,Negate(C1))),x),x),Negate(Dist(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(d,-1)),Int(Times(Power(Plus(a,Times(b,Sqr(x))),Plus(p,Negate(C1))),Power(Plus(c,Times(d,Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),GtQ(p,C0),Or(EqQ(p,C1D2),EqQ(Denominator(p),C4))))),
ISetDelayed(4498,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),p_),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Dist(Times(b,Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Power(Plus(a,Times(b,Sqr(x))),p),x),x),Negate(Dist(Times(d,Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Times(Power(Plus(a,Times(b,Sqr(x))),Plus(p,C1)),Power(Plus(c,Times(d,Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),LtQ(p,CN1),EqQ(Denominator(p),C4),Or(EqQ(p,QQ(-5L,4L)),EqQ(p,QQ(-7L,4L)))))),
ISetDelayed(4499,Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Power(x_,4)))),Power(Plus(c_,Times(d_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(Dist(Times(a,Power(c,-1)),Subst(Int(Power(Plus(C1,Times(CN1,C4,a,b,Power(x,4))),-1),x),x,Times(x,Power(Plus(a,Times(b,Power(x,4))),CN1D2))),x),And(FreeQ(List(a,b,c,d),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),PosQ(Times(a,b))))),
ISetDelayed(4500,Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Power(x_,4)))),Power(Plus(c_,Times(d_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(CN1,a,b),C4))),Plus(Simp(Times(a,ArcTan(Times(q,x,Plus(a,Times(Sqr(q),Sqr(x))),Power(Times(a,Sqrt(Plus(a,Times(b,Power(x,4))))),-1))),Power(Times(C2,c,q),-1)),x),Simp(Times(a,ArcTanh(Times(q,x,Plus(a,Times(CN1,Sqr(q),Sqr(x))),Power(Times(a,Sqrt(Plus(a,Times(b,Power(x,4))))),-1))),Power(Times(C2,c,q),-1)),x))),And(FreeQ(List(a,b,c,d),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),NegQ(Times(a,b))))),
ISetDelayed(4501,Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Power(x_,4)))),Power(Plus(c_,Times(d_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(Plus(Dist(Times(b,Power(d,-1)),Int(Power(Plus(a,Times(b,Power(x,4))),CN1D2),x),x),Negate(Dist(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(d,-1)),Int(Power(Times(Sqrt(Plus(a,Times(b,Power(x,4)))),Plus(c,Times(d,Power(x,4)))),-1),x),x))),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0)))),
ISetDelayed(4502,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,4))),C1D4),Power(Plus(c_,Times(d_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(a,Times(b,Power(x,4)))),Sqrt(Times(a,Power(Plus(a,Times(b,Power(x,4))),-1)))),Subst(Int(Power(Times(Sqrt(Plus(C1,Times(CN1,b,Power(x,4)))),Plus(c,Times(CN1,Plus(Times(b,c),Times(CN1,a,d)),Power(x,4)))),-1),x),x,Times(x,Power(Plus(a,Times(b,Power(x,4))),CN1D4))),x),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0)))),
ISetDelayed(4503,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,4))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(Plus(Dist(Times(b,Power(d,-1)),Int(Power(Plus(a,Times(b,Power(x,4))),Plus(p,Negate(C1))),x),x),Negate(Dist(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(d,-1)),Int(Times(Power(Plus(a,Times(b,Power(x,4))),Plus(p,Negate(C1))),Power(Plus(c,Times(d,Power(x,4))),-1)),x),x))),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),Or(EqQ(p,QQ(3L,4L)),EqQ(p,QQ(5L,4L)))))),
ISetDelayed(4504,Int(Power(Times(Plus(c_,Times(d_DEFAULT,Power(x_,4))),Sqrt(Plus(a_,Times(b_DEFAULT,Power(x_,4))))),-1),x_Symbol),
    Condition(Plus(Dist(Power(Times(C2,c),-1),Int(Power(Times(Sqrt(Plus(a,Times(b,Power(x,4)))),Plus(C1,Times(CN1,Rt(Times(CN1,d,Power(c,-1)),C2),Sqr(x)))),-1),x),x),Dist(Power(Times(C2,c),-1),Int(Power(Times(Sqrt(Plus(a,Times(b,Power(x,4)))),Plus(C1,Times(Rt(Times(CN1,d,Power(c,-1)),C2),Sqr(x)))),-1),x),x)),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0)))),
ISetDelayed(4505,Int(Power(Times(Plus(c_,Times(d_DEFAULT,Power(x_,4))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,4))),QQ(3L,4L))),-1),x_Symbol),
    Condition(Plus(Dist(Times(b,Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Power(Plus(a,Times(b,Power(x,4))),QQ(-3L,4L)),x),x),Negate(Dist(Times(d,Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Times(Power(Plus(a,Times(b,Power(x,4))),C1D4),Power(Plus(c,Times(d,Power(x,4))),-1)),x),x))),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0)))),
ISetDelayed(4506,Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Simp(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),EllipticE(ArcTan(Times(Rt(Times(d,Power(c,-1)),C2),x)),Plus(C1,Times(CN1,b,c,Power(Times(a,d),-1)))),Power(Times(c,Rt(Times(d,Power(c,-1)),C2),Sqrt(Plus(c,Times(d,Sqr(x)))),Sqrt(Times(c,Plus(a,Times(b,Sqr(x))),Power(Times(a,Plus(c,Times(d,Sqr(x)))),-1)))),-1)),x),And(FreeQ(List(a,b,c,d),x),PosQ(Times(b,Power(a,-1))),PosQ(Times(d,Power(c,-1)))))),
ISetDelayed(4507,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Power(Times(a,n,Plus(p,C1)),-1)),x)),Dist(Power(Times(a,n,Plus(p,C1)),-1),Int(Times(Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1))),Simp(Plus(Times(c,Plus(Times(n,Plus(p,C1)),C1)),Times(d,Plus(Times(n,Plus(p,q,C1)),C1),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,n),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),LtQ(p,CN1),LtQ(C0,q,C1),IntBinomialQ(a,b,c,d,n,p,q,x)))),
ISetDelayed(4508,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(Times(a,d),Times(CN1,c,b)),x,Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1))),Power(Times(a,b,n,Plus(p,C1)),-1)),x),Negate(Dist(Power(Times(a,b,n,Plus(p,C1)),-1),Int(Times(Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C2))),Simp(Plus(Times(c,Plus(Times(a,d),Times(CN1,c,b,Plus(Times(n,Plus(p,C1)),C1)))),Times(d,Plus(Times(a,d,Plus(Times(n,Plus(q,Negate(C1))),C1)),Times(CN1,b,c,Plus(Times(n,Plus(p,q)),C1))),Power(x,n))),x)),x),x))),And(FreeQ(List(a,b,c,d,n),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),LtQ(p,CN1),GtQ(q,C1),IntBinomialQ(a,b,c,d,n,p,q,x)))),
ISetDelayed(4509,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,x,Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,C1)),Power(Times(a,n,Plus(p,C1),Plus(Times(b,c),Times(CN1,a,d))),-1)),x)),Dist(Power(Times(a,n,Plus(p,C1),Plus(Times(b,c),Times(CN1,a,d))),-1),Int(Times(Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Simp(Plus(Times(b,c),Times(n,Plus(p,C1),Plus(Times(b,c),Times(CN1,a,d))),Times(d,b,Plus(Times(n,Plus(p,q,C2)),C1),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,n,q),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),LtQ(p,CN1),Not(And(Not(IntegerQ(p)),IntegerQ(q),LtQ(q,CN1))),IntBinomialQ(a,b,c,d,n,p,q,x)))),
ISetDelayed(4510,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x),x),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(n,C0),IntegersQ(p,q),GtQ(Plus(p,q),C0)))),
ISetDelayed(4511,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(d,x,Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1))),Power(Times(b,Plus(Times(n,Plus(p,q)),C1)),-1)),x),Dist(Power(Times(b,Plus(Times(n,Plus(p,q)),C1)),-1),Int(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C2))),Simp(Plus(Times(c,Plus(Times(b,c,Plus(Times(n,Plus(p,q)),C1)),Times(CN1,a,d))),Times(d,Plus(Times(b,c,Plus(Times(n,Plus(p,Times(C2,q),Negate(C1))),C1)),Times(CN1,a,d,Plus(Times(n,Plus(q,Negate(C1))),C1))),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,n,p),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),GtQ(q,C1),NeQ(Plus(Times(n,Plus(p,q)),C1),C0),Not(IGtQ(p,C1)),IntBinomialQ(a,b,c,d,n,p,q,x)))),
ISetDelayed(4512,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(Times(n,Plus(p,q)),C1),-1)),x),Dist(Times(n,Power(Plus(Times(n,Plus(p,q)),C1),-1)),Int(Times(Power(Plus(a,Times(b,Power(x,n))),Plus(p,Negate(C1))),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1))),Simp(Plus(Times(a,c,Plus(p,q)),Times(Plus(Times(q,Plus(Times(b,c),Times(CN1,a,d))),Times(a,d,Plus(p,q))),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,n),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),GtQ(q,C0),GtQ(p,C0),IntBinomialQ(a,b,c,d,n,p,q,x)))),
ISetDelayed(4513,Int(Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)))),Sqrt(Plus(c_,Times(d_DEFAULT,Sqr(x_))))),-1),x_Symbol),
    Condition(Simp(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),EllipticF(ArcTan(Times(Rt(Times(d,Power(c,-1)),C2),x)),Plus(C1,Times(CN1,b,c,Power(Times(a,d),-1)))),Power(Times(a,Rt(Times(d,Power(c,-1)),C2),Sqrt(Plus(c,Times(d,Sqr(x)))),Sqrt(Times(c,Plus(a,Times(b,Sqr(x))),Power(Times(a,Plus(c,Times(d,Sqr(x)))),-1)))),-1)),x),And(FreeQ(List(a,b,c,d),x),PosQ(Times(d,Power(c,-1))),PosQ(Times(b,Power(a,-1))),Not(SimplerSqrtQ(Times(b,Power(a,-1)),Times(d,Power(c,-1))))))),
ISetDelayed(4514,Int(Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)))),Sqrt(Plus(c_,Times(d_DEFAULT,Sqr(x_))))),-1),x_Symbol),
    Condition(Simp(Times(C1,EllipticF(ArcSin(Times(Rt(Times(CN1,d,Power(c,-1)),C2),x)),Times(b,c,Power(Times(a,d),-1))),Power(Times(Sqrt(a),Sqrt(c),Rt(Times(CN1,d,Power(c,-1)),C2)),-1)),x),And(FreeQ(List(a,b,c,d),x),NegQ(Times(d,Power(c,-1))),GtQ(c,C0),GtQ(a,C0),Not(And(NegQ(Times(b,Power(a,-1))),SimplerSqrtQ(Times(CN1,b,Power(a,-1)),Times(CN1,d,Power(c,-1)))))))),
ISetDelayed(4515,Int(Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)))),Sqrt(Plus(c_,Times(d_DEFAULT,Sqr(x_))))),-1),x_Symbol),
    Condition(Negate(Simp(Times(EllipticF(ArcCos(Times(Rt(Times(CN1,d,Power(c,-1)),C2),x)),Times(b,c,Power(Plus(Times(b,c),Times(CN1,a,d)),-1))),Power(Times(Sqrt(c),Rt(Times(CN1,d,Power(c,-1)),C2),Sqrt(Plus(a,Times(CN1,b,c,Power(d,-1))))),-1)),x)),And(FreeQ(List(a,b,c,d),x),NegQ(Times(d,Power(c,-1))),GtQ(c,C0),GtQ(Plus(a,Times(CN1,b,c,Power(d,-1))),C0)))),
ISetDelayed(4516,Int(Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)))),Sqrt(Plus(c_,Times(d_DEFAULT,Sqr(x_))))),-1),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(C1,Times(d,Sqr(x),Power(c,-1)))),Power(Plus(c,Times(d,Sqr(x))),CN1D2)),Int(Power(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Sqrt(Plus(C1,Times(d,Sqr(x),Power(c,-1))))),-1),x),x),And(FreeQ(List(a,b,c,d),x),Not(GtQ(c,C0))))),
ISetDelayed(4517,Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Dist(a,Int(Power(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Sqrt(Plus(c,Times(d,Sqr(x))))),-1),x),x),Dist(b,Int(Times(Sqr(x),Power(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Sqrt(Plus(c,Times(d,Sqr(x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d),x),PosQ(Times(d,Power(c,-1))),PosQ(Times(b,Power(a,-1)))))),
ISetDelayed(4518,Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Dist(Times(b,Power(d,-1)),Int(Times(Sqrt(Plus(c,Times(d,Sqr(x)))),Power(Plus(a,Times(b,Sqr(x))),CN1D2)),x),x),Negate(Dist(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(d,-1)),Int(Power(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Sqrt(Plus(c,Times(d,Sqr(x))))),-1),x),x))),And(FreeQ(List(a,b,c,d),x),PosQ(Times(d,Power(c,-1))),NegQ(Times(b,Power(a,-1)))))),
ISetDelayed(4519,Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Simp(Times(Sqrt(a),EllipticE(ArcSin(Times(Rt(Times(CN1,d,Power(c,-1)),C2),x)),Times(b,c,Power(Times(a,d),-1))),Power(Times(Sqrt(c),Rt(Times(CN1,d,Power(c,-1)),C2)),-1)),x),And(FreeQ(List(a,b,c,d),x),NegQ(Times(d,Power(c,-1))),GtQ(c,C0),GtQ(a,C0)))),
ISetDelayed(4520,Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Negate(Simp(Times(Sqrt(Plus(a,Times(CN1,b,c,Power(d,-1)))),EllipticE(ArcCos(Times(Rt(Times(CN1,d,Power(c,-1)),C2),x)),Times(b,c,Power(Plus(Times(b,c),Times(CN1,a,d)),-1))),Power(Times(Sqrt(c),Rt(Times(CN1,d,Power(c,-1)),C2)),-1)),x)),And(FreeQ(List(a,b,c,d),x),NegQ(Times(d,Power(c,-1))),GtQ(c,C0),GtQ(Plus(a,Times(CN1,b,c,Power(d,-1))),C0)))),
ISetDelayed(4521,Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Power(Plus(C1,Times(b,Sqr(x),Power(a,-1))),CN1D2)),Int(Times(Sqrt(Plus(C1,Times(b,Sqr(x),Power(a,-1)))),Power(Plus(c,Times(d,Sqr(x))),CN1D2)),x),x),And(FreeQ(List(a,b,c,d),x),NegQ(Times(d,Power(c,-1))),GtQ(c,C0),Not(GtQ(a,C0))))),
ISetDelayed(4522,Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(C1,Times(d,Sqr(x),Power(c,-1)))),Power(Plus(c,Times(d,Sqr(x))),CN1D2)),Int(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Power(Plus(C1,Times(d,Sqr(x),Power(c,-1))),CN1D2)),x),x),And(FreeQ(List(a,b,c,d),x),NegQ(Times(d,Power(c,-1))),Not(GtQ(c,C0))))),
ISetDelayed(4523,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x),x),And(FreeQ(List(a,b,c,d,n,q),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(p,C0)))),
ISetDelayed(4524,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Simp(Times(Power(a,p),Power(c,q),x,AppellF1(Power(n,-1),Negate(p),Negate(q),Plus(C1,Power(n,-1)),Times(CN1,b,Power(x,n),Power(a,-1)),Times(CN1,d,Power(x,n),Power(c,-1)))),x),And(FreeQ(List(a,b,c,d,n,p,q),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(n,CN1),Or(IntegerQ(p),GtQ(a,C0)),Or(IntegerQ(q),GtQ(c,C0))))),
ISetDelayed(4525,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Dist(Times(Power(a,IntPart(p)),Power(Plus(a,Times(b,Power(x,n))),FracPart(p)),Power(Power(Plus(C1,Times(b,Power(x,n),Power(a,-1))),FracPart(p)),-1)),Int(Times(Power(Plus(C1,Times(b,Power(x,n),Power(a,-1))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x),x),And(FreeQ(List(a,b,c,d,n,p,q),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(n,CN1),Not(Or(IntegerQ(p),GtQ(a,C0)))))),
ISetDelayed(4526,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(u_,n_))),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(u_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),-1),Subst(Int(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x),x,u),x),And(FreeQ(List(a,b,c,d,n,p,q),x),LinearQ(u,x),NeQ(u,x)))),
ISetDelayed(4527,Int(Times(Power(u_,p_DEFAULT),Power(v_,q_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(NormalizePseudoBinomial(u,x),p),Power(NormalizePseudoBinomial(v,x),q)),x),And(FreeQ(List(p,q),x),PseudoBinomialPairQ(u,v,x)))),
ISetDelayed(4528,Int(Times(Power(u_,p_DEFAULT),Power(v_,q_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(NormalizePseudoBinomial(Times(Power(x,Times(m,Power(p,-1))),u),x),p),Power(NormalizePseudoBinomial(v,x),q)),x),And(FreeQ(List(p,q),x),IntegersQ(p,Times(m,Power(p,-1))),PseudoBinomialPairQ(Times(Power(x,Times(m,Power(p,-1))),u),v,x)))),
ISetDelayed(4529,Int(Times(Power(Plus(c_,Times(d_DEFAULT,Power(x_,$p("mn",true)))),q_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(d,Times(c,Power(x,n))),q),Power(Power(x,Times(n,q)),-1)),x),And(FreeQ(List(a,b,c,d,n,p),x),EqQ($s("mn"),Negate(n)),IntegerQ(q),Or(PosQ(n),Not(IntegerQ(p)))))),
ISetDelayed(4530,Int(Times(Power(Plus(c_,Times(d_DEFAULT,Power(x_,$p("mn",true)))),q_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Dist(Times(Power(x,Times(n,FracPart(q))),Power(Plus(c,Times(d,Power(Power(x,n),-1))),FracPart(q)),Power(Power(Plus(d,Times(c,Power(x,n))),FracPart(q)),-1)),Int(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(d,Times(c,Power(x,n))),q),Power(Power(x,Times(n,q)),-1)),x),x),And(FreeQ(List(a,b,c,d,n,p,q),x),EqQ($s("mn"),Negate(n)),Not(IntegerQ(q)),Not(IntegerQ(p))))),
ISetDelayed(4531,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Times(b_DEFAULT,Power(x_,n_)),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(e,m),Power(Times(n,Power(b,Plus(Simplify(Times(Plus(m,C1),Power(n,-1))),Negate(C1)))),-1)),Subst(Int(Times(Power(Times(b,x),Plus(p,Simplify(Times(Plus(m,C1),Power(n,-1))),Negate(C1))),Power(Plus(c,Times(d,x)),q)),x),x,Power(x,n)),x),And(FreeQ(List(b,c,d,e,m,n,p,q),x),Or(IntegerQ(m),GtQ(e,C0)),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1))))))),
ISetDelayed(4532,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Times(b_DEFAULT,Power(x_,n_DEFAULT)),p_)),x_Symbol),
    Condition(Dist(Times(Power(e,m),Power(b,IntPart(p)),Power(Times(b,Power(x,n)),FracPart(p)),Power(Power(x,Times(n,FracPart(p))),-1)),Int(Times(Power(x,Plus(m,Times(n,p))),Power(Plus(c,Times(d,Power(x,n))),q)),x),x),And(FreeQ(List(b,c,d,e,m,n,p,q),x),Or(IntegerQ(m),GtQ(e,C0)),Not(IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1)))))))),
ISetDelayed(4533,Int(Times(Power(Times(e_,x_),m_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Times(b_DEFAULT,Power(x_,n_DEFAULT)),p_)),x_Symbol),
    Condition(Dist(Times(Power(e,IntPart(m)),Power(Times(e,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Times(b,Power(x,n)),p),Power(Plus(c,Times(d,Power(x,n))),q)),x),x),And(FreeQ(List(b,c,d,e,m,n,p,q),x),Not(IntegerQ(m))))),
ISetDelayed(4534,Int(Times(x_,Power(Times(Plus(c_,Times(d_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),C1D4)),-1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(ArcTan(Times(Plus(Sqr(Rt(a,C4)),Negate(Sqrt(Plus(a,Times(b,Sqr(x)))))),Power(Times(CSqrt2,Rt(a,C4),Power(Plus(a,Times(b,Sqr(x))),C1D4)),-1))),Power(Times(CSqrt2,Rt(a,C4),d),-1)),x)),Negate(Simp(Times(C1,ArcTanh(Times(Plus(Sqr(Rt(a,C4)),Sqrt(Plus(a,Times(b,Sqr(x))))),Power(Times(CSqrt2,Rt(a,C4),Power(Plus(a,Times(b,Sqr(x))),C1D4)),-1))),Power(Times(CSqrt2,Rt(a,C4),d),-1)),x))),And(FreeQ(List(a,b,c,d),x),EqQ(Plus(Times(b,c),Times(CN1,C2,a,d)),C0),PosQ(a)))),
ISetDelayed(4535,Int(Times(Power(x_,m_),Power(Times(Plus(c_,Times(d_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),C1D4)),-1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(x,m),Power(Times(Power(Plus(a,Times(b,Sqr(x))),C1D4),Plus(c,Times(d,Sqr(x)))),-1)),x),x),And(FreeQ(List(a,b,c,d),x),EqQ(Plus(Times(b,c),Times(CN1,C2,a,d)),C0),IntegerQ(m),Or(PosQ(a),IntegerQ(Times(C1D2,m)))))),
ISetDelayed(4536,Int(Times(Sqr(x_),Power(Times(Plus(c_,Times(d_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),QQ(3L,4L))),-1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,ArcTan(Times(Plus(b,Times(Sqr(Rt(Times(Sqr(b),Power(a,-1)),C4)),Sqrt(Plus(a,Times(b,Sqr(x)))))),Power(Times(Power(Rt(Times(Sqr(b),Power(a,-1)),C4),3),x,Power(Plus(a,Times(b,Sqr(x))),C1D4)),-1))),Power(Times(a,d,Power(Rt(Times(Sqr(b),Power(a,-1)),C4),3)),-1)),x)),Simp(Times(b,ArcTanh(Times(Plus(b,Times(CN1,Sqr(Rt(Times(Sqr(b),Power(a,-1)),C4)),Sqrt(Plus(a,Times(b,Sqr(x)))))),Power(Times(Power(Rt(Times(Sqr(b),Power(a,-1)),C4),3),x,Power(Plus(a,Times(b,Sqr(x))),C1D4)),-1))),Power(Times(a,d,Power(Rt(Times(Sqr(b),Power(a,-1)),C4),3)),-1)),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Plus(Times(b,c),Times(CN1,C2,a,d)),C0),PosQ(Times(Sqr(b),Power(a,-1)))))),
ISetDelayed(4537,Int(Times(Sqr(x_),Power(Times(Plus(c_,Times(d_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),QQ(3L,4L))),-1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,ArcTan(Times(Rt(Times(CN1,Sqr(b),Power(a,-1)),C4),x,Power(Times(CSqrt2,Power(Plus(a,Times(b,Sqr(x))),C1D4)),-1))),Power(Times(CSqrt2,a,d,Power(Rt(Times(CN1,Sqr(b),Power(a,-1)),C4),3)),-1)),x)),Simp(Times(b,ArcTanh(Times(Rt(Times(CN1,Sqr(b),Power(a,-1)),C4),x,Power(Times(CSqrt2,Power(Plus(a,Times(b,Sqr(x))),C1D4)),-1))),Power(Times(CSqrt2,a,d,Power(Rt(Times(CN1,Sqr(b),Power(a,-1)),C4),3)),-1)),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Plus(Times(b,c),Times(CN1,C2,a,d)),C0),NegQ(Times(Sqr(b),Power(a,-1)))))),
ISetDelayed(4538,Int(Times(Power(x_,m_),Power(Times(Plus(c_,Times(d_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),QQ(3L,4L))),-1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(x,m),Power(Times(Power(Plus(a,Times(b,Sqr(x))),QQ(3L,4L)),Plus(c,Times(d,Sqr(x)))),-1)),x),x),And(FreeQ(List(a,b,c,d),x),EqQ(Plus(Times(b,c),Times(CN1,C2,a,d)),C0),IntegerQ(m),Or(PosQ(a),IntegerQ(Times(C1D2,m)))))),
ISetDelayed(4539,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,m,n,p,q),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Plus(m,Negate(n),C1),C0)))),
ISetDelayed(4540,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,Plus(m,Times(n,Plus(p,q)))),Power(Plus(b,Times(a,Power(Power(x,n),-1))),p),Power(Plus(d,Times(c,Power(Power(x,n),-1))),q)),x),And(FreeQ(List(a,b,c,d,m,n),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IntegersQ(p,q),NegQ(n)))),
ISetDelayed(4541,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(x,Plus(Simplify(Times(Plus(m,C1),Power(n,-1))),Negate(C1))),Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,m,n,p,q),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1))))))),
ISetDelayed(4542,Int(Times(Power(Times(e_,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(e,IntPart(m)),Power(Times(e,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x),x),And(FreeQ(List(a,b,c,d,e,m,n,p,q),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1))))))),
ISetDelayed(4543,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x),x),And(FreeQ(List(a,b,c,d,e,m,n),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(p,C0),IGtQ(q,C0)))),
ISetDelayed(4544,Int(Times(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Simp(Times(c,Power(Times(e,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,e,Plus(m,C1)),-1)),x),And(FreeQ(List(a,b,c,d,e,m,n,p),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Plus(Times(a,d,Plus(m,C1)),Times(CN1,b,c,Plus(m,Times(n,Plus(p,C1)),C1))),C0),NeQ(m,CN1)))),
ISetDelayed(4545,Int(Times(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus($p("a1"),Times($p("b1",true),Power(x_,$p("non2",true)))),p_DEFAULT),Power(Plus($p("a2"),Times($p("b2",true),Power(x_,$p("non2",true)))),p_DEFAULT)),x_Symbol),
    Condition(Simp(Times(c,Power(Times(e,x),Plus(m,C1)),Power(Plus($s("a1"),Times($s("b1"),Power(x,Times(C1D2,n)))),Plus(p,C1)),Power(Plus($s("a2"),Times($s("b2"),Power(x,Times(C1D2,n)))),Plus(p,C1)),Power(Times($s("a1"),$s("a2"),e,Plus(m,C1)),-1)),x),And(FreeQ(List($s("a1"),$s("b1"),$s("a2"),$s("b2"),c,d,e,m,n,p),x),EqQ($s("non2"),Times(C1D2,n)),EqQ(Plus(Times($s("a2"),$s("b1")),Times($s("a1"),$s("b2"))),C0),EqQ(Plus(Times($s("a1"),$s("a2"),d,Plus(m,C1)),Times(CN1,$s("b1"),$s("b2"),c,Plus(m,Times(n,Plus(p,C1)),C1))),C0),NeQ(m,CN1))))
  );
}

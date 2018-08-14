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
public class IntRules130 { 
  public static IAST RULES = List( 
ISetDelayed(10381,Int(Times(Power(x_,-1),SinIntegral(Times(b_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Simp(Times(C1D2,C1,b,x,HypergeometricPFQ(List(C1,C1,C1),List(C2,C2,C2),Times(CN1,CI,b,x))),x),Simp(Times(C1D2,C1,b,x,HypergeometricPFQ(List(C1,C1,C1),List(C2,C2,C2),Times(CI,b,x))),x)),FreeQ(b,x))),
ISetDelayed(10382,Int(Times(Power(x_,-1),CosIntegral(Times(b_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(C1D2,CI,b,x,HypergeometricPFQ(List(C1,C1,C1),List(C2,C2,C2),Times(CN1,CI,b,x))),x)),Simp(Times(C1D2,C1,CI,b,x,HypergeometricPFQ(List(C1,C1,C1),List(C2,C2,C2),Times(CI,b,x))),x),Simp(Times($s("EulerGamma"),Log(x)),x),Simp(Times(C1D2,C1,Sqr(Log(Times(b,x)))),x)),FreeQ(b,x))),
ISetDelayed(10383,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),SinIntegral(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),SinIntegral(Plus(a,Times(b,x))),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,Power(Times(d,Plus(m,C1)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Sin(Plus(a,Times(b,x))),Power(Plus(a,Times(b,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,m),x),NeQ(m,CN1)))),
ISetDelayed(10384,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),CosIntegral(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),CosIntegral(Plus(a,Times(b,x))),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,Power(Times(d,Plus(m,C1)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Cos(Plus(a,Times(b,x))),Power(Plus(a,Times(b,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,m),x),NeQ(m,CN1)))),
ISetDelayed(10385,Int(Sqr(SinIntegral(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(a,Times(b,x)),Sqr(SinIntegral(Plus(a,Times(b,x)))),Power(b,-1)),x),Negate(Dist(C2,Int(Times(Sin(Plus(a,Times(b,x))),SinIntegral(Plus(a,Times(b,x)))),x),x))),FreeQ(List(a,b),x))),
ISetDelayed(10386,Int(Sqr(CosIntegral(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(a,Times(b,x)),Sqr(CosIntegral(Plus(a,Times(b,x)))),Power(b,-1)),x),Negate(Dist(C2,Int(Times(Cos(Plus(a,Times(b,x))),CosIntegral(Plus(a,Times(b,x)))),x),x))),FreeQ(List(a,b),x))),
ISetDelayed(10387,Int(Times(Power(x_,m_DEFAULT),Sqr(SinIntegral(Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),Sqr(SinIntegral(Times(b,x))),Power(Plus(m,C1),-1)),x),Negate(Dist(Times(C2,Power(Plus(m,C1),-1)),Int(Times(Power(x,m),Sin(Times(b,x)),SinIntegral(Times(b,x))),x),x))),And(FreeQ(b,x),IGtQ(m,C0)))),
ISetDelayed(10388,Int(Times(Power(x_,m_DEFAULT),Sqr(CosIntegral(Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),Sqr(CosIntegral(Times(b,x))),Power(Plus(m,C1),-1)),x),Negate(Dist(Times(C2,Power(Plus(m,C1),-1)),Int(Times(Power(x,m),Cos(Times(b,x)),CosIntegral(Times(b,x))),x),x))),And(FreeQ(b,x),IGtQ(m,C0)))),
ISetDelayed(10389,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Sqr(SinIntegral(Plus(a_,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(a,Times(b,x)),Power(Plus(c,Times(d,x)),m),Sqr(SinIntegral(Plus(a,Times(b,x)))),Power(Times(b,Plus(m,C1)),-1)),x),Negate(Dist(Times(C2,Power(Plus(m,C1),-1)),Int(Times(Power(Plus(c,Times(d,x)),m),Sin(Plus(a,Times(b,x))),SinIntegral(Plus(a,Times(b,x)))),x),x)),Dist(Times(Plus(Times(b,c),Times(CN1,a,d)),m,Power(Times(b,Plus(m,C1)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Sqr(SinIntegral(Plus(a,Times(b,x))))),x),x)),And(FreeQ(List(a,b,c,d),x),IGtQ(m,C0)))),
ISetDelayed(10390,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Sqr(CosIntegral(Plus(a_,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(a,Times(b,x)),Power(Plus(c,Times(d,x)),m),Sqr(CosIntegral(Plus(a,Times(b,x)))),Power(Times(b,Plus(m,C1)),-1)),x),Negate(Dist(Times(C2,Power(Plus(m,C1),-1)),Int(Times(Power(Plus(c,Times(d,x)),m),Cos(Plus(a,Times(b,x))),CosIntegral(Plus(a,Times(b,x)))),x),x)),Dist(Times(Plus(Times(b,c),Times(CN1,a,d)),m,Power(Times(b,Plus(m,C1)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Sqr(CosIntegral(Plus(a,Times(b,x))))),x),x)),And(FreeQ(List(a,b,c,d),x),IGtQ(m,C0)))),
ISetDelayed(10391,Int(Times(Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),SinIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Cos(Plus(a,Times(b,x))),SinIntegral(Plus(c,Times(d,x))),Power(b,-1)),x)),Dist(Times(d,Power(b,-1)),Int(Times(Cos(Plus(a,Times(b,x))),Sin(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),-1)),x),x)),FreeQ(List(a,b,c,d),x))),
ISetDelayed(10392,Int(Times(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),CosIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Sin(Plus(a,Times(b,x))),CosIntegral(Plus(c,Times(d,x))),Power(b,-1)),x),Negate(Dist(Times(d,Power(b,-1)),Int(Times(Sin(Plus(a,Times(b,x))),Cos(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),-1)),x),x))),FreeQ(List(a,b,c,d),x))),
ISetDelayed(10393,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),SinIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(e,Times(f,x)),m),Cos(Plus(a,Times(b,x))),SinIntegral(Plus(c,Times(d,x))),Power(b,-1)),x)),Dist(Times(d,Power(b,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Cos(Plus(a,Times(b,x))),Sin(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),-1)),x),x),Dist(Times(f,m,Power(b,-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,Negate(C1))),Cos(Plus(a,Times(b,x))),SinIntegral(Plus(c,Times(d,x)))),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0)))),
ISetDelayed(10394,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),CosIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),m),Sin(Plus(a,Times(b,x))),CosIntegral(Plus(c,Times(d,x))),Power(b,-1)),x),Negate(Dist(Times(d,Power(b,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Sin(Plus(a,Times(b,x))),Cos(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),-1)),x),x)),Negate(Dist(Times(f,m,Power(b,-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,Negate(C1))),Sin(Plus(a,Times(b,x))),CosIntegral(Plus(c,Times(d,x)))),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0)))),
ISetDelayed(10395,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_),Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),SinIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Sin(Plus(a,Times(b,x))),SinIntegral(Plus(c,Times(d,x))),Power(Times(f,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Cos(Plus(a,Times(b,x))),SinIntegral(Plus(c,Times(d,x)))),x),x)),Negate(Dist(Times(d,Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Sin(Plus(a,Times(b,x))),Sin(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),ILtQ(m,CN1)))),
ISetDelayed(10396,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),CosIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Cos(Plus(a,Times(b,x))),CosIntegral(Plus(c,Times(d,x))),Power(Times(f,Plus(m,C1)),-1)),x),Dist(Times(b,Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Sin(Plus(a,Times(b,x))),CosIntegral(Plus(c,Times(d,x)))),x),x),Negate(Dist(Times(d,Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Cos(Plus(a,Times(b,x))),Cos(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),ILtQ(m,CN1)))),
ISetDelayed(10397,Int(Times(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),SinIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Sin(Plus(a,Times(b,x))),SinIntegral(Plus(c,Times(d,x))),Power(b,-1)),x),Negate(Dist(Times(d,Power(b,-1)),Int(Times(Sin(Plus(a,Times(b,x))),Sin(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),-1)),x),x))),FreeQ(List(a,b,c,d),x))),
ISetDelayed(10398,Int(Times(CosIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Cos(Plus(a,Times(b,x))),CosIntegral(Plus(c,Times(d,x))),Power(b,-1)),x)),Dist(Times(d,Power(b,-1)),Int(Times(Cos(Plus(a,Times(b,x))),Cos(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),-1)),x),x)),FreeQ(List(a,b,c,d),x))),
ISetDelayed(10399,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),SinIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),m),Sin(Plus(a,Times(b,x))),SinIntegral(Plus(c,Times(d,x))),Power(b,-1)),x),Negate(Dist(Times(d,Power(b,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Sin(Plus(a,Times(b,x))),Sin(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),-1)),x),x)),Negate(Dist(Times(f,m,Power(b,-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,Negate(C1))),Sin(Plus(a,Times(b,x))),SinIntegral(Plus(c,Times(d,x)))),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0)))),
ISetDelayed(10400,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),CosIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(e,Times(f,x)),m),Cos(Plus(a,Times(b,x))),CosIntegral(Plus(c,Times(d,x))),Power(b,-1)),x)),Dist(Times(d,Power(b,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Cos(Plus(a,Times(b,x))),Cos(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),-1)),x),x),Dist(Times(f,m,Power(b,-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,Negate(C1))),Cos(Plus(a,Times(b,x))),CosIntegral(Plus(c,Times(d,x)))),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0)))),
ISetDelayed(10401,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),SinIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Cos(Plus(a,Times(b,x))),SinIntegral(Plus(c,Times(d,x))),Power(Times(f,Plus(m,C1)),-1)),x),Dist(Times(b,Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Sin(Plus(a,Times(b,x))),SinIntegral(Plus(c,Times(d,x)))),x),x),Negate(Dist(Times(d,Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Cos(Plus(a,Times(b,x))),Sin(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),ILtQ(m,CN1)))),
ISetDelayed(10402,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_),CosIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Sin(Plus(a,Times(b,x))),CosIntegral(Plus(c,Times(d,x))),Power(Times(f,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Cos(Plus(a,Times(b,x))),CosIntegral(Plus(c,Times(d,x)))),x),x)),Negate(Dist(Times(d,Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Sin(Plus(a,Times(b,x))),Cos(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),ILtQ(m,CN1)))),
ISetDelayed(10403,Int(SinIntegral(Times(d_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))))),x_Symbol),
    Condition(Plus(Simp(Times(x,SinIntegral(Times(d,Plus(a,Times(b,Log(Times(c,Power(x,n)))))))),x),Negate(Dist(Times(b,d,n),Int(Times(Sin(Times(d,Plus(a,Times(b,Log(Times(c,Power(x,n))))))),Power(Times(d,Plus(a,Times(b,Log(Times(c,Power(x,n)))))),-1)),x),x))),FreeQ(List(a,b,c,d,n),x))),
ISetDelayed(10404,Int(CosIntegral(Times(d_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))))),x_Symbol),
    Condition(Plus(Simp(Times(x,CosIntegral(Times(d,Plus(a,Times(b,Log(Times(c,Power(x,n)))))))),x),Negate(Dist(Times(b,d,n),Int(Times(Cos(Times(d,Plus(a,Times(b,Log(Times(c,Power(x,n))))))),Power(Times(d,Plus(a,Times(b,Log(Times(c,Power(x,n)))))),-1)),x),x))),FreeQ(List(a,b,c,d,n),x))),
ISetDelayed(10405,Int(Times(Power(x_,-1),$(F_,Times(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),d_DEFAULT))),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(F(Times(d,Plus(a,Times(b,x)))),x,Log(Times(c,Power(x,n)))),x),And(FreeQ(List(a,b,c,d,n),x),MemberQ(List($s("SinIntegral"),$s("CosIntegral")),x)))),
ISetDelayed(10406,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),SinIntegral(Times(d_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(e,x),Plus(m,C1)),SinIntegral(Times(d,Plus(a,Times(b,Log(Times(c,Power(x,n))))))),Power(Times(e,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,d,n,Power(Plus(m,C1),-1)),Int(Times(Power(Times(e,x),m),Sin(Times(d,Plus(a,Times(b,Log(Times(c,Power(x,n))))))),Power(Times(d,Plus(a,Times(b,Log(Times(c,Power(x,n)))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,m,n),x),NeQ(m,CN1)))),
ISetDelayed(10407,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),CosIntegral(Times(d_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(e,x),Plus(m,C1)),CosIntegral(Times(d,Plus(a,Times(b,Log(Times(c,Power(x,n))))))),Power(Times(e,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,d,n,Power(Plus(m,C1),-1)),Int(Times(Power(Times(e,x),m),Cos(Times(d,Plus(a,Times(b,Log(Times(c,Power(x,n))))))),Power(Times(d,Plus(a,Times(b,Log(Times(c,Power(x,n)))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,m,n),x),NeQ(m,CN1)))),
ISetDelayed(10408,Int(SinhIntegral(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(a,Times(b,x)),SinhIntegral(Plus(a,Times(b,x))),Power(b,-1)),x),Negate(Simp(Times(Cosh(Plus(a,Times(b,x))),Power(b,-1)),x))),FreeQ(List(a,b),x))),
ISetDelayed(10409,Int(CoshIntegral(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(a,Times(b,x)),CoshIntegral(Plus(a,Times(b,x))),Power(b,-1)),x),Negate(Simp(Times(Sinh(Plus(a,Times(b,x))),Power(b,-1)),x))),FreeQ(List(a,b),x))),
ISetDelayed(10410,Int(Times(Power(x_,-1),SinhIntegral(Times(b_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Simp(Times(C1D2,C1,b,x,HypergeometricPFQ(List(C1,C1,C1),List(C2,C2,C2),Times(CN1,b,x))),x),Simp(Times(C1D2,C1,b,x,HypergeometricPFQ(List(C1,C1,C1),List(C2,C2,C2),Times(b,x))),x)),FreeQ(b,x))),
ISetDelayed(10411,Int(Times(Power(x_,-1),CoshIntegral(Times(b_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(C1D2,b,x,HypergeometricPFQ(List(C1,C1,C1),List(C2,C2,C2),Times(CN1,b,x))),x)),Simp(Times(C1D2,C1,b,x,HypergeometricPFQ(List(C1,C1,C1),List(C2,C2,C2),Times(b,x))),x),Simp(Times($s("EulerGamma"),Log(x)),x),Simp(Times(C1D2,C1,Sqr(Log(Times(b,x)))),x)),FreeQ(b,x))),
ISetDelayed(10412,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),SinhIntegral(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),SinhIntegral(Plus(a,Times(b,x))),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,Power(Times(d,Plus(m,C1)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Sinh(Plus(a,Times(b,x))),Power(Plus(a,Times(b,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,m),x),NeQ(m,CN1)))),
ISetDelayed(10413,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),CoshIntegral(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),CoshIntegral(Plus(a,Times(b,x))),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,Power(Times(d,Plus(m,C1)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Cosh(Plus(a,Times(b,x))),Power(Plus(a,Times(b,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,m),x),NeQ(m,CN1)))),
ISetDelayed(10414,Int(Sqr(SinhIntegral(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(a,Times(b,x)),Sqr(SinhIntegral(Plus(a,Times(b,x)))),Power(b,-1)),x),Negate(Dist(C2,Int(Times(Sinh(Plus(a,Times(b,x))),SinhIntegral(Plus(a,Times(b,x)))),x),x))),FreeQ(List(a,b),x))),
ISetDelayed(10415,Int(Sqr(CoshIntegral(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(a,Times(b,x)),Sqr(CoshIntegral(Plus(a,Times(b,x)))),Power(b,-1)),x),Negate(Dist(C2,Int(Times(Cosh(Plus(a,Times(b,x))),CoshIntegral(Plus(a,Times(b,x)))),x),x))),FreeQ(List(a,b),x))),
ISetDelayed(10416,Int(Times(Power(x_,m_DEFAULT),Sqr(SinhIntegral(Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),Sqr(SinhIntegral(Times(b,x))),Power(Plus(m,C1),-1)),x),Negate(Dist(Times(C2,Power(Plus(m,C1),-1)),Int(Times(Power(x,m),Sinh(Times(b,x)),SinhIntegral(Times(b,x))),x),x))),And(FreeQ(b,x),IGtQ(m,C0)))),
ISetDelayed(10417,Int(Times(Power(x_,m_DEFAULT),Sqr(CoshIntegral(Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),Sqr(CoshIntegral(Times(b,x))),Power(Plus(m,C1),-1)),x),Negate(Dist(Times(C2,Power(Plus(m,C1),-1)),Int(Times(Power(x,m),Cosh(Times(b,x)),CoshIntegral(Times(b,x))),x),x))),And(FreeQ(b,x),IGtQ(m,C0)))),
ISetDelayed(10418,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Sqr(SinhIntegral(Plus(a_,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(a,Times(b,x)),Power(Plus(c,Times(d,x)),m),Sqr(SinhIntegral(Plus(a,Times(b,x)))),Power(Times(b,Plus(m,C1)),-1)),x),Negate(Dist(Times(C2,Power(Plus(m,C1),-1)),Int(Times(Power(Plus(c,Times(d,x)),m),Sinh(Plus(a,Times(b,x))),SinhIntegral(Plus(a,Times(b,x)))),x),x)),Dist(Times(Plus(Times(b,c),Times(CN1,a,d)),m,Power(Times(b,Plus(m,C1)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Sqr(SinhIntegral(Plus(a,Times(b,x))))),x),x)),And(FreeQ(List(a,b,c,d),x),IGtQ(m,C0)))),
ISetDelayed(10419,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Sqr(CoshIntegral(Plus(a_,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(a,Times(b,x)),Power(Plus(c,Times(d,x)),m),Sqr(CoshIntegral(Plus(a,Times(b,x)))),Power(Times(b,Plus(m,C1)),-1)),x),Negate(Dist(Times(C2,Power(Plus(m,C1),-1)),Int(Times(Power(Plus(c,Times(d,x)),m),Cosh(Plus(a,Times(b,x))),CoshIntegral(Plus(a,Times(b,x)))),x),x)),Dist(Times(Plus(Times(b,c),Times(CN1,a,d)),m,Power(Times(b,Plus(m,C1)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Sqr(CoshIntegral(Plus(a,Times(b,x))))),x),x)),And(FreeQ(List(a,b,c,d),x),IGtQ(m,C0)))),
ISetDelayed(10420,Int(Times(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),SinhIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Cosh(Plus(a,Times(b,x))),SinhIntegral(Plus(c,Times(d,x))),Power(b,-1)),x),Negate(Dist(Times(d,Power(b,-1)),Int(Times(Cosh(Plus(a,Times(b,x))),Sinh(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),-1)),x),x))),FreeQ(List(a,b,c,d),x))),
ISetDelayed(10421,Int(Times(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),CoshIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Sinh(Plus(a,Times(b,x))),CoshIntegral(Plus(c,Times(d,x))),Power(b,-1)),x),Negate(Dist(Times(d,Power(b,-1)),Int(Times(Sinh(Plus(a,Times(b,x))),Cosh(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),-1)),x),x))),FreeQ(List(a,b,c,d),x))),
ISetDelayed(10422,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),SinhIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),m),Cosh(Plus(a,Times(b,x))),SinhIntegral(Plus(c,Times(d,x))),Power(b,-1)),x),Negate(Dist(Times(d,Power(b,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Cosh(Plus(a,Times(b,x))),Sinh(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),-1)),x),x)),Negate(Dist(Times(f,m,Power(b,-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,Negate(C1))),Cosh(Plus(a,Times(b,x))),SinhIntegral(Plus(c,Times(d,x)))),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0)))),
ISetDelayed(10423,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),CoshIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),m),Sinh(Plus(a,Times(b,x))),CoshIntegral(Plus(c,Times(d,x))),Power(b,-1)),x),Negate(Dist(Times(d,Power(b,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Sinh(Plus(a,Times(b,x))),Cosh(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),-1)),x),x)),Negate(Dist(Times(f,m,Power(b,-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,Negate(C1))),Sinh(Plus(a,Times(b,x))),CoshIntegral(Plus(c,Times(d,x)))),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0)))),
ISetDelayed(10424,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_),Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),SinhIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Sinh(Plus(a,Times(b,x))),SinhIntegral(Plus(c,Times(d,x))),Power(Times(f,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Cosh(Plus(a,Times(b,x))),SinhIntegral(Plus(c,Times(d,x)))),x),x)),Negate(Dist(Times(d,Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Sinh(Plus(a,Times(b,x))),Sinh(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),ILtQ(m,CN1)))),
ISetDelayed(10425,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),CoshIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Cosh(Plus(a,Times(b,x))),CoshIntegral(Plus(c,Times(d,x))),Power(Times(f,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Sinh(Plus(a,Times(b,x))),CoshIntegral(Plus(c,Times(d,x)))),x),x)),Negate(Dist(Times(d,Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Cosh(Plus(a,Times(b,x))),Cosh(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),ILtQ(m,CN1)))),
ISetDelayed(10426,Int(Times(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),SinhIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Sinh(Plus(a,Times(b,x))),SinhIntegral(Plus(c,Times(d,x))),Power(b,-1)),x),Negate(Dist(Times(d,Power(b,-1)),Int(Times(Sinh(Plus(a,Times(b,x))),Sinh(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),-1)),x),x))),FreeQ(List(a,b,c,d),x))),
ISetDelayed(10427,Int(Times(CoshIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Cosh(Plus(a,Times(b,x))),CoshIntegral(Plus(c,Times(d,x))),Power(b,-1)),x),Negate(Dist(Times(d,Power(b,-1)),Int(Times(Cosh(Plus(a,Times(b,x))),Cosh(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),-1)),x),x))),FreeQ(List(a,b,c,d),x))),
ISetDelayed(10428,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),SinhIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),m),Sinh(Plus(a,Times(b,x))),SinhIntegral(Plus(c,Times(d,x))),Power(b,-1)),x),Negate(Dist(Times(d,Power(b,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Sinh(Plus(a,Times(b,x))),Sinh(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),-1)),x),x)),Negate(Dist(Times(f,m,Power(b,-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,Negate(C1))),Sinh(Plus(a,Times(b,x))),SinhIntegral(Plus(c,Times(d,x)))),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0)))),
ISetDelayed(10429,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),CoshIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),m),Cosh(Plus(a,Times(b,x))),CoshIntegral(Plus(c,Times(d,x))),Power(b,-1)),x),Negate(Dist(Times(d,Power(b,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Cosh(Plus(a,Times(b,x))),Cosh(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),-1)),x),x)),Negate(Dist(Times(f,m,Power(b,-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,Negate(C1))),Cosh(Plus(a,Times(b,x))),CoshIntegral(Plus(c,Times(d,x)))),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0)))),
ISetDelayed(10430,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),SinhIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Cosh(Plus(a,Times(b,x))),SinhIntegral(Plus(c,Times(d,x))),Power(Times(f,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Sinh(Plus(a,Times(b,x))),SinhIntegral(Plus(c,Times(d,x)))),x),x)),Negate(Dist(Times(d,Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Cosh(Plus(a,Times(b,x))),Sinh(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),ILtQ(m,CN1))))
  );
}

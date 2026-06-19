% LETS + WAVE =LATER
solution(Z):-
digit(L),L>0,
digit(E), 
digit(T), 
digit(S), 
digit(W), W>0,
digit(A), 
digit(V), 
digit(E),
digit(R),
1000*L + 100*E + 10*T + S + 1000*W + A*100 + 10*V + E =:= 10000*L + 1000*A + 100*T + 10*E + R, 
Z=[L,E,T,S,W,A,V,R],
different(Z).
digit(0). digit(1). digit(2). digit(3).
digit(4).
digit(5).
digit(6).
digit(7).
digit(8).
digit(9).
different([]).
different([X|P]) :-
not(member(X,P)),
different(P).
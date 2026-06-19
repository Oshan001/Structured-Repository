% BASE + BALL = GAMES
solution(Solution) :-
digit(B), B > 0,
digit(A),
digit(S),
digit(E),
digit(L),
digit(G), G > 0,
digit(M),
1000*B + 100*A + 10*S + E +
1000*B + 100*A + 10*L + L =:=
10000*G + 1000*A + 100*M + 10*E + S,
Solution = [B,A,S,E,L,G,M],
different(Solution).
digit(0). 
digit(1). 
digit(2). 
digit(3). 
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

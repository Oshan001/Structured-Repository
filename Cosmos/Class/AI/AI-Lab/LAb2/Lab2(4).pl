solution(L) :-
digit(I), I>0, 
digit(T),
digit(S),
digit(M), M>0, 
digit(E),
10*I + T + 10*I + S =:= 10*M + E,
L = [I,T,S,M,E],
different(L).
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


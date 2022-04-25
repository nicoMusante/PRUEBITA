program Actididad3A;
type
	
	arbol = ^nodo;
	
	nodo = record
		elem : integer;
		HI: arbol;
		HD: arbol;
	end;
	
	result = ^nodo;
	
procedure cargar (var A: arbol);
var
	num: integer;
begin
	writeln ('ingerse un numero: ');
	readln (num);
	if (num <> -1) then
	begin
		new (A);
		nuevo^.elem := num;
		if (A = nil) then
		begin
			A := nuevo
			A^.HI:= nil;
			A^.HD:= nil;
		end;
		else
			if (nuevo^.elem < A)then
				cargar (A^.HI)
			else
				cargar (A^.HD);
	end;
	
		

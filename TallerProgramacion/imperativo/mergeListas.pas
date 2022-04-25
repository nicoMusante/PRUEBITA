program MergeListas;
type
	lista = ^nodo;
	
	nodo = record
		elem: integer;
		sig: lista;
	end;
	
	vector = array [1..4] of lista;
	
procedure crearL (var L: lista);
var
	nuevo, ant, act: lista;
	num: integer;
begin
	writeln ('ingrese un numero: ');
	readln (num);
	while (num <> 0) do
	begin
		new (nuevo);
		nuevo^.elem := num;
		act := L;
		while  (act <> nil) and (act^.elem < num)do
		begin
			ant:= act;
			act:= act^.sig;
		end;
		if (act = L) then
			L := nuevo
		else
			ant^.sig := nuevo;
		nuevo^.sig := act;
		writeln ();
		writeln ('ingrese un numero: ');
		readln (num);
	end;
end;

procedure cargarV (var V: vector);
var
	i: integer;
begin
	for i:= 1 to 4 do
	begin
		V[i]:= nil;
		crearL (V[i]);
	end;
end;
		
procedure imprimirV (V: vector);
var
	i: integer;
begin
	for i:= 1 to 4 do
	begin
		while (V[i] <> nil) do
		begin
			writeln ();
			writeln (V[i]^.elem);
			V[i]:= V[i]^.sig;
		end;
	end;
end;

procedure determinarMinimo (var V: vector;var min:integer);
var
	i, j: integer;
begin
	min := 999;
	for i:=1 to 4 do 
	begin
		if (v[i]<>nil) then
		begin
			if(V[i]^.elem<min)then
			begin
				min:=V[i]^.elem;
				j:=i;
			end;
		end;
	end;
	if (min<>999) then
		V[j]:=V[j]^.sig;
end;


procedure agregarAtras(var ult, pri:lista; numMin:integer);
var
	nuevo:lista;
begin
	new(nuevo);
	nuevo^.elem:=numMin;
	nuevo^.sig:=nil;
	if (pri<>nil) then
		ult^.sig:=nuevo
	else
		pri:=nuevo;
	ult:=nuevo;
end;

procedure merge(var l:lista; v:vector);
var
	numMin:integer; ult:lista;
begin
	ult:=l;
	determinarMinimo(v, numMin);
	while(numMin<>999)do
	begin
		agregarAtras(ult, l, numMin);
		determinarMinimo(v, numMin);
	end;
end;

procedure imprimirL (L: lista);
begin
	while (L <> nil) do
	begin
		writeln (L^.elem);
		L := L^.sig;
	end;
end;

var 
	V: vector; listaMerge:lista;
begin
	cargarV (V);
	imprimirV (V);
	listaMerge:=nil;
	merge(listaMerge, v);
	imprimirL (listaMerge);
end.

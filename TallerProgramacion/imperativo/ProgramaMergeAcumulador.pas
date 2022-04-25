PROGRAM ProgamaMergeAcumulador;
TYPE
	Gasto=record
		  tipo:integer;
		  monto:integer;
		  end;
	
	Gasto2=record
		  tipo:integer;
		  monto:integer;
		  end;
	
	Lista=^nodo;
	nodo=record
		 gasto:Gasto;
		 sig:Lista;
		 end;
	VectorFamilia=array [1..4] of Lista;
	
	
	
	ListaMerge=^nodo2;
	
	nodo2=record
		 gasto:Gasto2;
		 sig:ListaMerge;
		 end;

PROCEDURE crearL(var L:Lista);
var
	nuevo, ant, act: Lista;
	num, monto: integer;
begin
	writeln ('ingrese un rubro del gasto: ');
	readln (num);
	if (num <> 0) then
	begin
		writeln ('ingrese el monto gastado: ');
		readln (monto);
	end;
	while (num <> 0) do
	begin
		new (nuevo);
		nuevo^.gasto.tipo := num;
		nuevo^. gasto. monto := monto;
		act := L;
		while  (act <> nil) and (act^.gasto.tipo < num)do
		begin
			ant:= act;
			act:= act^.sig;
		end;
		if (act = L) then
			L := nuevo
		else
			ant^.sig := nuevo;
		nuevo^.sig := act;
		writeln ('ingrese un rubro del gasto: ');
		readln (num);
		if (num <> 0) then
		begin
			writeln ('ingrese el monto gastado: ');
			readln (monto);
		end;
	end;
end;

procedure crearVectorListas (var V: VectorFamilia);
var
	i: integer;
begin
	for i:= 1 to 4 do
	begin
		V[i]:= nil;
		writeln ();
		writeln ('ingrese los gastos del integrante ',i);
		crearL (V[i]);
	end;
end;

procedure imprimirV (V: VectorFamilia);
var
	i: integer;
begin
	for i:= 1 to 4 do
	begin
		while (V[i] <> nil) do
		begin
			writeln ();
			writeln('Tipo de gasto: ',V[i]^.gasto.tipo);
			writeln ('Monto gastado: ',V[i]^.gasto.monto);
			V[i]:= V[i]^.sig;
		end;
	end;
end;

procedure determinarMinimo (var V: VectorFamilia ;var min:Gasto);
var
	i, j: integer;
begin
	min.tipo := 999;
	for i:=1 to 4 do 
	begin
		if (v[i]<>nil) then
		begin
			if(V[i]^.gasto.tipo<min.tipo)then
			begin
				min:=V[i]^.gasto;
				j:=i;
			end;
		end;
	end;
	if (min.tipo<>999) then
		V[j]:=V[j]^.sig;
end;

procedure agregarAtras(var ult, pri: ListaMerge; dato:Gasto2);
var
	nuevo:ListaMerge;
begin
	new(nuevo);
	nuevo^.gasto:=dato;
	nuevo^.sig:=nil;
	if (pri<>nil) then
		ult^.sig:=nuevo
	else
		pri:=nuevo;
	ult:=nuevo;
end;

PROCEDURE mergeAcumulador(v:VectorFamilia; var l:ListaMerge);
var
	tipoAct, total:integer; minimo: Gasto; dato:Gasto2; ult:ListaMerge;
begin
	determinarMinimo(v, minimo);
	tipoAct:=minimo.tipo;
	while (minimo.tipo<>999) do
	begin
		total:=0;
		while (minimo.tipo=tipoAct) do
		begin
			total:=total+minimo.monto;
			determinarMinimo(v, minimo);
		end;
		dato.tipo:=tipoAct;
		dato.monto:=total;
		agregarAtras (ult, l, dato);
		tipoAct:=minimo.tipo;
	end;
end;	

procedure imprimirListaMerge (l:ListaMerge);
begin
	while(l<>nil) do
	begin
		writeln();
		writeln('tipo de gasto: ', l^.gasto.tipo);
		writeln ('monto total: ', l^.gasto.monto);
		l:= l^.sig;
	end;
end;

VAR
	v:VectorFamilia;
	l: ListaMerge; 
BEGIN
	crearVectorListas(v);
	imprimirV(v);
	mergeAcumulador(v, l);
	imprimirListaMerge(l);
END.

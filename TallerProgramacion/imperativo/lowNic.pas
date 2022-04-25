program ListaConRecursion;
type
	lista = ^nodo;
	
	nodo = record
		elem: integer;
		sig: lista;
	end;

procedure cargarL (var L: lista);
var
	num: integer;
	nuevo: lista;
begin
	writeln ('ingrese un numero: ');
	readln (num);
	while (num <> -1) do
	begin
		new (nuevo);
		nuevo^.elem := num;
		nuevo^.sig:= L;
		L:= nuevo;
		writeln ('ingrese un numero: ');
		readln (num);
	end;
end;

procedure imprimirEnOrden (L: lista);
begin
	if (L <> nil) then
	begin
		writeln (L^.elem);
		imprimirEnOrden (L^.sig);
	end;
end;

procedure imprimirEnOrdenInverso(L: lista);
begin
	if (L <> nil) then
	begin
		imprimirEnOrdenInverso (L^.sig);
		writeln (L^.elem);
	end;
end;

var
	L: lista;
begin
	L:= nil;
	cargarL(L);
	writeln ();
	imprimirEnOrden (L);
	writeln ();
	imprimirEnOrdenInverso (L);
end.
		
			

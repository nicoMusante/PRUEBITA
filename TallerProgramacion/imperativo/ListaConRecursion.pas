program ListaConRecursion;
type
	Lista=^nodo;
	nodo=record
		 dato:integer;
		 sig:Lista;
		 end;

PROCEDURE crearLista (var l:Lista);
var 
	num: integer;
	nuevo, aux: lista;
begin
	writeln('Ingrese un número (cuando desee finalizar la carga ingrese el "-1"): ');
	readln(num);
	while(num <>-1)do 
	begin
		new (nuevo);
		nuevo^.dato:= num;
		nuevo^.sig := nil;
		if(l=nil)then
			l:=nuevo
		else
		begin
			aux:=l;
			while(aux^.sig <> nil)do
				aux:=aux^.sig;
			aux^.sig:=nuevo;
		end;
		writeln('Ingrese un número (cuando desee finalizar la carga ingrese el "-1"): ');
		readln(num);
	end;
end;

PROCEDURE Maximo(pri:Lista; var max:integer);
begin
	if(pri<>nil)then
	begin
		if(pri^.dato>max)then
			max:=pri^.dato;
		Maximo(pri^.sig, max);
	end;
end;

procedure imprimirL (L: lista);
begin
	while (L <> nil) do
	begin
		writeln (L^.dato);
		L:= L^.sig;
	end;
end;

var
	L, pri:Lista; max:integer;
Begin
	L:=nil;
	crearLista(L);
	imprimirL (L);
	max:=-1;
	pri:=L;
	Maximo(pri, max);
	writeln('El máximo numero ingresado por usted, querido usuario, en la lista es: ',max);
	
end.

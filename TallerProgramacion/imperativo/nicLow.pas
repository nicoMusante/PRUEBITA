program CalculoDigitoMaximoRec;
type digito=-1..9;

var num: integer;
    max: digito;

procedure digitoMaximoRec(n: integer; var max: digito);
var
  dig: integer;
begin
  if (n <> 0) then begin
                dig:= n mod 10;
                if (dig > max) then
                                max:= dig;
                n:= n div 10;
                digitoMaximoRec(n, max);
              end;
end;

procedure imprimirDigitos1 (num: integer);
begin
	if(num<>0)then
	begin
		writeln(num mod 10);
		imprimirDigitos1(num div 10);
	end;
end;

procedure imprimirDigitos2 (num: integer);
begin
	if(num<>0)then
	begin
		imprimirDigitos2(num div 10);
		writeln(num mod 10);
	end;
end;
	
begin
  readln (num);
  max := -1;
  digitoMaximoRec(num, max);
  writeln ('El digito maximo de ', num, ' es: ', max);
  imprimirDigitos1 (num);
  writeln ();
  imprimirDigitos2 (num);
end.

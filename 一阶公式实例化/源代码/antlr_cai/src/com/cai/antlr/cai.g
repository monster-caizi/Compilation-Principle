grammar cai;
program:(example ';')*;

example:sentence;
sentence:lcexp|logexp|compexp|exp;

lcexp:((qu)varexp) (preexp|(lk sentence rk)|lcexp);

logexp:tcexp;
tcexp: orexp(key orexp)*;
key:(sd|bd);
orexp:andexp (or andexp)*;
andexp:compexp (and compexp)*;
compexp: exp ((eq|bl|ab|be|ae|ne)  exp)?;

exp:Var | conexp | (not)?(lk sentence rk) | preexp |lcexp;
preexp:(not)? pexp lk(varexp|conexp) rk;
varexp:Var;
conexp:Con;
pexp:Pre;

Pre:'@' Lowercase+;
Var:Uppercase+;
Con:(Digit(Digit)*)|(Lowercase(Digit|Lowercase)*);
Lowercase:[a-z];
Uppercase:[A-Z];
Digit:	[0-9];
not:'~';
and:'&&';
or:'||';
sd:'->';
bd:'<->';
qu:'%'|'$';
eq:'=';
ab:'>';
bl:'<';
be:'<=';
ae:'>=';
ne:'!=';
lk:'(';
rk:')';
WS : [' '\t\r\n ]+ -> skip;
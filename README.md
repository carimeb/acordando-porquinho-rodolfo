# ACORDANDO O PORQUINHO RODOLFO

Com a majestosa orentação de @ramonmpacheco. Para mais detalhes, vejam o video dele no canal O8K Group: https://www.youtube.com/watch?v=WbrPs2pzKC8 

## PREMISSAS
 - RODOLFO (TAMBÉM CONHECIDO COMO RUDI) É UM PORQUINHO MUITO PREGUIÇOSO, VIRA E MEXE QUANDO ESTÁ COM A BARRIGA CHEIA PEGA NUM SONO TERRÍVEL E QUASE NINGUÉM CONSEGUE ACORDÁ-LO. OLHA A SITUAÇÃO: https://www.youtube.com/watch?v=6iHdVa9YQtI

## SUA MISSÃO
 - AGORA CHEGOU A SUA VEZ DE TENTAR ACORDAR O RUDI!
   - USE A API DE SCANNER (java.util.Scanner) PARA DETECTAR AS ENTRADAS DO TECLADO. TODA VEZ QUE FOR DIGITADO ENTER DEVE-SE TENTAR ACORDAR O RODOLFO. 
   - QUANDO FOR TENTAR ACORDAR O RODOLFO IMPRIMA NO TERMINAL AS FRASES ABAIXO CONFORME A TENTATIVA CORRESPONDENTE:
 
		    1 Rodolfo!  
		    2 RRodolfoo!!  
		    3 RRRodolfooo!!!!!!!  
		    4 Que te passas?!  
		    5 Rudi!, Rudi!  
		    6 Rodolfin!!  
		    7 Rodolfin!!!  
		    8 Uhuuu!! Rodolfo!!  
		    9 Rodolfo!! Rodolfoôô!!!  
		    10 Está morto! Não respira!  
		    11 Não respi... acho que Respira, será que está vivo?

   - QUANDO O RODOLFO ACORDAR DEVE-SE IMPRIMIR NO TERMINAL A FRASE DE ALÍVIO ABAIXO:
   
		    Rodolfo!!! Ahhhh!! Estava dormindo, ai que susto, que susto em, que susto!

   - CASO RODOLFO ACORDE OU SEJA DIGITADO ALGO DIFERENTE DE ENTER O PROGRAMA DEVE TERMINAR. 
   - NO MÉTODO TENTAR_ACORDAR GERE UM NUMERO ALEATÓRIO COM LIMITE DE 6 E CASO O NÚMERO GERADO SEJA 4 RODOLFO DEVE ACORDAR. 
 
 ## CLASSES

|RODOLFO||
|--|--|
|-RODOLFO_ESTA_ACORDADO|STATIC FINAL INT : 4|
|-ACORDADO|BOOLEAN|
|**MÉTODOS**|--|
|+ESTÁ_ACORDADO|BOOLEAN|
|+TENTAR_ACORDAR|VOID

--

|FRASES_UTILS||
|--|--|
|+FRASE_ALIVIO|STATIC FINAL STRING : Rodolfo!!! Ahhhh!! Estava dormindo, ai que susto, que susto em, que susto!|
|+FRASES|HASH_MAP<INTEGER, STRING>|
|BLOCO ESTATICO|PUPOLANDO O HASH_MAP COM AS FRASES ACIMA|


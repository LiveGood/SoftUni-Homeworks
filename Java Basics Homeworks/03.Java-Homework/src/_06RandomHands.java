i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . A r r a y s ;  
 i m p o r t   j a v a . u t i l . R a n d o m ;  
 i m p o r t   j a v a . u t i l . S c a n n e r ;  
  
  
 p u b l i c   c l a s s   _ 0 6 R a n d o m H a n d s   {  
  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 S c a n n e r   i n p u t   =   n e w   S c a n n e r ( S y s t e m . i n ) ;  
 	 	 S y s t e m . o u t . p r i n t ( " N u m b e r   o f   r a n d o m   h a n d s :   " ) ;  
 	 	 i n t   n u m b e r O f H a n d s   =   I n t e g e r . p a r s e I n t ( i n p u t . n e x t L i n e ( ) ) ;  
 	 	  
 	 	 c h a r [ ]   s u i t s   =   { ' \ u 2 6 6 0 ' , ' \ u 2 6 6 5 ' , ' \ u 2 6 6 6 ' , ' \ u 2 6 6 3 ' } ;  
 	 	 c h a r [ ]   c a r d s   =   { ' 2 ' , ' 3 ' , ' 4 ' , ' 5 ' , ' 6 ' , ' 7 ' , ' 8 ' , ' 9 ' , ' T ' , ' J ' , ' Q ' , ' K ' , ' A ' , } ;  
 	 	 A r r a y L i s t < S t r i n g >   a l l C a r d s   =   n e w   A r r a y L i s t < > ( ) ;  
 	 	  
 	 	 / / a d d   a l l   c a r d s   i n   a r r a y  
 	 	 f o r   ( i n t   i   =   0 ;   i   <   c a r d s . l e n g t h ;   i + + )   {  
 	 	 	 f o r   ( i n t   j   =   0 ;   j   <   s u i t s . l e n g t h ;   j + + )   {  
 	 	 	 	 a l l C a r d s . a d d ( C h a r a c t e r . t o S t r i n g ( c a r d s [ i ] )   +   C h a r a c t e r . t o S t r i n g ( s u i t s [ j ] ) ) ;  
 	 	 	 }  
 	 	 }  
 	 	  
 	 	 f o r   ( i n t   i   =   0 ;   i   <   n u m b e r O f H a n d s ;   i + + )   {  
 	 	 	 p r i n t R a n d o m P o k e r H a n d ( a l l C a r d s ) ; 	 	  
 	 	 }  
  
 	 }  
  
 	 p r i v a t e   s t a t i c   v o i d   p r i n t R a n d o m P o k e r H a n d ( A r r a y L i s t < S t r i n g >   a l l C a r d s )   {  
 	 	 R a n d o m   r a n d o m G e n e r a t o r   =   n e w   R a n d o m ( ) ; 	 	  
 	 	 A r r a y L i s t < I n t e g e r >   n o R e p e a t e d C a r d s   =     n e w   A r r a y L i s t < > ( ) ;  
 	 	 f o r   ( i n t   j   =   0 ;   j   <   5 ;   j + + )   {  
 	 	 	  
 	 	 	 i n t   r a n d o m N u m b e r   =   r a n d o m G e n e r a t o r . n e x t I n t ( a l l C a r d s . s i z e ( ) ) ;  
 	 	 	  
 	 	 	 i f   ( n o R e p e a t e d C a r d s . c o n t a i n s ( r a n d o m N u m b e r ) )   {  
 	 	 	 	 j - - ;  
 	 	 	 	 c o n t i n u e ;  
 	 	 	 }  
 	 	 	 e l s e   {  
 	 	 	 	 S t r i n g   r a n d o m C a r d   =   a l l C a r d s . g e t ( r a n d o m N u m b e r ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t ( r a n d o m C a r d   +   "   " ) ;  
 	 	 	 }  
 	 	 	 n o R e p e a t e d C a r d s . a d d ( r a n d o m N u m b e r ) ; 	 	 	  
 	 	 }  
 	 	 S y s t e m . o u t . p r i n t l n ( ) ;  
 	 	  
 	 }  
  
 }  
 
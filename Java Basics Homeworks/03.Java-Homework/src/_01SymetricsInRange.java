i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . S c a n n e r ;  
  
  
 p u b l i c   c l a s s   _ 0 1 S y m e t r i c s I n R a n g e   {  
  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 S c a n n e r   i n p u t   =   n e w   S c a n n e r ( S y s t e m . i n ) ;  
 	 	 i n t   s t a r t N u m   =   I n t e g e r . p a r s e I n t ( i n p u t . n e x t L i n e ( ) ) ;  
 	 	 i n t   e n d N u m   =   I n t e g e r . p a r s e I n t ( i n p u t . n e x t L i n e ( ) ) ;  
 	 	  
 	 	 A r r a y L i s t < I n t e g e r >   s y m e t r i c N u m b e r s   =   n e w   A r r a y L i s t < > ( ) ;  
 	 	  
 	 	 / / f o r   n u m b e r s   0   -   9  
 	 	  
 	 	 f o r   ( i n t   i   =   s t a r t N u m ;   i   < =   e n d N u m ;   i + + )   {  
 	 	 	  
 	 	 	 i n t   n u m b e r   =   i ;  
 	 	 	 / /   c o u n t   o f   d i g i t s  
 	 	 	 i n t   d i g i t t C o u n t e r   =   0 ;  
 	 	 	 i n t   n u m b e r C o p y   =   n u m b e r ;  
 	 	 	 w h i l e   ( n u m b e r C o p y   >   0 )   {  
 	 	 	 	 n u m b e r C o p y   / =   1 0 ;  
 	 	 	 	 d i g i t t C o u n t e r + + ;  
 	 	 	 }  
 	 	 	  
 	 	 	 i n t   f i r s t D i g i t   =   n u m b e r   %   1 0 ;  
 	 	 	 i n t   l a s t D i g i t   =   n u m b e r   / ( i n t )   M a t h . p o w ( 1 0 ,   d i g i t t C o u n t e r   -   1 ) ;  
 	 	 	  
 	 	 	 i f   ( f i r s t D i g i t   = =   l a s t D i g i t )   {  
 	 	 	 	 s y m e t r i c N u m b e r s . a d d ( n u m b e r ) ;  
 	 	 	 }  
 	 	 }  
 	 	  
 	 	 i n t   c o u n t e r   =   0 ;  
 	 	 f o r   ( I n t e g e r   i n t e g e r   :   s y m e t r i c N u m b e r s )   {  
 	 	 	 S y s t e m . o u t . p r i n t ( i n t e g e r   +   "   " ) ;  
 	 	 	 c o u n t e r + + ;  
 	 	 	 i f   ( c o u n t e r   = =   1 0 )   {  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( ) ;  
 	 	 	 	 c o u n t e r   =   0 ;  
 	 	 	 }  
 	 	 	  
 	 	 }  
 	 	  
 	 	  
 	 	  
 	 	  
 	 }  
  
 }  
 
i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . n i o . c h a r s e t . S t a n d a r d C h a r s e t s ;  
 i m p o r t   j a v a . n i o . f i l e . F i l e s ;  
 i m p o r t   j a v a . n i o . f i l e . P a t h ;  
 i m p o r t   j a v a . n i o . f i l e . P a t h s ;  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
  
 p u b l i c   c l a s s   _ 0 8 S u m N u m b e r s F r o m F i l e   {  
  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   t h r o w s   I O E x c e p t i o n {  
 	 	 L i s t < S t r i n g >   l i n e s L i s t   =   n e w   A r r a y L i s t < S t r i n g > ( ) ;  
 	 	  
 	 	 t r y   {  
 	 	 	 / /   c h a n g e   t h e   p a t h   t o   y o u r ' s    
 	 	 	 S t r i n g   f i l e P a t h   =   " I n p u t . t x t " ; 	 	 	 	 	  
 	 	 	   l i n e s L i s t   =   r e a d T e x t F i l e ( f i l e P a t h ) ;  
 	 	 }   c a t c h   ( E x c e p t i o n   e )   {  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " ( m i s s i n g   f i l e ) " ) ;  
 	 	 	 r e t u r n ;  
 	 	 }  
 	 	  
 	 	 i n t   s u m   =   0 ;  
 	 	 f o r   ( S t r i n g   s t r i n g   :   l i n e s L i s t )   {  
 	 	 	 i n t   n u m b e r   =   I n t e g e r . p a r s e I n t ( s t r i n g ) ;  
 	 	 	 s u m   + =   n u m b e r ;  
 	 	 }  
 	 	 S y s t e m . o u t . p r i n t l n ( " s u m   =   "   +   s u m ) ;  
 	 	  
 	 }  
  
 	 p u b l i c   s t a t i c   L i s t < S t r i n g >   r e a d T e x t F i l e ( S t r i n g   a F i l e N a m e )   t h r o w s   I O E x c e p t i o n   {  
 	         P a t h   p a t h   =   P a t h s . g e t ( a F i l e N a m e ) ;  
 	         r e t u r n   F i l e s . r e a d A l l L i n e s ( p a t h ,   S t a n d a r d C h a r s e t s . U T F _ 8 ) ;  
 	     }  
 	  
 }  
 
i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . n i o . c h a r s e t . S t a n d a r d C h a r s e t s ;  
 i m p o r t   j a v a . n i o . f i l e . P a t h ;  
 i m p o r t   j a v a . n i o . f i l e . P a t h s ;  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . S c a n n e r ;  
  
  
 p u b l i c   c l a s s   _ 1 0 O r d e r O f P r o d u c t s   {  
  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 S t r i n g   i n p u t P A T H   =   " I n p u t 2 . t x t " ;  
 	 	 S t r i n g   o r d e r P a t h   =   " O r d e r . t x t " ;  
 	 	  
 	 	 A r r a y L i s t < P r o d u c t >   p r o d u c t s   =   n e w   A r r a y L i s t < P r o d u c t > ( ) ;  
 	 	 A r r a y L i s t < P r o d u c t >   o r d e r s   =   n e w   A r r a y L i s t < P r o d u c t > ( ) ; 	 	  
 	 	 A r r a y L i s t < S t r i n g >   p r o d u c t L i n e s   =   n e w   A r r a y L i s t < > ( ) ;  
 	 	 A r r a y L i s t < S t r i n g >   o r d e r L i n e s   =   n e w   A r r a y L i s t < > ( ) ;  
 	 	  
 	 	 t r y   {  
 	 	 	 p r o d u c t L i n e s   =   r e a d T e x t F i l e ( i n p u t P A T H ,   p r o d u c t L i n e s ) ;  
 	 	 	 o r d e r L i n e s   =   r e a d T e x t F i l e ( o r d e r P a t h ,   o r d e r L i n e s ) ;  
 	 	 }   c a t c h   ( E x c e p t i o n   e )   {  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " E r r o r   w h i l e   r e a d i n g   f i l e . " ) ;  
 	 	 } 	  
  
 	 	 / /   a d d   r e a d   l i n e s   t o   p r o d u c t s   l i s t  
 	 	 f o r   ( i n t   i   =   0 ;   i   <   p r o d u c t L i n e s . s i z e ( ) ;   i + + )   {  
 	 	 	 S t r i n g [ ]   s p l i t S t r i n g s   =   p r o d u c t L i n e s . g e t ( i ) . s p l i t ( "   " ) ;  
 	 	 	 S t r i n g   p r o d u c t S t r i n g   =   s p l i t S t r i n g s [ 0 ] ;  
 	 	 	 d o u b l e   p r i c e V a l u e   =   D o u b l e . p a r s e D o u b l e ( s p l i t S t r i n g s [ 1 ] ) ;  
 	 	 	  
 	 	 	 p r o d u c t s . a d d ( n e w   P r o d u c t ( p r i c e V a l u e ,   p r o d u c t S t r i n g ) ) ;  
 	 	 }  
 	 	  
 	 	 / /   a d d   r e a d   l i n e s   t o   o r d e r s   l i s t  
 	 	 f o r   ( i n t   i   =   0 ;   i   <   o r d e r L i n e s . s i z e ( ) ;   i + + )   {  
 	 	 	  
 	 	 	 S t r i n g [ ]   s p l i t S t r i n g s   =   o r d e r L i n e s . g e t ( i ) . s p l i t ( "   " ) ;  
 	 	 	 d o u b l e   q u a n t i t y   =   D o u b l e . p a r s e D o u b l e ( s p l i t S t r i n g s [ 0 ] ) ; 	 	 	  
 	 	 	 S t r i n g   o r d e r P r o d u c t S t r i n g   =   s p l i t S t r i n g s [ 1 ] ;  
 	 	 	  
 	 	 	 o r d e r s . a d d ( n e w   P r o d u c t ( o r d e r P r o d u c t S t r i n g ,   q u a n t i t y ) ) ;  
 	 	 }  
 	 	  
 	 	 / / c a l c u l a t e   t o t a l   p r i c e  
 / / 	 	 f o r   ( P r o d u c t   p   :   p r o d u c t s )   {  
 / / 	 	 	 S y s t e m . o u t . p r i n t ( p . g e t I t e m ( )   +   "   " ) ;  
 / / 	 	 	 S y s t e m . o u t . p r i n t l n ( p . g e t P r i c e ( ) ) ;  
 / / 	 	 }  
 / / 	 	 f o r   ( P r o d u c t   p   :   o r d e r s )   {  
 / / 	 	 	 S y s t e m . o u t . p r i n t ( p . g e t I t e m ( )   +   "   " ) ;  
 / / 	 	 	 S y s t e m . o u t . p r i n t l n ( p . g e t Q u a n t i t y ( ) ) ;  
 / / 	 	 }  
 	 	  
 	 	 d o u b l e   s u m   =   0 ; 	 	  
 	 	 f o r   ( i n t   i   =   0 ;   i   <   p r o d u c t s . s i z e ( ) ;   i + + )   {  
 	 	 	 f o r   ( i n t   j   =   0 ;   j   <   o r d e r s . s i z e ( ) ;   j + + )   {  
 	 	 	 	 i f   ( p r o d u c t s . g e t ( i ) . g e t I t e m ( ) . e q u a l s ( o r d e r s . g e t ( j ) . g e t I t e m ( ) ) )   {  
 	 	 	 	 	 s u m   + =     p r o d u c t s . g e t ( i ) . g e t P r i c e ( )   *    
 	 	 	 	 	 	 	 o r d e r s . g e t ( j ) . g e t Q u a n t i t y ( ) ;  
 	 	 	 	 }  
 	 	 	 }  
 	 	 }  
 	 	 S y s t e m . o u t . p r i n t f ( " % . 1 f   \ n " , s u m ) ;  
 	 	  
 	 	  
 	 }  
 	  
 	 p u b l i c   s t a t i c   A r r a y L i s t < S t r i n g >   r e a d T e x t F i l e ( S t r i n g   a F i l e N a m e ,     A r r a y L i s t < S t r i n g >   l i n e s )   t h r o w s   I O E x c e p t i o n   {  
 	         P a t h   p a t h   =   P a t h s . g e t ( a F i l e N a m e ) ;  
 	         t r y   ( S c a n n e r   s c a n n e r   =     n e w   S c a n n e r ( p a t h ,   S t a n d a r d C h a r s e t s . U T F _ 8 . n a m e ( ) ) )   {  
 	             w h i l e   ( s c a n n e r . h a s N e x t L i n e ( ) ) {  
 	         	     l i n e s . a d d ( s c a n n e r . n e x t L i n e ( ) ) ;  
 	             }              
 	         }  
 	         r e t u r n   l i n e s ;  
 	 }  
  
 }  
 
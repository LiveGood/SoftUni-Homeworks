i m p o r t   j a v a . i o . B u f f e r e d W r i t e r ;  
 i m p o r t   j a v a . i o . F i l e N o t F o u n d E x c e p t i o n ;  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
 i m p o r t   j a v a . n i o . c h a r s e t . S t a n d a r d C h a r s e t s ;  
 i m p o r t   j a v a . n i o . f i l e . F i l e s ;  
 i m p o r t   j a v a . n i o . f i l e . P a t h ;  
 i m p o r t   j a v a . n i o . f i l e . P a t h s ;  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . C o l l e c t i o n ;  
 i m p o r t   j a v a . u t i l . C o l l e c t i o n s ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
 i m p o r t   j a v a . u t i l . S c a n n e r ;  
 i m p o r t   j a v a . u t i l . S e t ;  
 i m p o r t   j a v a . u t i l . T r e e M a p ;  
 i m p o r t   j a v a . u t i l . T r e e S e t ;  
  
  
 p u b l i c   c l a s s   _ 0 9 L i s t O f P r o d u c t s   {  
  
 	 p r i v a t e   s t a t i c   f i n a l   S t r i n g   E N C O D I N G   =   n u l l ;  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
  
 	 	 S t r i n g   f i l e P A T H   =   " I n p u t 2 . t x t " ;  
  
 	 	 A r r a y L i s t < P r o d u c t >   p r o d u c t s   =   n e w   A r r a y L i s t < P r o d u c t > ( ) ;  
 	 	 A r r a y L i s t < S t r i n g >   l i n e s   =   n e w   A r r a y L i s t < > ( ) ;  
 	 	 t r y   {  
 	 	 	 l i n e s   =   r e a d L a r g e r T e x t F i l e ( f i l e P A T H ,   l i n e s ) ;  
 	 	 	  
 	 	 }   c a t c h   ( E x c e p t i o n   e )   {  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " E r r o r   w h i l e   r e a d i n g " ) ;  
 	 	 } 	 	 	  
 	 	  
 	 	 f o r   ( i n t   i   =   0 ;   i   <   l i n e s . s i z e ( ) ;   i + + )   {  
 	 	 	 S t r i n g [ ]   s p l i t L i n e   =   l i n e s . g e t ( i ) . s p l i t ( "   " ) ;  
 	 	 	 d o u b l e   p r i c e   =   D o u b l e . p a r s e D o u b l e ( s p l i t L i n e [ 1 ] ) ;  
 	 	 	 p r o d u c t s . a d d ( n e w   P r o d u c t ( p r i c e ,   s p l i t L i n e [ 0 ] ) ) ;  
 	 	 }  
 	 	  
 	 	 C o l l e c t i o n s . s o r t ( p r o d u c t s ) ;  
  
 	 	 / / r u n   t h e   p r o g r a m   o n c e   t o   c r e a t e   t h e   f i l e  
 	 	 t r y   {  
 	 	 	 P r i n t W r i t e r   w r i t e r   =   n e w   P r i n t W r i t e r ( " O u t p u t . t x t " ) ;  
 	 	 	 f o r   ( i n t   i   =   0 ;   i   <   p r o d u c t s . s i z e ( ) ;   i + + )   {  
 	 	 	 	 w r i t e r . p r i n t l n ( p r o d u c t s . g e t ( i ) ) ;  
 	 	 	 }  
 	 	 	 w r i t e r . c l o s e ( ) ;  
 	 	 }   c a t c h   ( F i l e N o t F o u n d E x c e p t i o n   e )   {  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " E r r o r   w h i l e   w r i t i n g   f i l e " ) ;  
 	 	 }  
 	 	  
 	 }  
 	  
 	 / /   r e a d   t e x t   f i l e s  
 	 p u b l i c   s t a t i c   A r r a y L i s t < S t r i n g >   r e a d L a r g e r T e x t F i l e ( S t r i n g   a F i l e N a m e ,     A r r a y L i s t < S t r i n g >   l i n e s )   t h r o w s   I O E x c e p t i o n   {  
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